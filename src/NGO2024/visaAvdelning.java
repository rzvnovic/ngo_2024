/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;

/**
 * Klass som öppnar fönster för personalinfo med vissa gömda åtkomster för
 * handledare. TODO: all data bör valideras genom valideringsklass.
 *
 * @author Cyrus 08/05/2024
 * @version 10/05/2024
 */

public class visaAvdelning extends javax.swing.JFrame {

    private InfDB idb;

    //tas emot från klassen anställd
    private static String avdid;
    private static String userAid;
    private static validering validering;

    /**
     * Creates new form PersonalInfo
     */
    public visaAvdelning(String avdid, String userAid) throws InfException {

        this.userAid = "1"; //såklart inte någon hårdkodning här
        this.avdid = "3";     //---------------||-----------------
        validering = new validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(visaAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        

    }

   
    public String setDisplayText1(String select, String avdid) {
        String sqlQuerry;
        try {
            String sqlFraga = ("select " + select + " from avdelning where avdid =" + avdid + ";");
            sqlQuerry = idb.fetchSingle(sqlFraga);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return sqlQuerry;
    }

    /**
     * metod som tar emot aid och returnerar en sträng baserat på validering
     * klassens checkAdminAid
     *
     * @param avdid
     * @return isAdmin om admin, isNotAdmin om not admin
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        avdelningNField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        desField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        commitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        avdelningDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        desDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        adressDisplay = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        phonenumberDisplay = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        emailDisplay = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        cityDisplay = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        chefDisplay = new javax.swing.JTextPane();
        deleteButton = new javax.swing.JButton();
        cityField = new javax.swing.JTextField();
        chefField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avdelningNField.setText("Department Name");
        avdelningNField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avdelningNFieldMouseClicked(evt);
            }
        });
        avdelningNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avdelningNFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Information");

        desField.setText("Description");
        desField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desFieldMouseClicked(evt);
            }
        });

        adressField.setText("Adress");
        adressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressFieldMouseClicked(evt);
            }
        });

        phoneField.setText("Phonenumber");
        phoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneFieldMouseClicked(evt);
            }
        });

        emailField.setText("Email");
        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFieldMouseClicked(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        commitButton.setText("Ok");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        avdelningDisplay.setEditable(false);
        avdelningDisplay.setText(setDisplayText1("namn", avdid));
        jScrollPane1.setViewportView(avdelningDisplay);

        desDisplay.setEditable(false);
        desDisplay.setText(setDisplayText1("beskrivning", avdid));
        jScrollPane2.setViewportView(desDisplay);

        adressDisplay.setEditable(false);
        adressDisplay.setText(setDisplayText1("adress", avdid));
        jScrollPane3.setViewportView(adressDisplay);

        phonenumberDisplay.setEditable(false);
        phonenumberDisplay.setText(setDisplayText1("telefon" , avdid));
        jScrollPane4.setViewportView(phonenumberDisplay);

        emailDisplay.setEditable(false);
        emailDisplay.setText(setDisplayText1("epost", avdid));
        jScrollPane5.setViewportView(emailDisplay);

        cityDisplay.setEditable(false);
        cityDisplay.setText(setDisplayText1(("stad"),avdid));
        jScrollPane6.setViewportView(cityDisplay);

        chefDisplay.setEditable(false);
        chefDisplay.setText(setDisplayText1("avdid", avdid));
        jScrollPane7.setViewportView(chefDisplay);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cityField.setText("City");
        cityField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityFieldMouseClicked(evt);
            }
        });

        chefField.setText("Boss");
        chefField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chefFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avdelningNField)
                            .addComponent(desField)
                            .addComponent(adressField)
                            .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chefField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avdelningNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chefField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(commitButton)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avdelningNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avdelningNFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avdelningNFieldActionPerformed
    /**
     * knappen gör en del saker kan vara värt att splitta i flera metoder.
     *
     * @param evt
     */
    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed

        String newAvName = avdelningNField.getText();
        String newDescription = desField.getText();
        String newAdress = adressField.getText();
        String newPhonenumber = phoneField.getText();
        String newEmail = emailField.getText();
        String newCity = cityField.getText();
        String newChef = chefField.getText();
        //OBS
        String newAvdid = null;
        try {
            newAvdid = idb.getAutoIncrement("avdelning", "Avdid");
            String sqlQuerry = ("INSERT INTO ngo_2024.avdelning (Avdid) VALUES (" + newAvdid + ");");
            idb.insert(sqlQuerry);
            if (validering.fieldValidation(newAvName, "Department Name")) {
                updateDatabase("namn", newAvName, newAvdid);
            }
            if (validering.fieldValidation(newDescription, "Description ")) {
                updateDatabase("beskrivning", newDescription, newAvdid);
            }
            if (validering.fieldValidation(newEmail, "Email") && validering.giltigEpost(newEmail)) {
                updateDatabase("epost", newEmail, newAvdid);
            }
            if (validering.fieldValidation(newPhonenumber, "Phonenumber")) {
                updateDatabase("telefon", newPhonenumber, newAvdid);
            }
            if (validering.fieldValidation(newAdress, "Adress")) {
                updateDatabase("adress", newAdress, newAvdid);
            }
            if (validering.fieldValidation(newCity, "City")) {
                updateDatabase("stad", newCity, newAvdid);
            }
            if (validering.fieldValidation(newChef, "Boss")) {
                updateDatabase("chef", newChef, newAvdid);
            }

            //cityValidation(newCity, newAvdid);
        } catch (InfException ex) {
            Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }

        avdelningDisplay.setText(newAvName);
        desDisplay.setText(newDescription);
        adressDisplay.setText(newAdress);
        phonenumberDisplay.setText(newPhonenumber);
        emailDisplay.setText(newEmail);
        cityDisplay.setText(newCity);
        chefDisplay.setText(newChef);
    


    }//GEN-LAST:event_commitButtonActionPerformed
    /**
     * metod som uppdaterar databasen med information som är inmatat i ett fält.
     *
     * @param column vilken kolumn som bör uppdateras
     * @param value vad cellen skall uppdateras med
     * @param avdid vilken aid som ändringen ska ske på
     */
    private void updateDatabase(String column, String value, String avdid) {
        try {
            String sqlQuerry = ("UPDATE ngo_2024.avdelning t SET t."+column + " = '"+value + "' WHERE t.avdid = " + avdid + ";");
            idb.update(sqlQuerry);
        } catch (InfException ex) {
            Logger.getLogger(visaAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void avdelningNFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avdelningNFieldMouseClicked
        // TODO add your handling code here:
        if (avdelningNField.getText().equals("Department Name")) {
            avdelningNField.setText("");
        }
    }//GEN-LAST:event_avdelningNFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void desFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desFieldMouseClicked
        // TODO add your handling code here:
        if (desField.getText().equals("Description")) {
            desField.setText("");
        }
    }//GEN-LAST:event_desFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void adressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressFieldMouseClicked
        // TODO add your handling code here:
        if (adressField.getText().equals("Adress")) {
            adressField.setText("");
        }
    }//GEN-LAST:event_adressFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void phoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseClicked
        // TODO add your handling code here:
        if (phoneField.getText().equals("Phonenumber")) {
            phoneField.setText("");
        }
    }//GEN-LAST:event_phoneFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseClicked
        // TODO add your handling code here:
        if (emailField.getText().equals("Email")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldMouseClicked

    /**
     * Metod som tar bort profilen som sökts up.
     *
     * @param evt
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO tar bort profilen ur tabellen genom idb.delete()
        String sqlQueery = ("DELETE FROM ngo_2024.avdelning WHERE avdid =" + avdid + ";");
        try {
            idb.delete(sqlQueery);
        } catch (InfException ex) {
            Logger.getLogger(visaAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cityFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityFieldMouseClicked

        // TODO add your handling code here:
        if (emailField.getText().equals("City")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_cityFieldMouseClicked

    private void chefFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chefFieldMouseClicked
        // TODO add your handling code here:
        if (emailField.getText().equals("Boss")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_chefFieldMouseClicked

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    InfDB idb = null;
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
        java.util.logging.Logger.getLogger(visaAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(visaAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(visaAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(visaAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
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
                new visaAvdelning(avdid, userAid).setVisible(true);
                validering validering = new validering();
            } catch (InfException ex) {
                Logger.getLogger(visaAvdelning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane adressDisplay;
    private javax.swing.JTextField adressField;
    private javax.swing.JTextPane avdelningDisplay;
    private javax.swing.JTextField avdelningNField;
    private javax.swing.JTextPane chefDisplay;
    private javax.swing.JTextField chefField;
    private javax.swing.JTextPane cityDisplay;
    private javax.swing.JTextField cityField;
    private javax.swing.JButton commitButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextPane desDisplay;
    private javax.swing.JTextField desField;
    private javax.swing.JTextPane emailDisplay;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextPane phonenumberDisplay;
    // End of variables declaration//GEN-END:variables
}
