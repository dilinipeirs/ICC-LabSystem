/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao.custom.impl;

import com.iccconstruct.labsystem.dao.custom.LoginHistoryDAO;
import com.iccconstruct.labsystem.dto.LoginHistoryDTO;
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
public class LoginHistoryDAOImpl implements LoginHistoryDAO {

    @Override
    public ArrayList<LoginHistoryDTO> getAll() throws Exception {
        File path = new File("_data/_loginHis");
        File[] listFiles = path.listFiles();
        ArrayList<LoginHistoryDTO> objs = new ArrayList<>();
        for (File file : listFiles) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            objs.add((LoginHistoryDTO) ois.readObject());
        }
        return objs;
    }

    @Override
    public boolean add(LoginHistoryDTO dto) throws Exception {
        FileOutputStream fos = new FileOutputStream("_data/_loginHis/" + dto.getLogID() + ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dto);

        File file = new File("_data/_loginHis/" + dto.getLogID() + ".ser");
        if (file.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public LoginHistoryDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(LoginHistoryDTO dto) throws Exception {
        if (delete(dto.getLogID()+ "")) {
            return add(dto);
        }
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(LoginHistoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
