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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
        return historyDAO.getAll();
    }

    @Override
    public boolean add(LoginHistoryDTO dto) throws Exception {
        dto.setLogID(getCount()+1);
        LocalDateTime now = LocalDateTime.now();
        dto.setLogIN(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        return historyDAO.add(dto);
    }

    @Override
    public LoginHistoryDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(LoginHistoryDTO dto) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        dto.setLogOut(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("log out time :"+dto.getLogOut());
        return historyDAO.update(dto);
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(LoginHistoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
