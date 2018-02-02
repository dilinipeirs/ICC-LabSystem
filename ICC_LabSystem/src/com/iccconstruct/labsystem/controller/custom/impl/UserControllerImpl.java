/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom.impl;

import com.iccconstruct.labsystem.controller.custom.UserController;
import com.iccconstruct.labsystem.dao.DAOFactory;
import com.iccconstruct.labsystem.dao.custom.UserDAO;
import com.iccconstruct.labsystem.dto.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class UserControllerImpl implements UserController {

    UserDAO userDAO;

    public UserControllerImpl() {
        userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.ControllerTypes.USER);
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        return userDAO.getAll();
    }

    @Override
    public boolean add(UserDTO dto) throws Exception {
        int size = getAll().size();
        dto.setUserID(size++);
        return userDAO.add(dto);
    }

    @Override
    public UserDTO search(String id) throws Exception {
        return userDAO.search(id);
    }
    
    @Override
    public UserDTO search(int id) throws Exception {
        return userDAO.search(id);
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        return userDAO.update(dto);
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(UserDTO dto) throws Exception {
        return userDAO.isExist(dto);
    }

    @Override
    public boolean addMaintainance(UserDTO maintain) throws Exception {
        return userDAO.addMaintainace(maintain);
    }

}
