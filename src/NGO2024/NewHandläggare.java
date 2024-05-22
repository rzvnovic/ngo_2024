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
public class NewHandläggare extends javax.swing.JFrame {

    private InfDB idb;
    private static int aid;
    private static int userAid;
    private static Validering validering;
   

    /**
     * Creates new form newPersonel
     *
     * @throws oru.inf.InfException
     */
    public NewHandläggare() throws InfException {
        
        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        jLblErrorMessageDate1.setVisible(false);
        jLblErrorMessageDate2.setVisible(false);
        lblErrorMessageAvd1.setVisible(false);
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
        surnameField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneNumField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        lblPersonelDetails = new javax.swing.JLabel();
        jTxtAvdelning = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAvdelningarna = new javax.swing.JTextArea();
        dateOfEmploymentField = new javax.swing.JTextField();
        jLblErrorMessageDate1 = new javax.swing.JLabel();
        lblErrorMessageAvd1 = new javax.swing.JLabel();
        jLblErrorMessageDate2 = new javax.swing.JLabel();
        txtAnsvarsomrade = new javax.swing.JTextField();
        txtMentor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });

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

        adressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressFieldMouseClicked(evt);
            }
        });

        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFieldMouseClicked(evt);
            }
        });

        phoneNumField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNumFieldMouseClicked(evt);
            }
        });

        createButton.setText("Skapa");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        lblPersonelDetails.setText("Skapa ny anställd");

        jTxtAvdelning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtAvdelningMouseClicked(evt);
            }
        });

        jTxtAvdelningarna.setColumns(20);
        jTxtAvdelningarna.setRows(5);
        try{
            jTxtAvdelningarna.setText(fetchAvdelningar());
        }
        catch(Exception e){}
        jScrollPane1.setViewportView(jTxtAvdelningarna);

        dateOfEmploymentField.setText("yyyy-mm-dd");

        jLblErrorMessageDate1.setForeground(new java.awt.Color(255, 0, 0));
        jLblErrorMessageDate1.setText("Felaktigt format på datum, 1111-11-11 har lagts in per automatik.");

        lblErrorMessageAvd1.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessageAvd1.setText("Avdelningen existerar inte. Inget har lagts in. ");

        jLblErrorMessageDate2.setForeground(new java.awt.Color(255, 0, 0));
        jLblErrorMessageDate2.setText("vänligen uppdatera uppgiften i uppdateringsfunktionen.");

        txtMentor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMentorActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Adress");

        jLabel4.setText("Epost");

        jLabel5.setText("Telefonnummer");

        jLabel6.setText("Startdatum");

        jLabel7.setText("Avdelningsnummer");

        jLabel8.setText("Ansvarsområde");

        jLabel9.setText("Mentor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblErrorMessageDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblErrorMessageDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorMessageAvd1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonelDetails)
                            .addComponent(jTxtAvdelning, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(phoneNumField)
                            .addComponent(dateOfEmploymentField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnsvarsomrade)
                            .addComponent(surnameField)
                            .addComponent(nameField)
                            .addComponent(adressField)
                            .addComponent(emailField)
                            .addComponent(txtMentor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPersonelDetails)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfEmploymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnsvarsomrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblErrorMessageDate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblErrorMessageDate2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorMessageAvd1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed

    }//GEN-LAST:event_surnameFieldActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        if (nameField.getText().equals("Förnamn")) {
            nameField.setText("");
        }

    }//GEN-LAST:event_nameFieldMouseClicked

    private void surnameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surnameFieldMouseClicked
        if (surnameField.getText().equals("Efternamn")) {
            surnameField.setText("");
        }
    }//GEN-LAST:event_surnameFieldMouseClicked

    private void adressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressFieldMouseClicked
        if (adressField.getText().equals("Adress")) {
            adressField.setText("");
        }
    }//GEN-LAST:event_adressFieldMouseClicked

    private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseClicked
        if (emailField.getText().equals("Epost")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldMouseClicked

    private void phoneNumFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNumFieldMouseClicked
        if (phoneNumField.getText().equals("Telefon")) {
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
        String newAvdelning = jTxtAvdelning.getText();
        String newMentor = txtMentor.getText();
        String newAnsvarsomrade = txtAnsvarsomrade.getText();
        

        try {
            if (validering.fieldValidation(newAvdelning, "Avdelning")) {
                if (checkValidAvdelning(newAvdelning) == true) {
                    String newAid = idb.getAutoIncrement("anstalld", "aid");
                    String sqlQuerry = ("INSERT INTO ngo_2024.anstalld (aid, avdelning) VALUES (" + newAid + "," + newAvdelning + ");");
                    idb.insert(sqlQuerry);
                    
                    
//använd valideringsklass
                    if (validering.fieldValidation(newName, "Förnamn")) {
                        insertValue("fornamn", newName, newAid);
                    }
                    else {
                        insertValue("fornamn", "ej angivet", newAid);
                    }
                    //använd valideringsklass
                    if (validering.fieldValidation(newSurname, "Efternamn")) {
                        insertValue("efternamn", newSurname, newAid);
                    }
                    else {
                        insertValue("efternamn", "ej angivet", newAid);
                    }
                    //använd valideringsklass, validera datum TODO
                    if (validering.fieldValidation(newAdress, "Adress")) {
                        insertValue("adress", newAdress, newAid);
                    }
                    else {
                        insertValue("adress", "ej angivet", newAid);
                    }
                    //använd valideringsklass, validera datum TODO
                    if (validering.fieldValidation(newEmail, "Epost")) {
                        insertValue("epost", newEmail, newAid);
                    }
                    else {
                        insertValue("epost", "ej angivet", newAid);
                    }
                    //använd valideringsklass
                    if (validering.fieldValidation(newPhonenumber, "Telefon")) {
                        insertValue("telefon", newPhonenumber, newAid);
                    }
                    else {
                        insertValue("telefon", "ej angivet", newAid);
                    }
                    if (validering.fieldValidation(newEmploymentDate, "yyyy-mm-dd") && validering.checkDateFormat(newEmploymentDate)){
                        
                            insertValue("anstallningsdatum", newEmploymentDate, newAid);
                        } 

                    
                    else {
                            jLblErrorMessageDate1.setVisible(true);
                            jLblErrorMessageDate2.setVisible(true);
                            insertValue("anstallningsdatum", "1111-11-11", newAid);
                        }
                    insertValue("losenord", generateNewPassword(), newAid);

                    //makeAdminCheckBox.getAccessibleContext();
                    if (checkValidMentor(newMentor) && validering.fieldValidation(newAnsvarsomrade, "Ansvarsområde")) {
                    String insertIntoHandlaggare = ("INSERT INTO ngo_2024.handlaggare (aid, ansvarighetsomrade, mentor) VALUES (" + newAid + "," + newAnsvarsomrade + "," + newMentor + ")");
                    idb.insert(insertIntoHandlaggare);
                    }
                    else if (checkValidMentor(newMentor) && !validering.fieldValidation(newAnsvarsomrade, "Ansvarsområde")) {
                    String insertIntoHandlaggare = ("INSERT INTO ngo_2024.handlaggare (aid, ansvarighetsomrade, mentor) VALUES (" + newAid + "," + null + "," + newMentor + ")");
                    idb.insert(insertIntoHandlaggare);
                    }
                    else {
                        String insertIntoHandlaggare = ("INSERT INTO ngo_2024.handlaggare (aid, ansvarighetsomrade, mentor) VALUES (" + newAid + "," + null + "," + null + ")");
                        idb.insert(insertIntoHandlaggare);
                    }
                    
                } else {
                    lblErrorMessageAvd1.setVisible(true);
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void jTxtAvdelningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtAvdelningMouseClicked
        // TODO add your handling code here:
        if (jTxtAvdelning.getText().equals("Avdelningsnummer")) {
            jTxtAvdelning.setText("");
        }
    }//GEN-LAST:event_jTxtAvdelningMouseClicked

    private void txtMentorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMentorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMentorActionPerformed

    /**
     * Metod som sätter in värden i databasen på senast skapde rad.
     *
     * @param column
     * @param value
     * @param newAid
     * @throws InfException
     */
    private void insertValue(String column, String value, String newAid) throws InfException {
        String sqlQuerry = ("UPDATE ngo_2024.anstalld t SET t." + column + " = '" + value + "' WHERE t.aid = " + newAid + ";");
        idb.update(sqlQuerry);
    }

    /**
     * Genererar nytt lösenord baserat på random klassen
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

    public String fetchAvdelningar() throws InfException {
        ArrayList<String> avdelningsNamn = idb.fetchColumn("Select namn from avdelning;");
        ArrayList<String> avdelningsNummer = idb.fetchColumn("Select avdid from avdelning;");

        String message = "";
        String contentName = null;
        String contentNumber = null;
        for (int i = 0; i < avdelningsNamn.size(); i++) {
            contentName = avdelningsNamn.get(i);
            contentNumber = avdelningsNummer.get(i);
            message = message + "\n" + contentNumber + "\n" + contentName + "\n";
        }
        return message.trim();
    }

    public Boolean checkValidAvdelning(String avdelning) throws InfException {
        {
            Boolean avdelningExist = false;
            String avdelningsID = "";
            ArrayList<String> avdelningsNummer = idb.fetchColumn("Select avdid from avdelning;");
            for (int i = 0; i < avdelningsNummer.size(); i++) {
                avdelningsID = avdelningsNummer.get(i);
                if (avdelningsID.equals(avdelning)) {
                    avdelningExist = true;
                }
            }
            return avdelningExist;
        }
    }
    
     public Boolean checkValidMentor(String mentor) throws InfException {
        {
            Boolean mentorFound = false;
            String anstalldID = "";
            ArrayList<String> anstalldasID = idb.fetchColumn("Select aid from anstalld;");
            for (int i = 0; i < anstalldasID.size(); i++) {
                anstalldID = anstalldasID.get(i);
                if (anstalldID.equals(mentor)) {
                    mentorFound = true;
                }
            }
            return mentorFound;
        }
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
            java.util.logging.Logger.getLogger(NewHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewHandläggare().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(NewHandläggare.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dateOfEmploymentField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblErrorMessageDate1;
    private javax.swing.JLabel jLblErrorMessageDate2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAvdelning;
    private javax.swing.JTextArea jTxtAvdelningarna;
    private javax.swing.JLabel lblErrorMessageAvd1;
    private javax.swing.JLabel lblPersonelDetails;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField txtAnsvarsomrade;
    private javax.swing.JTextField txtMentor;
    // End of variables declaration//GEN-END:variables
}
