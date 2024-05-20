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

public class VisaLand extends javax.swing.JFrame {

    private InfDB idb;

    //tas emot från klassen anställd
    private static String lid;
    private static String userAid;
    private static Validering validering;

    /**
     * Creates new form PersonalInfo
     */
    public VisaLand(String lid, String userAid) throws InfException {

        this.userAid = "1"; //såklart inte någon hårdkodning här
        this.lid = "3";     //---------------||-----------------
        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(VisaLand.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        

    }

   
    public String setDisplayText1(String select, String lid) {
        String sqlQuerry;
        try {
            String sqlFraga = ("select " + select + " from land where lid =" + lid + ";");
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
     * @param lid
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
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        languageField = new javax.swing.JTextField();
        currencyField = new javax.swing.JTextField();
        timezoneField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        politicalField = new javax.swing.JTextField();
        commitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        languageDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        currencyDisplay = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        timezoneDisplay = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        politicDisplay = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        economicalDisplay = new javax.swing.JTextPane();
        deleteButton = new javax.swing.JButton();
        economicalField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setText("Name");
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Information");

        languageField.setText("Language");
        languageField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                languageFieldMouseClicked(evt);
            }
        });
        languageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageFieldActionPerformed(evt);
            }
        });

        currencyField.setText("Currency");
        currencyField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currencyFieldMouseClicked(evt);
            }
        });

        timezoneField.setText("Timezone");
        timezoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timezoneFieldMouseClicked(evt);
            }
        });

        politicalField.setText("Political structure");
        politicalField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                politicalFieldMouseClicked(evt);
            }
        });
        politicalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicalFieldActionPerformed(evt);
            }
        });

        commitButton.setText("Ok");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        nameDisplay.setEditable(false);
        nameDisplay.setText(setDisplayText1("namn", lid));
        jScrollPane1.setViewportView(nameDisplay);

        languageDisplay.setEditable(false);
        languageDisplay.setText(setDisplayText1("sprak", lid));
        jScrollPane2.setViewportView(languageDisplay);

        currencyDisplay.setEditable(false);
        currencyDisplay.setText(setDisplayText1("valuta", lid));
        jScrollPane3.setViewportView(currencyDisplay);

        timezoneDisplay.setEditable(false);
        timezoneDisplay.setText(setDisplayText1("tidszon" , lid));
        jScrollPane4.setViewportView(timezoneDisplay);

        politicDisplay.setEditable(false);
        politicDisplay.setText(setDisplayText1("politisk_struktur", lid));
        jScrollPane5.setViewportView(politicDisplay);

        economicalDisplay.setEditable(false);
        economicalDisplay.setText(setDisplayText1(("ekonomi"),lid));
        jScrollPane6.setViewportView(economicalDisplay);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        economicalField.setText("Economical structure");
        economicalField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                economicalFieldMouseClicked(evt);
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
                            .addComponent(nameField)
                            .addComponent(languageField)
                            .addComponent(currencyField)
                            .addComponent(timezoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addComponent(economicalField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(politicalField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jScrollPane4))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timezoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(politicalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(economicalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(commitButton)))
                .addContainerGap(107, Short.MAX_VALUE))
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

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed
    /**
     * knappen gör en del saker kan vara värt att splitta i flera metoder.
     *
     * @param evt
     */
    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed

        String newLandName = nameField.getText();
        String newLanguage = languageField.getText();
        String newCurrency = currencyField.getText();
        String newTimezone = timezoneField.getText();
        String newPolitical = politicalField.getText();
        String newEconomical = economicalField.getText();
        
        //OBS
        if (validering.fieldValidation(newLandName, " name ")) {
            updateDatabase("namn", newLandName, lid);
        }
        if (validering.fieldValidation(newLanguage, "Language ")) {
            updateDatabase("sprak", newLanguage, lid);
        }
        if (validering.fieldValidation(newCurrency, "Currency")) {
            updateDatabase("valuta", newCurrency, lid);
        }
        if (validering.fieldValidation(newTimezone, "Timezone")) {
            updateDatabase("tidszon", newTimezone, lid);
        }
        if (validering.fieldValidation(newPolitical, "Political structure")) {
            updateDatabase("politisk_struktur", newPolitical, lid);
        }
        if (validering.fieldValidation(newEconomical, "Economical Structure")) {
            updateDatabase("ekonomi ", newEconomical, lid);
        }
        
        
        
        //cityValidation(newCity, newAvdid);

        nameDisplay.setText(newLandName);
        languageDisplay.setText(newLanguage);
        currencyDisplay.setText(newCurrency);
        timezoneDisplay.setText(newTimezone);
        politicDisplay.setText(newPolitical);
        economicalDisplay.setText(newEconomical);
        
    


    }//GEN-LAST:event_commitButtonActionPerformed
    /**
     * metod som uppdaterar databasen med information som är inmatat i ett fält.
     *
     * @param column vilken kolumn som bör uppdateras
     * @param value vad cellen skall uppdateras med
     * @param avdid vilken aid som ändringen ska ske på
     */
    private void updateDatabase(String column, String value, String lid) {
        try {
            String sqlQuerry = ("UPDATE ngo_2024.land t SET t."+column + " = '"+value + "' WHERE t.lid = " + lid + ";");
            idb.update(sqlQuerry);
        } catch (InfException ex) {
            Logger.getLogger(VisaLand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        // TODO add your handling code here:
        if (nameField.getText().equals(" Name")) {
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void languageFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_languageFieldMouseClicked
        // TODO add your handling code here:
        if (languageField.getText().equals("language")) {
            languageField.setText("");
        }
    }//GEN-LAST:event_languageFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void currencyFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyFieldMouseClicked
        // TODO add your handling code here:
        if (currencyField.getText().equals("currency")) {
            currencyField.setText("");
        }
    }//GEN-LAST:event_currencyFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void timezoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timezoneFieldMouseClicked
        // TODO add your handling code here:
        if (timezoneField.getText().equals("timezone")) {
            timezoneField.setText("");
        }
    }//GEN-LAST:event_timezoneFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void politicalFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_politicalFieldMouseClicked
        // TODO add your handling code here:
        if (politicalField.getText().equals("political structure")) {
            politicalField.setText("");
        }
    }//GEN-LAST:event_politicalFieldMouseClicked

    /**
     * Metod som tar bort profilen som sökts up.
     *
     * @param evt
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO tar bort profilen ur tabellen genom idb.delete()
        String sqlQueery = ("DELETE FROM ngo_2024.land WHERE lid =" + lid + ";");
        try {
            idb.delete(sqlQueery);
        } catch (InfException ex) {
            Logger.getLogger(VisaLand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void economicalFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_economicalFieldMouseClicked

        // TODO add your handling code here:
        if (politicalField.getText().equals("political structure")) {
            politicalField.setText("");
        }
    }//GEN-LAST:event_economicalFieldMouseClicked

    private void politicalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_politicalFieldActionPerformed

    private void languageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageFieldActionPerformed
    
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
        java.util.logging.Logger.getLogger(VisaLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(VisaLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(VisaLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(VisaLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VisaLand(lid, userAid).setVisible(true);
                Validering validering = new Validering();
            } catch (InfException ex) {
                Logger.getLogger(VisaLand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commitButton;
    private javax.swing.JTextPane currencyDisplay;
    private javax.swing.JTextField currencyField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextPane economicalDisplay;
    private javax.swing.JTextField economicalField;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane languageDisplay;
    private javax.swing.JTextField languageField;
    private javax.swing.JTextPane nameDisplay;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextPane politicDisplay;
    private javax.swing.JTextField politicalField;
    private javax.swing.JTextPane timezoneDisplay;
    private javax.swing.JTextField timezoneField;
    // End of variables declaration//GEN-END:variables
}
