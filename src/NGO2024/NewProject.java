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

        countryField.setText("Stad");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(budgetField)
                            .addComponent(priorityBox, 0, 324, Short.MAX_VALUE)
                            .addComponent(countryField)
                            .addComponent(jScrollPane1)
                            .addComponent(pNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(countryButton))
                            .addComponent(projectLField))
                        .addGap(18, 18, 18)
                        .addComponent(felmeddelandeProject)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(felmeddelandeProject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(countryButton))
                .addGap(19, 19, 19))
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
        String newCountry = countryField.getText();
        String newProjectL = projectLField.getText();

        String fornamn = null;
        String efternamn = null;

        try {
            int index = newProjectL.indexOf(" ");
            fornamn = newProjectL.substring(0, index);
            efternamn = newProjectL.substring(index + 1);
            System.out.print(fornamn + efternamn);

            String newPid;

            ArrayList<String> countryList = idb.fetchColumn("SELECT namn FROM land;");

            for (int i = 0; i < countryList.size(); i++) {
                if (newCountry.equals(countryList.get(i))) {

                    newPid = idb.getAutoIncrement("projekt", "pid");
                    String sqlQuerry = ("INSERT INTO ngo_2024.projekt (pid) VALUES (" + newPid + ");");
                    idb.insert(sqlQuerry);
                    //använd valideringsklass
                    if (validering.fieldValidation(newPName, "Project name")) {
                        insertValue("projektnamn", newPName, newPid);
                    }
                    //använd valideringsklass
                    if (validering.fieldValidation(newDescription, "-1")) {
                        insertValue("beskrivning", newDescription, newPid);
                    }
                    //använd valideringsklass, validera datum TODO
                    if (validering.fieldValidation(newStartDate, "Start Date") && validering.checkDateFormat(newStartDate)) {
                        insertValue("startdatum", newStartDate, newPid);
                    }

                    //använd valideringsklass, validera datum TODO
                    if (validering.fieldValidation(newEndDate, "End Date") && validering.checkDateFormat(newEndDate)) {
                        insertValue("slutdatum", newEndDate, newPid);
                    }
                    //använd valideringsklass
                    if (validering.fieldValidation(newBudget, "Budget")) {
                        insertValue("kostnad", newBudget, newPid);
                    }

                    if (!validering.checkProjektLedareAid(userAid)) {
                        if (validering.fieldValidation(newProjectL, "Assign project leader") && !validering.checkAdminAid(idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"))) {
                            insertValue("projektchef", idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"), newPid);
                        } else if (validering.checkAdminAid(idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';"))) {
                            felmeddelandeProject.setText("Användaren är en Admin välj en handläggare!");
                            felmeddelandeProject.setVisible(true);
                        } else {
                            felmeddelandeProject.setText("Kunde inte hitta!");
                            felmeddelandeProject.setVisible(true);
                        }
                    } else {
                        fornamn = idb.fetchSingle("select fornamn from anstalld where aid = "+userAid+";");
                        efternamn = idb.fetchSingle("select efternamn from anstalld where aid = "+ userAid+";");
                        projectLField.setText(fornamn + " " + efternamn);
                        projectLField.setEditable(false);
                    }
                    insertValue("land", idb.fetchSingle("select lid from land where namn = " + newCountry + ";"), newPid);
                    //else felmeddelande.
                    String newPriority = priorityPicker(priority);
                    insertValue("prioritet", newPriority, newPid);
                } else {
                    countryButton.setVisible(true);
                }
            }

        } catch (InfException ex) {
            Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);

            felmeddelandeProject.setVisible(true);
            felmeddelandeProject.setText("Kontrollera Stavning");
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void countryFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryFieldMouseClicked
        if (countryField.getText().equals("City")) {
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
        if (priority == 3) {
            return "låg";
        } else if (priority == 2) {
            return "medel";
        } else {
            return "hög";
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
    private javax.swing.JTextField countryField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField endDateFeild;
    private javax.swing.JLabel felmeddelandeProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pDescriptionField;
    private javax.swing.JTextField pNameField;
    private javax.swing.JComboBox<String> priorityBox;
    private javax.swing.JTextField projectLField;
    private javax.swing.JTextField startDateField;
    // End of variables declaration//GEN-END:variables
}
