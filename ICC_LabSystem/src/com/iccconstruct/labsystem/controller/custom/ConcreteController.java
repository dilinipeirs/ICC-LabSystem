/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller.custom;

import com.iccconstruct.labsystem.controller.SuperController;
import com.iccconstruct.labsystem.dto.ConcreteWorkDTO;
import java.util.ArrayList;

/**
 *
 * @author Dilini Peiris
 */
public interface ConcreteController extends SuperController<ConcreteWorkDTO>{
    public boolean add(ArrayList<ConcreteWorkDTO> dto) throws Exception;
    
    public ArrayList<String> getPDFs() throws Exception;
}
