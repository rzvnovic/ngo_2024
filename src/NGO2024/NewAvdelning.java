/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import java.util.*;
import oru.inf.InfDB;

/**
 * Klass som lägger till ny personal. TODO Validera altl och tänk ett steg
 * ytterligare på formateringen. Troligen bör den gå igenom någon typ av
 * validering den med. Möjligen att vi skriver att char at index 4/7 MÅSTE vara
 * - Char at 1 , 2 , 3, 5 , 6 , 8, 9 måste vara int eller char 0123456789. Kan
 * göras med en loop! en ifFound loop som returnar true. plus logik WIP
 *
 * @author Cyrus
 * @version 10/05/2024
 */
public class NewAvdelning extends javax.swing.JFrame {

    private InfDB idb;
    private static String pid;
    private static String Avdid;
    private static String userAid;
    private static Validering validering;

    /**
     * Creates new form newPersonel
     *
     * @throws oru.inf.InfException
     */
    public NewAvdelning() throws InfException {

        validering = new Validering();
        
        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        countryButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        contactEmailField = new javax.swing.JTextField();
        contactPhoneField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        lblDepDetails = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        countryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HODfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setText("Name");
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });

        contactEmailField.setText("Email");
        contactEmailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactEmailFieldMouseClicked(evt);
            }
        });

        contactPhoneField.setText("Phonenumber");
        contactPhoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactPhoneFieldMouseClicked(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        lblDepDetails.setText("Department details");

        cityField.setText("City");
        cityField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityFieldMouseClicked(evt);
            }
        });

        adressField.setText("Adress");
        adressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressFieldMouseClicked(evt);
            }
        });

        descriptionField.setText("Description");
        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });

        countryField.setText("Country");
        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });

        countryButton.setText("Add Country and City");
        countryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Can't connect City to Country, check spelling or add new Country");

        HODfield.setText("Head of department");
        HODfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HODfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepDetails)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField)
                                    .addComponent(contactEmailField)
                                    .addComponent(contactPhoneField)
                                    .addComponent(cityField)
                                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HODfield)
                                    .addComponent(countryField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(countryButton)))))
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDepDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(HODfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(countryButton))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        if (nameField.getText().equals("Name")) {
            nameField.setText("");
        }

    }//GEN-LAST:event_nameFieldMouseClicked

    private void contactEmailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactEmailFieldMouseClicked
        if (contactEmailField.getText().equals("email")) {
            contactEmailField.setText("");
        }
    }//GEN-LAST:event_contactEmailFieldMouseClicked

    private void contactPhoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactPhoneFieldMouseClicked
        if (countryField.getText().equals("Head of department")) {
            countryField.setText("");
        }
    }//GEN-LAST:event_contactPhoneFieldMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        try {
            String newName = nameField.getText();
            String newEmail = contactEmailField.getText();
            String newPhonenumber = contactPhoneField.getText();
            String newAdress = adressField.getText();
            String newHOD = countryField.getText();
            String newCity = cityField.getText();
            String newDescription = descriptionField.getText();
            String newCountry = countryField.getText();
            ArrayList<String> countryList = idb.fetchColumn("SELECT namn FROM land;");
            
            for (int i = 0; i < countryList.size(); i++) {
                if (newCountry.equals(countryList.get(i))) {
                    
                    String newAvdid = null;
                    
                    try {
                        newAvdid = idb.getAutoIncrement("avdelning", "Avdid");
                        String sqlQuerry = ("INSERT INTO ngo_2024.avdelning (Avdid) VALUES (" + newAvdid + ");");
                        idb.insert(sqlQuerry);
                        if (Validering.fieldValidation(newName, "Name")) {
                            insertValue("namn", newName, newAvdid);
                        }
                        if (Validering.fieldValidation(newHOD, "head of department")) {
                            insertValue("chef", newHOD, newAvdid);
                        }
                        if (Validering.fieldValidation(newEmail, "Email") && Validering.giltigEpost(newEmail)) {
                            insertValue("epost", newEmail, newAvdid);
                        }
                        if (Validering.fieldValidation(newPhonenumber, "Phonenumber")) {
                            insertValue("telefon", newPhonenumber, newAvdid);
                        }
                        if (Validering.fieldValidation(newAdress, "Adress")) {
                            insertValue("adress", newAdress, newAvdid);
                        }
                        if (Validering.fieldValidation(newCity, "City")) {
                            insertValue("stad", idb.fetchSingle("select sid from stad where namn = "+ newCity+";"), newAvdid);
                        }
                        if (Validering.fieldValidation(newDescription, "Description")) {
                            
                            insertValue("beskrivning", newDescription, newAvdid);
                        }
                        
                    } catch (InfException ex) {
                        Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                countryButton.setVisible(true);
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void cityFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityFieldMouseClicked
        if (cityField.getText().equals("City")) {
            cityField.setText("");
        }
    }//GEN-LAST:event_cityFieldMouseClicked

    private void adressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressFieldMouseClicked
        if (adressField.getText().equals("Adress")) {
            adressField.setText("");
        }
    }//GEN-LAST:event_adressFieldMouseClicked

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryFieldActionPerformed

    private void HODfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HODfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HODfieldActionPerformed

    private void countryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryButtonActionPerformed
        try {
            new NewLand(userAid).setVisible(true);
            // TODO add your handling code here:
        } catch (InfException ex) {
            Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_countryButtonActionPerformed

    private boolean fieldValidation(String newText, String validationText) {
        boolean validated = true;
        if (newText.equals(validationText) || newText.isEmpty() || newText.isBlank()) {
            return validated = false;
        }
        return validated;
    }

    private void insertValue(String column, String value, String newAvdid) throws InfException {
        String sqlQuerry = ("UPDATE ngo_2024.avdelning t SET t." + column + " = '" + value + "' WHERE t.avdid = " + newAvdid + ";");
        idb.update(sqlQuerry);
    }

    private void cityValidation(String newCity, String newAvdid) throws InfException {
        ArrayList<String> cityList = idb.fetchColumn("Select namn from stad;");
        for (String cityName : cityList) {
            if (cityName.equals(newCity)) {
                String sid = idb.fetchSingle("select sid from stad where namn =" + newCity + ";");
                idb.update("UPDATE ngo_2024.avdelning t SET t.stad = " + sid + " WHERE t.avdid = " + newAvdid + ";");
                return;
            }
        }

        //Todo gör synliga rutor
        //alt gör så användaren får mata in land   
    }

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
            java.util.logging.Logger.getLogger(NewAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewAvdelning().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HODfield;
    private javax.swing.JTextField adressField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactEmailField;
    private javax.swing.JTextField contactPhoneField;
    private javax.swing.JButton countryButton;
    private javax.swing.JTextField countryField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDepDetails;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
