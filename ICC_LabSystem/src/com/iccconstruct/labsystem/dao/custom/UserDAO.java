/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao.custom;

import com.iccconstruct.labsystem.dao.SuperDAO;
import com.iccconstruct.labsystem.dto.UserDTO;

/**
 *
 * @author Dilini Peiris
 */
public interface UserDAO extends SuperDAO<UserDTO>{

    public boolean addMaintainace(UserDTO maintain)throws Exception;
    
}
