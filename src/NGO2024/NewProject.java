package NGO2024;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
public class NewProject extends javax.swing.JFrame {

    private InfDB idb;
    private static String userAid;
    private static Validering validering;

    /**
     * Creates new form newPersonel
     *
     * @throws oru.inf.InfException
     */
    public NewProject(String userAid) throws InfException {

        this.userAid = userAid;
        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");

        } catch (InfException ex) {
            Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        felmeddelandeProject.setVisible(false);
        countryButton.setVisible(false);
        countryErrorLabel.setVisible(false);
    }

    /* public String setUserName() throws InfException{
    String userName = idb.fetchSingle("select concat(fornamn, efternamn) from anstalld where aid ="+userAid+";");
    return userName;
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNameField = new javax.swing.JTextField();
        budgetField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        priorityBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pDescriptionField = new javax.swing.JTextArea();
        projectLField = new javax.swing.JTextField();
        felmeddelandeProject = new javax.swing.JLabel();
        startDateField = new javax.swing.JTextField();
        endDateFeild = new javax.swing.JTextField();
        countryButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        countryErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pNameField.setText("Projektnamn");
        pNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pNameFieldMouseClicked(evt);
            }
        });

        budgetField.setText("Budget");
        budgetField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budgetFieldMouseClicked(evt);
            }
        });

        createButton.setText("Skapa");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nytt projekt");

        countryField.setText("Land");
        countryField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryFieldMouseClicked(evt);
            }
        });

        priorityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low" }));
        priorityBox.setToolTipText("Priority\n");
        priorityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityBoxActionPerformed(evt);
            }
        });

        pDescriptionField.setColumns(20);
        pDescriptionField.setRows(5);
        pDescriptionField.setText("Beskrivning");
        jScrollPane1.setViewportView(pDescriptionField);

        projectLField.setText("Projektledare");

        felmeddelandeProject.setText("Handläggare finns ej!");

        startDateField.setText("Startdatum");

        endDateFeild.setText("Slutdatum");
        endDateFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateFeildActionPerformed(evt);
            }
        });

        countryButton.setText("Lägg till land");
        countryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(244, 22, 23));
        errorLabel.setText("A");

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avslutad", "Pågående", "Planerat" }));

        countryErrorLabel.setText("Land kunde inte hittas, pröva igen eller lägg till land.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(statusBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(budgetField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priorityBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 324, Short.MAX_VALUE)
                            .addComponent(countryField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(countryButton))
                            .addComponent(projectLField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(felmeddelandeProject)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(countryErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(priorityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(felmeddelandeProject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(countryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNameFieldMouseClicked
        if (pNameField.getText().equals("Name")) {
            pNameField.setText("");
        }

    }//GEN-LAST:event_pNameFieldMouseClicked

    private void budgetFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetFieldMouseClicked
        if (budgetField.getText().equals("Phonenumber")) {
            budgetField.setText("");
        }
    }//GEN-LAST:event_budgetFieldMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String newPName = pNameField.getText();
        String newDescription = pDescriptionField.getText();
        String newStartDate = startDateField.getText();
        String newEndDate = endDateFeild.getText();
        String newBudget = budgetField.getText();
        int priority = priorityBox.getSelectedIndex();
        int statusChosen = statusBox.getSelectedIndex();
        String newCountry = countryField.getText();
        String newProjectL = projectLField.getText();

        boolean countryFound = false;

        String fornamn = null;
        String efternamn = null;

        if (newProjectL.contains(" ")) {

            try {
                int index = newProjectL.indexOf(" ");
                fornamn = newProjectL.substring(0, index);
                efternamn = newProjectL.substring(index + 1);
                System.out.print(fornamn + efternamn);

                String newPid;
                ArrayList<String> errorList = new ArrayList<>();
                boolean errorFound = false;
                boolean okProjectL = false;

                ArrayList<String> countryList = idb.fetchColumn("SELECT namn FROM land;");

                for (int i = 0; i < countryList.size(); i++) {
                    if (newCountry.equals(countryList.get(i))) {
                        countryFound = true;
                        newPid = idb.getAutoIncrement("projekt", "pid");

                        if (!validering.checkAdminAid(userAid)) {
                            if (validering.fieldValidation(newProjectL, "Assign project leader") && !validering.checkAdminAid(idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"))) {
                                okProjectL = true;
                            } else if (validering.checkAdminAid(idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"))) {
                                felmeddelandeProject.setText("Användaren är en Admin välj en handläggare!");
                                felmeddelandeProject.setVisible(true);
                                break;
                            } else {
                                felmeddelandeProject.setText("Kunde inte hitta!");
                                felmeddelandeProject.setVisible(true);
                                break;
                            }
                            //foreign key här 
                        } else {
                            break;
                        }

                        if (okProjectL) {

                            String sqlQuerry = ("INSERT INTO ngo_2024.projekt (pid) VALUES (" + newPid + ");");
                            idb.insert(sqlQuerry);
                            //använd valideringsklass
                            insertValue("projektchef", idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"), newPid);

                            if (validering.fieldValidation(newPName, "Projektnamn")) {
                                insertValue("projektnamn", newPName, newPid);
                            } else {
                                insertValue("projektnamn", "ej angivet", newPid);
                                errorList.add("Projektnamn");
                                errorFound = true;
                            }
                            //använd valideringsklass
                            if (validering.fieldValidation(newDescription, "-1")) {
                                insertValue("beskrivning", newDescription, newPid);
                            } else {
                                insertValue("beskrivning", "ej angivet", newPid);
                                errorList.add("Beskrivning");
                                errorFound = true;
                            }
                            //använd valideringsklass, validera datum TODO
                            if (validering.fieldValidation(newStartDate, "Startdatum") && validering.checkDateFormat(newStartDate)) {
                                insertValue("startdatum", newStartDate, newPid);
                            } else {
                                insertValue("startdatum", "1111-11-11", newPid);
                                errorList.add("Startdatum");
                                errorFound = true;
                            }

                            if (validering.fieldValidation(newEndDate, "Slutdatum") && validering.checkDateFormat(newEndDate)) {
                                insertValue("slutdatum", newEndDate, newPid);
                            } else {
                                insertValue("slutdatum", "1111-11-11", newPid);
                                errorList.add("Slutdatum");
                                errorFound = true;
                            }
                            if (validering.fieldValidation(newBudget, "Budget")) {
                                insertValue("kostnad", newBudget, newPid);
                            } else {
                                insertValue("kostnad", "0.0", newPid);
                                errorList.add("Budget");
                                errorFound = true;
                            }
                            if (errorFound) {
                                errorLabel.setText(insertError(errorList));
                            }

                            //foreign key 
                            insertValue("land", idb.fetchSingle("select lid from land where namn = '" + newCountry + "';"), newPid);
                            //else felmeddelande.
                            String newPriority = priorityPicker(priority);
                            insertValue("prioritet", newPriority, newPid);

                            String newStatus = statusPicker(statusChosen);
                            insertValue("status", newStatus, newPid);
                            break;
                        }
                    } else {
                        countryFound = false;
                    }

                }
                if (!countryFound) {
                    countryErrorLabel.setVisible(true);
                    countryButton.setVisible(true);
                }

                if (errorFound) {
                    errorLabel.setText(insertError(errorList));
                }

            } catch (InfException ex) {
                Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);

                felmeddelandeProject.setVisible(true);
                felmeddelandeProject.setText("Kontrollera Stavning");
            }
        } else {
            System.out.print("error");
        }
    }//GEN-LAST:event_createButtonActionPerformed
    private String insertError(ArrayList<String> errorList) {
        if (errorList == null || errorList.isEmpty()) {
            return "Inga felaktiga värden hittades.";
        }

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < errorList.size(); i++) {
            if (i > 0) {
                message.append(", ");
            }
            message.append(errorList.get(i));
        }

        return "Följande rutor hade felaktiga värden: " + message.toString();
    }
    private void countryFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryFieldMouseClicked
        if (countryField.getText().equals("Land")) {
            countryField.setText("");
        }
    }//GEN-LAST:event_countryFieldMouseClicked

    private void priorityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityBoxActionPerformed

    private void endDateFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateFeildActionPerformed

    private void countryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryButtonActionPerformed
        try {
            new NewLand(userAid).setVisible(true);
            // TODO add your handling code here:
        } catch (InfException ex) {
            Logger.getLogger(NewAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_countryButtonActionPerformed

    private String priorityPicker(int priority) {
        if (priority == 2) {
            return "Låg";
        } else if (priority == 1) {
            return "Medel";
        } else {
            return "Hög";
        }
    }

    private String statusPicker(int priority) {
        if (priority == 2) {
            return "Planerat";
        } else if (priority == 1) {
            return "Pågående";
        } else {
            return "Avslutat";
        }
    }

    private void insertValue(String column, String value, String newPid) throws InfException {
        String sqlQuerry = ("UPDATE ngo_2024.projekt t SET t." + column + " = '" + value + "' WHERE t.pid = " + newPid + ";");
        idb.update(sqlQuerry);
    }

    /**
     * todo ändra till land
     *
     * @param newCity
     * @param newPid
     * @throws InfException
     */
    private void countryValidation(String newCity, String newPid) throws InfException {
        ArrayList<String> cityList = idb.fetchColumn("Select namn from land;");
        for (String cityName : cityList) {
            if (cityName.equals(newCity)) {
                String sid = idb.fetchSingle("select sid from land where namn =" + newCity + ";");
                idb.update("UPDATE ngo_2024.projekt t SET t.land = " + sid + " WHERE t.pid = " + newPid + ";");
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
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new NewProject(userAid).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField budgetField;
    private javax.swing.JButton countryButton;
    private javax.swing.JLabel countryErrorLabel;
    private javax.swing.JTextField countryField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField endDateFeild;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel felmeddelandeProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pDescriptionField;
    private javax.swing.JTextField pNameField;
    private javax.swing.JComboBox<String> priorityBox;
    private javax.swing.JTextField projectLField;
    private javax.swing.JTextField startDateField;
    private javax.swing.JComboBox<String> statusBox;
    // End of variables declaration//GEN-END:variables
}
