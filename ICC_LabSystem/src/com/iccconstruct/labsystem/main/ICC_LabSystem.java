/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.main;

import java.io.File;

/**
 *
 * @author Dilini Peiris
 */
public class ICC_LabSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean create = createDirectory();
        if(create){
            System.out.println("directories all created");
        }else{
            System.out.println("directories are not done");
        }

    }

    private static boolean createDirectory() {
        File mainDir = new File("_data");
        if (!mainDir.exists()) {
            mainDir.mkdir();
        }

        File userDir = new File("_data/_user");
        if (!userDir.exists()) {
            userDir.mkdir();
        }
        File loginDir = new File("_data/_loginHis");
        if (!loginDir.exists()) {
            loginDir.mkdir();
        }
        File concreteDir = new File("_data/_concrete");
        if (!concreteDir.exists()) {
            concreteDir.mkdir();
        }
        File formDir = new File("_data/_form");
        if (!formDir.exists()) {
            formDir.mkdir();
        }

        return mainDir.exists() && userDir.exists() && loginDir.exists() && concreteDir.exists() && formDir.exists();
    }

}
