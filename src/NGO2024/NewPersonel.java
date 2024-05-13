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
public class NewPersonel extends javax.swing.JFrame {

    private InfDB idb;
    private static int aid;
    private static int userAid;
    private static Validering validering;

    /**
     * Creates new form newPersonel
     *
     * @throws oru.inf.InfException
     */
    public NewPersonel() throws InfException {

        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

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
        surnameField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneNumField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        makeAdminCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        dateOfEmploymentField = new javax.swing.JFormattedTextField();
        formatText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setText("Name");
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });

        surnameField.setText("Surname");
        surnameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                surnameFieldMouseClicked(evt);
            }
        });
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        adressField.setText("Adress");
        adressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressFieldMouseClicked(evt);
            }
        });

        emailField.setText("Email");
        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFieldMouseClicked(evt);
            }
        });

        phoneNumField.setText("Phonenumber");
        phoneNumField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNumFieldMouseClicked(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        makeAdminCheckBox.setText("Admin");

        jLabel1.setText("Personel details");

        dateOfEmploymentField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        dateOfEmploymentField.setText("Date of employment");

        formatText.setText("yyyy-mm-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(makeAdminCheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateOfEmploymentField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneNumField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formatText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfEmploymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(makeAdminCheckBox)
                .addGap(4, 4, 4)
                .addComponent(createButton)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed

    }//GEN-LAST:event_surnameFieldActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        if (nameField.getText().equals("Name")) {
            nameField.setText("");
        }

    }//GEN-LAST:event_nameFieldMouseClicked

    private void surnameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surnameFieldMouseClicked
        if (surnameField.getText().equals("Surname")) {
            surnameField.setText("");
        }
    }//GEN-LAST:event_surnameFieldMouseClicked

    private void adressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressFieldMouseClicked
        if (adressField.getText().equals("Adress")) {
            adressField.setText("");
        }
    }//GEN-LAST:event_adressFieldMouseClicked

    private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseClicked
        if (emailField.getText().equals("Email")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldMouseClicked

    private void phoneNumFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNumFieldMouseClicked
        if (phoneNumField.getText().equals("Phonenumber")) {
            phoneNumField.setText("");
        }
    }//GEN-LAST:event_phoneNumFieldMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String newName = nameField.getText();
        String newSurname = surnameField.getText();
        String newAdress = adressField.getText();
        String newEmail = emailField.getText();
        String newPhonenumber = phoneNumField.getText();
        String newEmploymentDate = dateOfEmploymentField.getText();

        
        
        if ((!newName.equals("Name")
                && !newSurname.equals("Surname")
                && !newAdress.equals("Adress")
                && !newPhonenumber.equals("Phonenumber")
                && !newEmploymentDate.equals("Date of employment")
                && !newEmail.equals("Email"))) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_createButtonActionPerformed
    /**
     * Metod som lägger till uppgifter i databasen TODO om knappen är incheckad
     * så ska personen läggas till i ADMIN om ej incheckad så i handläggare TODO
     * validera DATUM och EPOST TODO testa om det fungerar, speciellt AID
     * (idb.getAutoIncrement()) TODO ändra namn
     *
     * @param newName
     * @param newSurname
     * @param newAdress
     * @param newEmail
     * @param newPhonenumber
     * @param newDateOfEmployment
     * @param newAvdelning
     */
    private void updateDatabase(String newName,
            String newSurname, String newAdress,
            String newEmail,
            String newPhonenumber,
            String newDateOfEmployment,
            String newAvdelning) {
        if (!newName.equals("Name")
                && !newSurname.equals("Surname")
                && !newAdress.equals("Adress")
                && !newPhonenumber.equals("Phonenumber")
                && !newEmail.equals("Email")) {
            try {
                String sqlQuerry = ("INSERT INTO ngo_2024.anstalld "
                        + "(aid, fornamn, efternamn, adress, epost, telefon,"
                        + " anstallningsdatum, losenord, avdelning) VALUES '"
                        + idb.getAutoIncrement("anstalld", "aid") + "'"
                        + newName + "'" + newSurname + "'" + newAdress + "'"
                        + newEmail + "'" + newPhonenumber + "'"
                        + newDateOfEmployment + "'"
                        + generateNewPassword() + "'" + newAvdelning + "');");

                idb.insert(sqlQuerry);
            } catch (InfException ex) {
                Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Genererar nytt lösenord baserat på random metoden
     *
     * @return nyttLösenord
     */
    private String generateNewPassword() {
        // TODO add your handling code here:
        // TODO PROGRAMMERA SÅ ETT RANDOM LÖSEN SKAPAS OCH LÄGG IN I DATABAS UNDER RÄTT AID.
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        String allChars = lowercase + uppercase + numbers;

        Random r = new Random();

        String newPassword = "" + allChars.charAt(r.nextInt(0, allChars.length()));
        for (int i = 0; i < 12; i++) {
            int numb = r.nextInt(0, allChars.length());
            newPassword = newPassword + allChars.charAt(numb);
        }
        return newPassword;
    }

    private boolean fieldValidation(String newText, String validationText) {
        boolean validated = true;
        if (newText.equals(validationText) || newText.isEmpty() || newText.isBlank()) {
            return validated = false;
        }
        return validated;
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
            java.util.logging.Logger.getLogger(NewPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewPersonel().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(NewPersonel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressField;
    private javax.swing.JButton createButton;
    private javax.swing.JFormattedTextField dateOfEmploymentField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel formatText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox makeAdminCheckBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
