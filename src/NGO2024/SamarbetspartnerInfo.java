/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

import NGO2024.PersonalInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import java.util.*;
import javax.swing.JFrame;
import oru.inf.InfException;

/**
 *
 * @author Cyrus
 */
public class SamarbetspartnerInfo extends javax.swing.JFrame {

    private InfDB idb;

    //tas emot från klassen anställd
    private static String pid;
    private static String userAid;
    private static Validering validering;

    /**
     * Creates new form PersonalInfo
     */
    public SamarbetspartnerInfo(String pid, String userAid) throws InfException {
        
        this.userAid = userAid;
        this.pid = pid;
        
        
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
 * metod som ändrar synlighet baserat på userAid.
 */
    public void adminVissebillity() {
        if (validering.checkAdminAid(userAid)) {

        } else {
            nameDisplay.setLocation(nameField.getLocation());

            adminOkButton.setVisible(false);
            deleteButton.setVisible(false);
            nameField.setVisible(false);
            kontaktPersonField.setVisible(false);
            adressField.setVisible(false);
            phoneField.setVisible(false);
            emailField.setVisible(false);
            branchField.setVisible(false);
            cityField.setVisible(false);

        }
    }

    /**
     * metod som söker i databas och returnerar sträng
     * @param select column som skall ändras
     * @param pid rad som skall ändras
     * @return 
     */
    public String setDisplayText1(String select, String pid) {
        String sqlQuerry;
        try {
            String sqlFraga = ("select " + select + " from partner where pid =" + pid + ";");
            sqlQuerry = idb.fetchSingle(sqlFraga);
            System.out.println("Result from database: " + sqlQuerry); // Print the result
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
            return "error";
        }
        return sqlQuerry;
    }
    
    /**
     * metod som söker i databas och returnerar sträng
     * @param select column som skall ändras
     * @param pid rad som skall ändras
     * @return 
     */
    public String setDisplayText2() {
        String sqlQuerry;
        try {
            String sid = idb.fetchSingle("select stad from partner where pid = "+pid+";");
            String sqlFraga = ("select namn from stad where sid = "+ sid +";");
            sqlQuerry = idb.fetchSingle(sqlFraga);
            System.out.println("Result from database: " + sqlQuerry); // Print the result
        } catch (InfException e) { // Print the exception stack trace for debugging
            // Print the exception stack trace for debugging
            return "error";
        }
        return sqlQuerry;
    }
    

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
        kontaktPersonField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        adminOkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactPersonDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        adressDisplay = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        phonenumberDisplay = new javax.swing.JTextPane();
        //TODO programmera en kod som visar display från contact mail
        jScrollPane7 = new javax.swing.JScrollPane();
        emailDisplay = new javax.swing.JTextPane();
        branchField = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        //TODO proggrammera en kod som visar display från branch
        branchDisplay = new javax.swing.JTextPane();
        cityField = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        //TODO proggramera så att City står här
        cityDisplay = new javax.swing.JTextPane();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Information");

        adminOkButton.setText("Ok");
        adminOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminOkButtonActionPerformed(evt);
            }
        });

        nameDisplay.setEditable(false);
        nameDisplay.setText(setDisplayText1("Namn",pid));
        jScrollPane1.setViewportView(nameDisplay);

        contactPersonDisplay.setEditable(false);
        contactPersonDisplay.setText(setDisplayText1("kontaktperson", pid));
        jScrollPane2.setViewportView(contactPersonDisplay);

        adressDisplay.setEditable(false);
        adressDisplay.setText(setDisplayText1("adress", pid));
        jScrollPane3.setViewportView(adressDisplay);

        phonenumberDisplay.setEditable(false);
        phonenumberDisplay.setText(setDisplayText1("telefon" , pid));
        jScrollPane4.setViewportView(phonenumberDisplay);

        emailDisplay.setEditable(false);
        emailDisplay.setText(setDisplayText1("kontaktepost",pid));
        jScrollPane7.setViewportView(emailDisplay);

        branchDisplay.setEditable(false);
        branchDisplay.setText(setDisplayText1("Branch",pid));
        jScrollPane8.setViewportView(branchDisplay);

        cityDisplay.setEditable(false);
        cityDisplay.setText(setDisplayText2());
        jScrollPane6.setViewportView(cityDisplay);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Ta bort");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Namn");

        jLabel3.setText("Kontaktperson");

        jLabel4.setText("Adress");

        jLabel5.setText("Telefon");

        jLabel6.setText("Epost");

        jLabel7.setText("Bransch");

        jLabel8.setText("Stad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityField)
                            .addComponent(branchField)
                            .addComponent(phoneField)
                            .addComponent(emailField)
                            .addComponent(kontaktPersonField)
                            .addComponent(adressField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6)
                        .addComponent(jScrollPane8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kontaktPersonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminOkButton)
                    .addComponent(deleteButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminOkButtonActionPerformed
        
        String newName = nameField.getText().trim();
        String newContact = kontaktPersonField.getText().trim();
        String newAdress = adressField.getText().trim();
        String newPhonenumber = phoneField.getText().trim();
        String newEmail = emailField.getText().trim(); //OBS
        String newBranch = branchField.getText().trim();
        String newCity = cityField.getText().trim();
        String newPid= null;
try{
        if (validering.fieldValidation(newName, "Name")) {
            updateDatabase("namn", newName);
            nameDisplay.setText(newName);
        }
        if (validering.fieldValidation(newContact, "Contact person")) {
            updateDatabase("kontaktperson", newContact);
            contactPersonDisplay.setText(newContact);
        }
        if (validering.fieldValidation(newEmail, "Email") && validering.giltigEpost(newEmail)) {
            updateDatabase("epost", newEmail);
            emailDisplay.setText(newEmail);
        }
        if (validering.fieldValidation(newPhonenumber, "Phonenumber")) {
            updateDatabase("telefon", newPhonenumber);
            phonenumberDisplay.setText(newPhonenumber);
        }
        if (validering.fieldValidation(newAdress, "Adress")) {
            updateDatabase("adress", newAdress);
            adressDisplay.setText(newAdress);
        }
        if (validering.fieldValidation(newCity, "City")) {
        updateDatabase("stad", idb.fetchSingle("select sid from stad where namn = '" + newCity + "';"));
        }
        if (validering.fieldValidation(newBranch, "Branch")) {
            updateDatabase("Branch", newBranch);
            branchDisplay.setText(newBranch);
        }
         } catch (InfException ex) {
                        Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
    }//GEN-LAST:event_adminOkButtonActionPerformed

    /**
     * Metod som updaterar 
     * @param column
     * @param value 
     */
    private void updateDatabase(String column, String value) {
        try {
            String sqlQuerry = ("UPDATE ngo_2024.partner t SET t." + column + " = '" + value + "' WHERE t.pid = " + pid + ";");
            idb.update(sqlQuerry);
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO tar bort profilen ur tabellen genom idb.delete()
        String deletePartner = ("DELETE FROM ngo_2024.partner WHERE pid =" + pid + ";");
        String deletePartnProj = ("DELETE FROM ngo_2024.projekt_partner WHERE partner_pid = " + pid + ";");
        try {
                        idb.delete(deletePartnProj);

            idb.delete(deletePartner);
            
        } catch (InfException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SamarbetspartnerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SamarbetspartnerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SamarbetspartnerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SamarbetspartnerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new SamarbetspartnerInfo(userAid, pid).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(SamarbetspartnerInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminOkButton;
    private javax.swing.JTextPane adressDisplay;
    private javax.swing.JTextField adressField;
    private javax.swing.JTextPane branchDisplay;
    private javax.swing.JTextField branchField;
    private javax.swing.JTextPane cityDisplay;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextPane contactPersonDisplay;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextPane emailDisplay;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kontaktPersonField;
    private javax.swing.JTextPane nameDisplay;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextPane phonenumberDisplay;
    // End of variables declaration//GEN-END:variables
}
