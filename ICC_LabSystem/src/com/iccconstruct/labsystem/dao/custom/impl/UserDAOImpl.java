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
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        File path = new File("_data/_user");
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
        FileOutputStream fos = new FileOutputStream("_data/_user/" + dto.getUserID() + ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dto);

        File file = new File("_data/_user/" + dto.getUserID() + ".ser");
        if (file.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public UserDTO search(String id) throws Exception {
        ArrayList<UserDTO> all = getAll();
        for (UserDTO all1 : all) {
            if (all1.getUsername().equals(id) || all1.getUserID()==Integer.parseInt(id)) {
                return all1;
            }

        }
        return null;
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        if (delete(dto.getUserID() + "")) {
            return add(dto);
        }
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        File file = new File("_data/_user/" + id + ".ser");
        return file.delete();
    }

    @Override
    public boolean isExist(UserDTO dto) throws Exception {
        ArrayList<UserDTO> all = getAll();
        if (all == null) {
            return false;
        }
        for (UserDTO all1 : all) {
            if (all1.getUsername().equals(dto.getUsername()) && all1.getPassword().equals(dto.getPassword()) && all1.getUserType().equals(dto.getUserType())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean addMaintainace(UserDTO maintain) throws Exception {
        File file = new File("_data/_user/" + maintain.getUserID() + ".ser");
//        file.setReadOnly();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(maintain);

        return file.exists();

    }

}
