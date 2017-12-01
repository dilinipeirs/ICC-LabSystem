/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.controller;

import com.iccconstruct.labsystem.controller.custom.impl.ConcreteControllerImpl;
import com.iccconstruct.labsystem.controller.custom.impl.FormControllerImpl;
import com.iccconstruct.labsystem.controller.custom.impl.LoginHistoryControllerImpl;
import com.iccconstruct.labsystem.controller.custom.impl.UserControllerImpl;

/**
 *
 * @author Dilini Peiris
 */
public class ControllerFactory {

    private static ControllerFactory controllerFactory;

    private ControllerFactory() {

    }

    public enum ControllerTypes {

        USER, FORM, CONCRETE, LOGIN;
    }

    public static ControllerFactory getInstance() {
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }

    public SuperController getControlelr(ControllerTypes type) {
        switch (type) {
            case USER:
                return new UserControllerImpl();
            case FORM:
                return new FormControllerImpl();
            case CONCRETE:
                return new ConcreteControllerImpl();
            case LOGIN:
                return new LoginHistoryControllerImpl();
        }

        return null;
    }

}
