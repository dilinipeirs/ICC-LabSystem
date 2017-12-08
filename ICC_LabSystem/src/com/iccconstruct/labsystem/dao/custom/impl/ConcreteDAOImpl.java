/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao.custom.impl;

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
public class ConcreteDAOImpl implements ConcreteDAO {

    @Override
    public ArrayList<ConcreteWorkDTO> getAll() throws Exception {
        File path = new File("_concrete");
        File[] listFiles = path.listFiles();
        ArrayList<ConcreteWorkDTO> objs = new ArrayList<>();
        if (listFiles == null) {
            return null;
        } else {
            for (File file : listFiles) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ConcreteWorkDTO dto = (ConcreteWorkDTO) ois.readObject();
                objs.add(dto);
            }
        }

        return objs;
    }

    @Override
    public boolean add(ConcreteWorkDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConcreteWorkDTO search(String id) throws Exception {
        ArrayList<ConcreteWorkDTO> all = getAll();
        for (ConcreteWorkDTO all1 : all) {
            if (id.equals(all1.getConcreteGrade()));
            return all1;
        }
        return null;
    }

    @Override
    public boolean update(ConcreteWorkDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCount() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(ConcreteWorkDTO dto) throws Exception {
        ArrayList<ConcreteWorkDTO> all = getAll();
        for (ConcreteWorkDTO all1 : all) {
            if (dto.getConcreteGrade().equals(all1.getConcreteGrade()));
            return true;
        }
        return false;
    }

}
