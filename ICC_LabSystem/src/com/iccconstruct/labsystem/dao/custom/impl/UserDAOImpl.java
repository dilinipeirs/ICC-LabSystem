/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao.custom.impl;

import com.iccconstruct.labsystem.dao.custom.UserDAO;
import com.iccconstruct.labsystem.dto.UserDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        File path = new File("_user");
        File[] listFiles = path.listFiles();
        ArrayList<UserDTO> objs = new ArrayList<>();
        for (File file : listFiles) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            objs.add((UserDTO) ois.readObject());
        }
        return objs;
    }

    @Override
    public boolean add(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(ArrayList<UserDTO> dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(UserDTO dto, String oldID) throws Exception {
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
    public boolean isExist(UserDTO dto) throws Exception {
        ArrayList<UserDTO> all = getAll();
        for (UserDTO all1 : all) {
            if (all1.getUsername().equals(dto.getUsername()) && all1.getPassword().equals(dto.getPassword())) {
                return true;
            }

        }
        return false;
    }

}
