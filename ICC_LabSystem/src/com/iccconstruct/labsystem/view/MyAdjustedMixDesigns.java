/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.view;

import com.iccconstruct.labsystem.controller.ControllerFactory;
import com.iccconstruct.labsystem.controller.custom.FormController;
import com.iccconstruct.labsystem.dto.FormDTO;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dilini Peiris
 */
public class MyAdjustedMixDesigns extends javax.swing.JFrame {

    FormController formController;

    public MyAdjustedMixDesigns() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            setResizable(false);
            setIconImage(Dashboard.image.getImage());
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setTitle("ICC - Lab System - My Mix Designs");
            formController = (FormController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.FORM);
            setTable();

        } catch (Exception ex) {
            Logger.getLogger(MyAdjustedMixDesigns.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcomeText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcomeText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWelcomeText.setText("My Adjusted Mix Designs");

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Submitted Date-Time", "Concrete Grade", "Moisture Content Fine Aggregate", "Moisture Content Coarse Aggregate", "Cement (kg)", "Water (kg)", "Admixture (l)", "Fine aggregate (kg)", "Coarse Aggregate (kg)", "Fly-Ash (kg)", "Silica Fume (kg)", "Cement 1 (kg)", "Cement 2 (kg)", "Ratio (Water:Cement)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1049, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyAdjustedMixDesigns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAdjustedMixDesigns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAdjustedMixDesigns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAdjustedMixDesigns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MyAdjustedMixDesigns().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcomeText;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables

    private void setTable() throws Exception {

        ArrayList<FormDTO> all = formController.getAll();
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);
        for (FormDTO all1 : all) {
            if (all1.getU().getUserID() == Dashboard.user.getUserID()) {
                DateTimeFormatter ofLocalizedDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
                String format = all1.getCreateDateTime().format(ofLocalizedDateTime);
                String rowData[] = {format, all1.getConcreteWorkDTO().getConcreteGrade(), all1.getMoisture_fine().toString(), all1.getMoisture_course().toString(), all1.getConcreteWorkDTO().getCement().toString(), all1.getConcreteWorkDTO().getWater().toString(), all1.getConcreteWorkDTO().getAdmix().toString(), all1.getConcreteWorkDTO().getFine_agg().toString(), all1.getConcreteWorkDTO().getCourse_agg().toString(),
                    all1.getConcreteWorkDTO().getFly_ash().toString(), all1.getConcreteWorkDTO().getSilica_fume().toString(), all1.getConcreteWorkDTO().getCement1().toString(), all1.getConcreteWorkDTO().getCement2().toString(), all1.getConcreteWorkDTO().getRatio().toString()};
                dtm.addRow(rowData);
            }

        }
    }
}
