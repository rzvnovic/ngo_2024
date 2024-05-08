/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * Klass som öppnar fönster för personalinfo med vissa gömda åtkomster för
 * handledare.
 * TODO: all data bör valideras genom valideringsklass.
 * 
 * @author Cyrus
 * 08/05/2024
 */
public class PersonalInfo extends javax.swing.JFrame {

    private InfDB idb;

    //tas emot från klassen anställd
    private static int aid;

    /**
     * Creates new form PersonalInfo
     */
    public PersonalInfo(int aid) throws InfException {
        this.aid = aid;
        idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        initComponents();

    }

    public String setDisplayText() {
        String name;
        try {
            String sqlFraga = ("select fornamn from anstalld where aid = 1");
            name = idb.fetchSingle(sqlFraga);
            System.out.println("Result from database: " + name); // Print the result
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
            return "error";
        }
        return name;
    }

    public String setDisplayText1(String select, int aid) {
        String sqlQuerry;
        try {
            String sqlFraga = ("select " + select + " from anstalld where aid =" + aid + ";");
            sqlQuerry = idb.fetchSingle(sqlFraga);
            System.out.println("Result from database: " + sqlQuerry); // Print the result
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
            return "error";
        }
        return sqlQuerry;
    }
    
    public String setNewData(String select, int aid) {
     
        return "abd";
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
        surnameField = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        makeAdminBox = new javax.swing.JCheckBox();
        commitButton = new javax.swing.JButton();
        adminOkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        surnameDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        adressDisplay = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        phonenumberDisplay = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        emailDisplay = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        isAdminDisplay = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        employeeIdDisplay = new javax.swing.JTextPane();
        generateNewPassword = new javax.swing.JToggleButton();
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

        makeAdminBox.setText("Admin");

        commitButton.setText("Ok");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        adminOkButton.setText("Ok");
        adminOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminOkButtonActionPerformed(evt);
            }
        });

        nameDisplay.setEditable(false);
        nameDisplay.setText(setDisplayText());
        jScrollPane1.setViewportView(nameDisplay);

        surnameDisplay.setEditable(false);
        surnameDisplay.setText(setDisplayText1("efternamn", aid));
        jScrollPane2.setViewportView(surnameDisplay);

        adressDisplay.setEditable(false);
        adressDisplay.setText(setDisplayText1("adress", aid));
        jScrollPane3.setViewportView(adressDisplay);

        phonenumberDisplay.setEditable(false);
        phonenumberDisplay.setText(setDisplayText1("telefon" , aid));
        jScrollPane4.setViewportView(phonenumberDisplay);

        emailDisplay.setEditable(false);
        emailDisplay.setText(setDisplayText1("epost", aid));
        jScrollPane5.setViewportView(emailDisplay);

        isAdminDisplay.setEditable(false);
        isAdminDisplay.setText("IsAdmin (DEMO)");
        jScrollPane6.setViewportView(isAdminDisplay);

        employeeIdDisplay.setEditable(false);
        employeeIdDisplay.setText(setDisplayText1("aid", aid));
        jScrollPane7.setViewportView(employeeIdDisplay);

        generateNewPassword.setText("Generate new password");
        generateNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateNewPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField)
                            .addComponent(surnameField)
                            .addComponent(adressField)
                            .addComponent(phoneField)
                            .addComponent(makeAdminBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))))
                .addContainerGap(107, Short.MAX_VALUE))
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
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commitButton))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminOkButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(makeAdminBox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(generateNewPassword))))
                .addContainerGap(97, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void adminOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminOkButtonActionPerformed
        // TODO add your handling code here:
        //MAKE ViSABLE IF USER == ADMIN
    }//GEN-LAST:event_adminOkButtonActionPerformed

    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed
        // TODO add your handling code here:
        //MAKE VISABLE IF USER == HANDLÄGGARE
        //ConfirmWindow confirmWindow = new ConfirmWindow();
        //confirmWindow.setVisible(true);
        //boolean confirmation = confirmWindow.isConfirmed(); // kolla in i detta
        
        //IF CONFIRM DO THIS
        
            String newName = nameField.getText();
            String newSurname = surnameField.getText();
            String newAdress = adressField.getText();
            String newPhonenumber = phoneField.getText();
            String newEmail = emailField.getText(); //OBS
            nameDisplay.setText(newName);
            surnameDisplay.setText(newSurname);
            adressDisplay.setText(newAdress);
            phonenumberDisplay.setText(newPhonenumber);
            emailDisplay.setText(newEmail);
        
    }//GEN-LAST:event_commitButtonActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        // TODO add your handling code here:
        if (nameField.getText().equals("Name")) {
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldMouseClicked

    private void surnameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surnameFieldMouseClicked
        // TODO add your handling code here:
        if (surnameField.getText().equals("Surname")) {
            surnameField.setText("");
        }
    }//GEN-LAST:event_surnameFieldMouseClicked

    private void adressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressFieldMouseClicked
        // TODO add your handling code here:
        if (adressField.getText().equals("Adress")) {
            adressField.setText("");
        }
    }//GEN-LAST:event_adressFieldMouseClicked

    private void phoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseClicked
        // TODO add your handling code here:
        if (phoneField.getText().equals("Phonenumber")) {
            phoneField.setText("");
        }
    }//GEN-LAST:event_phoneFieldMouseClicked

    private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseClicked
        // TODO add your handling code here:
        if (emailField.getText().equals("Email")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldMouseClicked

    private void generateNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateNewPasswordActionPerformed
        // TODO add your handling code here:
        // TODO PROGRAMMERA SÅ ETT RANDOM LÖSEN SKAPAS OCH LÄGG IN I DATABAS UNDER RÄTT AID.


    }//GEN-LAST:event_generateNewPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PersonalInfo(aid).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminOkButton;
    private javax.swing.JTextPane adressDisplay;
    private javax.swing.JTextField adressField;
    private javax.swing.JButton commitButton;
    private javax.swing.JTextPane emailDisplay;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextPane employeeIdDisplay;
    private javax.swing.JToggleButton generateNewPassword;
    private javax.swing.JTextPane isAdminDisplay;
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
    private javax.swing.JCheckBox makeAdminBox;
    private javax.swing.JTextPane nameDisplay;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextPane phonenumberDisplay;
    private javax.swing.JTextPane surnameDisplay;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
