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
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public class ConcreteDAOImpl implements ConcreteDAO {

    @Override
    public ArrayList<ConcreteWorkDTO> getAll() throws Exception {
        File path = new File("_data/_concrete");
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
        FileOutputStream fos = new FileOutputStream("_data/_concrete/" + dto.getConcreteGrade()+ ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dto);

        File file = new File("_data/_concrete/" + dto.getConcreteGrade()+ ".ser");
        if (file.exists()) {
            return true;
        }
        return false;
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
        boolean delete = delete(dto.getConcreteGrade());
        if(delete){
            return add(dto);
        }
        return delete;
    }

    @Override
    public boolean delete(String id) throws Exception {
        File f = new File("_data/_concrete/"+id+".ser");
        return f.delete();
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
