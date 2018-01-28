/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao.custom.impl;

import com.iccconstruct.labsystem.dao.custom.FormDAO;
import com.iccconstruct.labsystem.dto.FormDTO;
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
public class FormDAOImpl implements FormDAO {

    @Override
    public ArrayList<FormDTO> getAll() throws Exception {
        File path = new File("_data/_form");
        File[] listFiles = path.listFiles();
        ArrayList<FormDTO> objs = new ArrayList<>();
        if (listFiles == null) {
            return null;
        } else {
            for (File file : listFiles) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                FormDTO dto = (FormDTO) ois.readObject();
                objs.add(dto);
            }
        }
        return objs;
    }

    @Override
    public boolean add(FormDTO dto) throws Exception {
        FileOutputStream fos = new FileOutputStream("_data/_form/" + dto.getFormID() + ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dto);

        File file = new File("_data/_form/" + dto.getFormID() + ".ser");
        if (file.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public FormDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FormDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExist(FormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
