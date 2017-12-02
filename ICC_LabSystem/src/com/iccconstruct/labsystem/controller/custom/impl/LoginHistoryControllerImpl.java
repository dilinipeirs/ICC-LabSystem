/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom.impl;

import com.iccconstruct.labsystem.controller.custom.LoginHistoryController;
import com.iccconstruct.labsystem.dao.DAOFactory;
import com.iccconstruct.labsystem.dao.custom.LoginHistoryDAO;
import com.iccconstruct.labsystem.dto.LoginHistoryDTO;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class LoginHistoryControllerImpl implements LoginHistoryController {

    LoginHistoryDAO historyDAO;

    public LoginHistoryControllerImpl() {
        historyDAO = (LoginHistoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.ControllerTypes.LOGIN);
    }

    @Override
    public ArrayList<LoginHistoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(LoginHistoryDTO dto) throws Exception {
        return historyDAO.add(dto);
    }

    @Override
    public boolean add(ArrayList<LoginHistoryDTO> dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoginHistoryDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(LoginHistoryDTO dto, String oldID) throws Exception {
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
    public boolean isExist(LoginHistoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
