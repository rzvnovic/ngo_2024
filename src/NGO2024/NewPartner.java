/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

import NGO2024.Validering;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import java.util.*;
import javax.swing.JFrame;
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
public class NewPartner extends javax.swing.JFrame {

    private InfDB idb;
    private static int pid;
    private static int userAid;
    private static Validering validering;

    /**
     * Creates new form newPersonel
     *
     * @throws oru.inf.InfException
     */
    public NewPartner() throws InfException {

        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        contactField = new javax.swing.JTextField();
        contactEmailField = new javax.swing.JTextField();
        contactPhoneField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jLblPersonelDetails = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setText("Name");
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });

        contactField.setText("Contact");
        contactField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactFieldMouseClicked(evt);
            }
        });
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
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

        branchField.setText("Contact field of operations");
        branchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchFieldMouseClicked(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLblPersonelDetails.setText("Personel details");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblPersonelDetails)
                    .addComponent(contactEmailField)
                    .addComponent(contactField)
                    .addComponent(nameField)
                    .addComponent(contactPhoneField)
                    .addComponent(branchField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(cityField)
                    .addComponent(adressField))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblPersonelDetails)
                .addGap(18, 18, 18)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed

    }//GEN-LAST:event_contactFieldActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        if (nameField.getText().equals("Name")) {
            nameField.setText("");
        }

    }//GEN-LAST:event_nameFieldMouseClicked

    private void contactFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactFieldMouseClicked
        if (contactField.getText().equals("Contact")) {
            contactField.setText("");
        }
    }//GEN-LAST:event_contactFieldMouseClicked

    private void contactEmailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactEmailFieldMouseClicked
        if (contactEmailField.getText().equals("email")) {
            contactEmailField.setText("");
        }
    }//GEN-LAST:event_contactEmailFieldMouseClicked

    private void contactPhoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactPhoneFieldMouseClicked
        if (contactPhoneField.getText().equals("Contact field of operations")) {
            contactPhoneField.setText("");
        }
    }//GEN-LAST:event_contactPhoneFieldMouseClicked

    private void branchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchFieldMouseClicked
        if (branchField.getText().equals("Phonenumber")) {
            branchField.setText("");
        }
    }//GEN-LAST:event_branchFieldMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String newName = nameField.getText();
        String newContact = contactField.getText();
        String newEmail = contactEmailField.getText();
        String newPhonenumber = contactPhoneField.getText();
        String newAdress = adressField.getText();
        String newBranch = branchField.getText();
        String newCity = cityField.getText();

        String newPid;
        try {
            newPid = idb.getAutoIncrement("partner", "pid");
            String sqlQuerry = ("INSERT INTO ngo_2024.partner (pid) VALUES (" + newPid + ");");
            idb.insert(sqlQuerry);
            if (Validering.fieldValidation(newName, "Name")) {
                insertValue("namn", newName, newPid);
            }
            if (Validering.fieldValidation(newContact, "Contact")) {
                insertValue("kontaktperson", newContact, newPid);
            }
            if (Validering.fieldValidation(newEmail, "Email")&& Validering.giltigEpost(newEmail)) {
                insertValue("kontaktepost", newEmail, newPid);
            }
            if (Validering.fieldValidation(newPhonenumber, "Phonenumber")) {
                insertValue("telefon", newPhonenumber, newPid);
            }
            if (Validering.fieldValidation(newBranch, "Adress")) {
                insertValue("adress", newAdress, newPid);
            }
            if (Validering.fieldValidation(newBranch, "Contact field of operations")) {
                insertValue("Branch", newBranch, newPid);
            }

            cityValidation(newCity, newPid);
        } catch (InfException ex) {
            Logger.getLogger(NewPartner.class.getName()).log(Level.SEVERE, null, ex);
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

    /*private boolean fieldValidation(String newText, String validationText) {
        boolean validated = true;
        if (newText.equals(validationText) || newText.isEmpty() || newText.isBlank()) {
            return validated = false;
        }
        return validated;
    }*/

    private void insertValue(String column, String value, String newPid) throws InfException{
        String sqlQuerry = ("UPDATE ngo_2024.partner t SET t."+column+" = '" + value + "' WHERE t.pid = " + newPid + ";");
        idb.update(sqlQuerry);
    }

    private void cityValidation(String newCity, String newPid) throws InfException {
        ArrayList<String> cityList = idb.fetchColumn("Select namn from stad;");
        for (String cityName : cityList) {
            if (cityName.equals(newCity)) {
                String sid = idb.fetchSingle("select sid from stad where namn =" + newCity + ";");
                idb.update("UPDATE ngo_2024.partner t SET t.stad = " + sid + " WHERE t.pid = " + newPid + ";");
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
            java.util.logging.Logger.getLogger(NewPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewPartner().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(NewPartner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressField;
    private javax.swing.JTextField branchField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactEmailField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField contactPhoneField;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLblPersonelDetails;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
