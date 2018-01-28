/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.main;

import com.iccconstruct.labsystem.controller.ControllerFactory;
import com.iccconstruct.labsystem.controller.custom.ConcreteController;
import com.iccconstruct.labsystem.dto.ConcreteWorkDTO;
import com.iccconstruct.labsystem.view.Dashboard;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilini Peiris
 */
public class ICC_LabSystem {

    private ConcreteController concreteController;

    public ICC_LabSystem() {
        concreteController = (ConcreteController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.CONCRETE);
    }

    public static void main(String[] args) {

        try {
            boolean create = createDirectory();
            boolean addMixDesign = addMixDesigns();
            if (create && addMixDesign) {
                System.out.println("directories all created");
            } else {
                JOptionPane.showMessageDialog(null, "There was an error at Application Start Up. Please Contact System Support", "Error! Cannot Start Application", JOptionPane.ERROR_MESSAGE);
                System.out.println("directories are not done");
            }

            new Dashboard().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ICC_LabSystem.class.getName()).log(Level.SEVERE, null, ex);
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

    private static boolean addMixDesigns() throws Exception {
        ICC_LabSystem icc_LabSystem = new ICC_LabSystem();
        if (icc_LabSystem.concreteController.getCount() == 0) {
            System.out.println(160 / 270.0);
            DecimalFormat newFormat = new DecimalFormat("#.##");
            System.out.println("creating the mix designs...");
            ArrayList<ConcreteWorkDTO> list = new ArrayList<>();
            list.add(new ConcreteWorkDTO("C40@28 Days", 270.0, 160.0, 4.05, 830.0, 1020.0, 180.0, 0.0, Double.valueOf(newFormat.format(160 / (270.0+180.0+0.0)))));
            list.add(new ConcreteWorkDTO("C40@56 Days", 320.0, 160.0, 4.50, 800.0, 1055.0, 135.0, 0.0, Double.valueOf(newFormat.format(160 / (320.0+135.0+0)))));
            list.add(new ConcreteWorkDTO("C50@56 Days", 290.0, 165.0, 4.90, 820.0, 1000.0, 195.0, 0.0, Double.valueOf(newFormat.format(165 / (290.0+195+0)))));
            list.add(new ConcreteWorkDTO("C50@28 Days", 340.0, 160.0, 4.90, 785.0, 1040.0, 145.0, 0.0, Double.valueOf(newFormat.format(160 / (340.0+145+0)))));
            list.add(new ConcreteWorkDTO("C70@28 Days - 1", 440.0, 160.0, 5.70, 730.0, 1010.0, 100.0, 30.0, Double.valueOf(newFormat.format(160 / (440.0+100+30)))));
            list.add(new ConcreteWorkDTO("C70@28 Days - 2", 430.0, 160.0, 5.70, 730.0, 1010.0, 100.0, 40.0, Double.valueOf(newFormat.format(160 / (430.0+100+40)))));

            boolean add = icc_LabSystem.concreteController.add(list);
            if (add) {
                System.out.println("concrete designs added");
            } else {
                System.out.println("cudnt add concrete grades");
            }
            return add;
        } else {
            System.out.println("designs already created");
            return true;
        }

    }

}
