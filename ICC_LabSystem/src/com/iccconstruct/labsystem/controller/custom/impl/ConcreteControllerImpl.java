/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom.impl;

import com.iccconstruct.labsystem.controller.custom.ConcreteController;
import com.iccconstruct.labsystem.dao.DAOFactory;
import com.iccconstruct.labsystem.dao.custom.ConcreteDAO;
import com.iccconstruct.labsystem.dto.ConcreteWorkDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class ConcreteControllerImpl implements ConcreteController {

    ConcreteDAO concreteDAO;

    public ConcreteControllerImpl() {
        concreteDAO = (ConcreteDAO) DAOFactory.getInstance().getDAO(DAOFactory.ControllerTypes.CONCRETE);
    }

    @Override
    public ArrayList<ConcreteWorkDTO> getAll() throws Exception {
        return concreteDAO.getAll();
    }

    @Override
    public boolean add(ConcreteWorkDTO dto) throws Exception {
        return concreteDAO.add(dto);
    }

    @Override
    public ConcreteWorkDTO search(String id) throws Exception {
        return concreteDAO.search(id);
    }

    @Override
    public boolean update(ConcreteWorkDTO dto) throws Exception {
        return concreteDAO.update(dto);
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(ConcreteWorkDTO dto) throws Exception {
        return concreteDAO.isExist(dto);
    }

    @Override
    public boolean add(ArrayList<ConcreteWorkDTO> dto) throws Exception {
        for (ConcreteWorkDTO dto1 : dto) {
            boolean add = add(dto1);
            if (!add) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ArrayList<String> getPDFs() throws Exception {
        File path = new File("src/com/iccconstruct/labsystem/resources/pdf-mix designs");
        File[] listFiles = path.listFiles();
        ArrayList<String> objs = new ArrayList<>();
        if (listFiles == null) {
            return null;
        } else {
            for (File file : listFiles) {
                objs.add(file.getName());
                System.out.println(file.getName());
            }
        }

        return objs;
    }

}
