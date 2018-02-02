/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom;

import com.iccconstruct.labsystem.controller.SuperController;
import com.iccconstruct.labsystem.dto.UserDTO;

/**
 *
 * @author Dilini Peiris
 */
public interface UserController extends SuperController<UserDTO>{

    public boolean addMaintainance(UserDTO maintain)throws Exception;
    public UserDTO search(int id) throws Exception;
}
