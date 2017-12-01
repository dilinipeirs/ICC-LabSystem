/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.dao;

import com.iccconstruct.labsystem.dao.custom.impl.ConcreteDAOImpl;
import com.iccconstruct.labsystem.dao.custom.impl.FormDAOImpl;
import com.iccconstruct.labsystem.dao.custom.impl.LoginHistoryDAOImpl;
import com.iccconstruct.labsystem.dao.custom.impl.UserDAOImpl;

/**
 *
 * @author Dilini Peiris
 */
public class DAOFactory {
    private static DAOFactory controllerFactory;

    private DAOFactory() {

    }

    public enum ControllerTypes {

        USER, FORM, CONCRETE, LOGIN;
    }

    public static DAOFactory getInstance() {
        if (controllerFactory == null) {
            controllerFactory = new DAOFactory();
        }
        return controllerFactory;
    }

    public SuperDAO getControlelr(ControllerTypes type) {
        switch (type) {
            case USER:
                return new UserDAOImpl();
            case FORM:
                return new FormDAOImpl();
            case CONCRETE:
                return new ConcreteDAOImpl();
            case LOGIN:
                return new LoginHistoryDAOImpl();
        }

        return null;
    }
}
