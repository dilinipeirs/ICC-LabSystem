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
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class ConcreteControllerImpl implements ConcreteController{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(ArrayList<ConcreteWorkDTO> dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConcreteWorkDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(ConcreteWorkDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCount() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(ConcreteWorkDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
