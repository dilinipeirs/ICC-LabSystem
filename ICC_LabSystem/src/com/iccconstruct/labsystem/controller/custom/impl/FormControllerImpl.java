/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom.impl;

import com.iccconstruct.labsystem.controller.custom.FormController;
import com.iccconstruct.labsystem.dao.DAOFactory;
import com.iccconstruct.labsystem.dao.custom.FormDAO;
import com.iccconstruct.labsystem.dto.FormDTO;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class FormControllerImpl implements FormController {

    FormDAO formDAO;

    public FormControllerImpl() {
        formDAO = (FormDAO) DAOFactory.getInstance().getDAO(DAOFactory.ControllerTypes.FORM);
    }

    @Override
    public ArrayList<FormDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(FormDTO dto) throws Exception {
        dto.setFormID(getCount()+1);
        return formDAO.add(dto);
    }

    @Override
    public FormDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(FormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
