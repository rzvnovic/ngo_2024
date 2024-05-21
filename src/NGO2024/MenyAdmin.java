/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGO2024;

/**
 *
 * @author Cyrus
 */
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenyAdmin extends javax.swing.JFrame {

    private static String ePost;
    private static String userAid;
    private InfDB idb;
    private static String aid;
    private static Validering validering;

    /**
     * Creates new form NewJFrame
     */
    public MenyAdmin(String ePost, String userAid) throws InfException {
        idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        this.ePost = ePost;
        this.userAid = userAid;
        validering = new Validering();
        initComponents();
        personelLblError.setVisible(false);
        projectTabErrorLabel.setVisible(false);
        avdelningErrorLabel.setVisible(false);
        sökLandFelMedellande.setVisible(false);

        fetchProjects();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tabWindow = new javax.swing.JTabbedPane();
        tabPersonel = new javax.swing.JPanel();
        addNewEmployeeButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchPersonnalNamnB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchPersonalEpostB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        personelLblError = new javax.swing.JLabel();
        tabCountry = new javax.swing.JPanel();
        sökLandLabel = new javax.swing.JLabel();
        sökaLandButton = new javax.swing.JButton();
        sökLandField = new javax.swing.JTextField();
        SkapaNyttLandButton = new javax.swing.JButton();
        sökLandFelMedellande = new javax.swing.JLabel();
        tabPartner = new javax.swing.JPanel();
        jLblSökHandläggare5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        samarbetsPartnerInfo = new javax.swing.JTextArea();
        tabBranch = new javax.swing.JPanel();
        AvdelningSokNamnButton = new javax.swing.JButton();
        avdelningLabel = new javax.swing.JLabel();
        avdelningErrorLabel = new javax.swing.JLabel();
        avdelningSokField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        avdelningListaArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        AvdelningSokIdButton = new javax.swing.JButton();
        tabProject = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaprojectInformation = new javax.swing.JTextArea();
        skapaNyttProjektButton = new javax.swing.JButton();
        searchProjektField = new javax.swing.JTextField();
        sokProjektLabel = new javax.swing.JLabel();
        showProjectButton = new javax.swing.JButton();
        projectTabErrorLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addNewEmployeeButton.setText("Add new personel");
        addNewEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEmployeeButtonActionPerformed(evt);
            }
        });

        searchField.setText("Search...");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchPersonnalNamnB.setText("Search");
        searchPersonnalNamnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonnalNamnBActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn:");

        searchPersonalEpostB.setText("Search");
        searchPersonalEpostB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonalEpostBActionPerformed(evt);
            }
        });

        jLabel2.setText("Epost:");

        personelLblError.setForeground(new java.awt.Color(255, 0, 0));
        personelLblError.setText("felmeddelande");

        javax.swing.GroupLayout tabPersonelLayout = new javax.swing.GroupLayout(tabPersonel);
        tabPersonel.setLayout(tabPersonelLayout);
        tabPersonelLayout.setHorizontalGroup(
            tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPersonelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tabPersonelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPersonelLayout.createSequentialGroup()
                        .addComponent(personelLblError, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(624, Short.MAX_VALUE))
                    .addGroup(tabPersonelLayout.createSequentialGroup()
                        .addGroup(tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchField)
                            .addComponent(addNewEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchPersonnalNamnB)
                        .addGap(18, 18, 18)
                        .addComponent(searchPersonalEpostB)
                        .addContainerGap(624, Short.MAX_VALUE))))
        );
        tabPersonelLayout.setVerticalGroup(
            tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPersonelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPersonnalNamnB)
                    .addComponent(searchPersonalEpostB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(personelLblError)
                .addGap(18, 18, 18)
                .addComponent(addNewEmployeeButton)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        tabWindow.addTab("Personal", tabPersonel);

        sökLandLabel.setText("Sök Land");

        sökaLandButton.setText("Sök");
        sökaLandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökaLandButtonActionPerformed(evt);
            }
        });

        SkapaNyttLandButton.setText("Skapa nytt land");
        SkapaNyttLandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkapaNyttLandButtonActionPerformed(evt);
            }
        });

        sökLandFelMedellande.setText("Felmeddelande");

        javax.swing.GroupLayout tabCountryLayout = new javax.swing.GroupLayout(tabCountry);
        tabCountry.setLayout(tabCountryLayout);
        tabCountryLayout.setHorizontalGroup(
            tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountryLayout.createSequentialGroup()
                .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SkapaNyttLandButton)
                    .addGroup(tabCountryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sökaLandButton)
                            .addComponent(sökLandField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sökLandFelMedellande)
                            .addComponent(sökLandLabel))))
                .addContainerGap(823, Short.MAX_VALUE))
        );
        tabCountryLayout.setVerticalGroup(
            tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountryLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(sökLandLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sökLandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sökaLandButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sökLandFelMedellande)
                .addGap(72, 72, 72)
                .addComponent(SkapaNyttLandButton)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        tabWindow.addTab("Land", tabCountry);

        jLblSökHandläggare5.setText("Sök Samarbetspartner");

        samarbetsPartnerInfo.setColumns(20);
        samarbetsPartnerInfo.setRows(5);
        try{
            samarbetsPartnerInfo.setText(fetchPartnersInProjects());
        }
        catch(Exception e){}
        jScrollPane2.setViewportView(samarbetsPartnerInfo);

        javax.swing.GroupLayout tabPartnerLayout = new javax.swing.GroupLayout(tabPartner);
        tabPartner.setLayout(tabPartnerLayout);
        tabPartnerLayout.setHorizontalGroup(
            tabPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPartnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblSökHandläggare5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabPartnerLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(492, Short.MAX_VALUE))
        );
        tabPartnerLayout.setVerticalGroup(
            tabPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPartnerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLblSökHandläggare5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        tabWindow.addTab("Partners", tabPartner);

        AvdelningSokNamnButton.setText("Sök Namn");
        AvdelningSokNamnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvdelningSokNamnButtonActionPerformed(evt);
            }
        });

        avdelningLabel.setText("Sök / ändra avdelning");

        avdelningErrorLabel.setText("placeholder");

        avdelningSokField.setText("Söktemp");

        avdelningListaArea.setColumns(20);
        avdelningListaArea.setRows(5);
        try{
            avdelningListaArea.setText(fetchAvdelning());
        }
        catch(Exception e){}
        jScrollPane4.setViewportView(avdelningListaArea);

        jLabel3.setText("<html>Sök avdelning med avdelningens namn <br/> eller korresponderande nummer.<html>");

        AvdelningSokIdButton.setText("Sök ID");
        AvdelningSokIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvdelningSokIdButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBranchLayout = new javax.swing.GroupLayout(tabBranch);
        tabBranch.setLayout(tabBranchLayout);
        tabBranchLayout.setHorizontalGroup(
            tabBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBranchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avdelningLabel)
                    .addComponent(avdelningSokField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avdelningErrorLabel)
                    .addGroup(tabBranchLayout.createSequentialGroup()
                        .addComponent(AvdelningSokNamnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AvdelningSokIdButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        tabBranchLayout.setVerticalGroup(
            tabBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBranchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avdelningLabel)
                .addGap(8, 8, 8)
                .addGroup(tabBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBranchLayout.createSequentialGroup()
                        .addComponent(avdelningSokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AvdelningSokNamnButton)
                            .addComponent(AvdelningSokIdButton))
                        .addGap(3, 3, 3)
                        .addComponent(avdelningErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        tabWindow.addTab("Avdelning", tabBranch);

        txtAreaprojectInformation.setColumns(20);
        txtAreaprojectInformation.setRows(5);
        try {
            txtAreaprojectInformation.setText(fetchProjects());
        }
        catch (InfException e) {}
        jScrollPane1.setViewportView(txtAreaprojectInformation);

        skapaNyttProjektButton.setText("Skapa nytt projekt");
        skapaNyttProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaNyttProjektButtonActionPerformed(evt);
            }
        });

        searchProjektField.setText("");

        sokProjektLabel.setText("Sök");

        showProjectButton.setText("Sök");
        showProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProjectButtonActionPerformed(evt);
            }
        });

        projectTabErrorLabel.setText("placeholder");

        javax.swing.GroupLayout tabProjectLayout = new javax.swing.GroupLayout(tabProject);
        tabProject.setLayout(tabProjectLayout);
        tabProjectLayout.setHorizontalGroup(
            tabProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(skapaNyttProjektButton)
                    .addComponent(sokProjektLabel)
                    .addComponent(showProjectButton)
                    .addComponent(projectTabErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchProjektField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabProjectLayout.setVerticalGroup(
            tabProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProjectLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sokProjektLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchProjektField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showProjectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectTabErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(skapaNyttProjektButton)
                .addGap(243, 243, 243))
            .addGroup(tabProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tabWindow.addTab("Projekt", tabProject);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabWindow, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchPersonnalNamnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonnalNamnBActionPerformed
        String personalNamn = searchField.getText();

        if (personalNamn.contains("@")) {
            personelLblError.setText("Vänligen använd sökknappen för Epost");
            personelLblError.setVisible(true);
        } else {
            try {
                if (personalNamn.trim().contains(" ")) {
                    int index = personalNamn.indexOf(" ");
                    String fornamn = personalNamn.substring(0, index);
                    String efternamn = personalNamn.substring(index + 1);
                    System.out.print(fornamn + efternamn);
                    String sqlFraga = ("Select aid from anstalld where fornamn='" + fornamn + "' and efternamn = '" + efternamn + "';");
                    String dbSqlFraga = idb.fetchSingle(sqlFraga);
                    if (dbSqlFraga != null) {
                        new PersonalInfo(dbSqlFraga, userAid).setVisible(true);
                    } else {
                        personelLblError.setText("Användare med angivet namn existerar inte");
                        personelLblError.setVisible(true);
                    }
                } else {
                    personelLblError.setText("Vänligen skriv in både för- och efternamn");
                    personelLblError.setVisible(true);
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_searchPersonnalNamnBActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
    }//GEN-LAST:event_searchFieldActionPerformed

    private void addNewEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewEmployeeButtonActionPerformed
        try {
            new NewPersonel().setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addNewEmployeeButtonActionPerformed

    private void searchPersonalEpostBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonalEpostBActionPerformed
        // TODO add your handling code here:
        String personalEpost = searchField.getText();
        if (!personalEpost.contains("@")) {
            personelLblError.setText("Vänligen använd sök namn knappen vid sök på namn");
            personelLblError.setVisible(true);
        } else {
            if (validering.giltigEpost(personalEpost)) {
                try {
                    String sqlFraga = ("Select aid from anstalld where epost ='" + personalEpost + "';");
                    String dbSqlFraga = idb.fetchSingle(sqlFraga);
                    if (dbSqlFraga != null) {
                        new PersonalInfo(dbSqlFraga, userAid).setVisible(true);
                    } else {
                        personelLblError.setText("Ingen existerande anställd med angiven Epost");
                        personelLblError.setVisible(true);
                    }

                } catch (Exception e) {

                }
            }
        }
    }//GEN-LAST:event_searchPersonalEpostBActionPerformed

    private void showProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProjectButtonActionPerformed
        try {
            String projektSearchText = searchProjektField.getText();
            String projektPid = idb.fetchSingle("Select pid from projekt where projektnamn = " + projektSearchText + ";");

            new VisaProjekt(projektPid, userAid).setVisible(true);

            projectTabErrorLabel.setText("Projekt kunde ej hittas.");
            projectTabErrorLabel.setVisible(true);

        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_showProjectButtonActionPerformed

    private void skapaNyttProjektButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaNyttProjektButtonActionPerformed

        try {
            new NewProject(userAid).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_skapaNyttProjektButtonActionPerformed

    /**
     * Metod öppnar nytt fönsster med hjälp av avdelning.namn
     *
     * @param evt
     */
    private void AvdelningSokNamnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvdelningSokNamnButtonActionPerformed
        try {
            String avdelningSearchText = avdelningSokField.getText();
            String avdelningId = idb.fetchSingle("Select avdid from avdelning where namn = " + avdelningSearchText + ";");
            new VisaAvdelning(avdelningId, userAid).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
            avdelningErrorLabel.setText("Kunde ej hitta avdelning.");
            avdelningErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_AvdelningSokNamnButtonActionPerformed

    /**
     * Metod öppnar nytt fönster med hjälp av avdelning.avdid
     *
     * @param evt
     */
    private void AvdelningSokIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvdelningSokIdButtonActionPerformed
        try {
            String avdelningSearchText = avdelningSokField.getText();
            if (avdelningSearchText.isEmpty() || avdelningSearchText.isBlank()) {
                avdelningErrorLabel.setText("Sökfält blankt");
                avdelningErrorLabel.setVisible(true);
            } else {
                String avdelningId = idb.fetchSingle("Select avdid from avdelning where avdid = " + avdelningSearchText + ";");
                new VisaAvdelning(avdelningId, userAid).setVisible(true);
            }
        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
            avdelningErrorLabel.setText("Kunde ej hitta avdelning.");
            avdelningErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_AvdelningSokIdButtonActionPerformed

    private void sökaLandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökaLandButtonActionPerformed

        try {
            String landSearchText = sökaLandButton.getText();

            if (landSearchText.isEmpty() || landSearchText.isBlank()) {
                sökLandFelMedellande.setText("Sökfällt blankt.");
                sökLandFelMedellande.setVisible(true);
            } else {
                String landLid = idb.fetchSingle("Select lid from land where namn = '" + landSearchText + "';");
                new VisaLand(landLid, userAid).setVisible(true);
            }
            sökLandFelMedellande.setText("Land kunde ej hittas.");

        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
            sökLandFelMedellande.setText("Land kunde ej hittas.");
            sökLandFelMedellande.setVisible(true);
        }
    }//GEN-LAST:event_sökaLandButtonActionPerformed

    private void SkapaNyttLandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkapaNyttLandButtonActionPerformed
        try {
            new NewLand(userAid).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SkapaNyttLandButtonActionPerformed

    public String fetchPartnersInProjects() throws InfException {
        ArrayList<String> samarbetsPartnerNamn = idb.fetchColumn("select namn from partner where namn is not null");
        ArrayList<String> samarbetsPartnerKontaktPerson = idb.fetchColumn("select kontaktperson from partner where kontaktperson is not null");
        ArrayList<String> samarbetsPartnerKontaktEpost = idb.fetchColumn("select kontaktepost from partner where kontaktepost is not null");
        ArrayList<String> samarbetsPartnerTelefon = idb.fetchColumn("select telefon from partner where telefon is not null");
        ArrayList<String> samarbetsPartnerAdress = idb.fetchColumn("select adress from partner where adress is not null");
        ArrayList<String> samarbetsPartnerBranch = idb.fetchColumn("select branch from partner where branch is not null");
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < samarbetsPartnerNamn.size(); i++) {
            message.append("\nNamn: ").append(samarbetsPartnerNamn.get(i))
                    .append("\nKontaktperson: ").append(samarbetsPartnerKontaktPerson.get(i))
                    .append("\nEpost: ").append(samarbetsPartnerKontaktEpost.get(i))
                    .append("\nTelefon: ").append(samarbetsPartnerTelefon.get(i)).append("\nAdress: ").append(samarbetsPartnerAdress.get(i)).append("\nBranch: ").append(samarbetsPartnerBranch.get(i)).append("\n");
        }

        return message.toString().trim();

    }

    public String fetchAvdelning() throws InfException {

        ArrayList<String> aNamnLista = idb.fetchColumn("select namn from avdelning");
        ArrayList<String> aIdLista = idb.fetchColumn("select avdid from avdelning");

        String message = "";

        for (int i = 0; i < aNamnLista.size(); i++) {

            message = message + (aIdLista.get(i) + ".\n" + aNamnLista.get(i) + "\n\n");
        }
        return message.trim();
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
            java.util.logging.Logger.getLogger(MenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenyAdmin(ePost, userAid).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(MenyAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public String fetchProjects() throws InfException {
        ArrayList<String> projektPidLista = idb.fetchColumn("Select pid from projekt;");
        ArrayList<String> projektNamnLista = idb.fetchColumn("Select projektnamn from projekt;");
        ArrayList<String> projektBeskrivningLista = idb.fetchColumn("Select beskrivning from projekt;");
        ArrayList<String> projektStartdatum = idb.fetchColumn("Select startdatum from projekt;");
        ArrayList<String> projektSlutdatum = idb.fetchColumn("Select slutdatum from projekt;");
        ArrayList<String> projektKostnad = idb.fetchColumn("Select kostnad from projekt;");
        ArrayList<String> projektStatus = idb.fetchColumn("Select status from projekt;");
        ArrayList<String> projektPrioritet = idb.fetchColumn("Select prioritet from projekt;");

        String message = "";
        String nameMessage = "Projektnamn: ";
        String descriptionMessage = "Beskrivning: ";
        String startMessage = "Startdatum: ";
        String endMessage = "Slutdatum: ";
        String costMessage = "Kostnad: ";
        String statusMessage = "Status: ";
        String priorityMessage = "Prioritet: ";
        String leaderMessage = "Projektchef: ";
        String contentName = null;
        String contentBesk = null;
        String contentStart = null;
        String contentEnd = null;
        String contentCost = null;
        String contentStatus = null;
        String contentPriority = null;
        String contentLeaderFirst = null;
        String contentLeaderLast = null;

        for (int i = 0; i < projektNamnLista.size(); i++) {
            String pid = projektPidLista.get(i);

            contentName = projektNamnLista.get(i);
            contentBesk = projektBeskrivningLista.get(i);
            contentStart = projektStartdatum.get(i);
            contentEnd = projektSlutdatum.get(i);
            contentCost = projektKostnad.get(i);
            contentStatus = projektStatus.get(i);
            contentPriority = projektPrioritet.get(i);
            String aid = idb.fetchSingle("SELECT projektchef FROM projekt WHERE pid = '" + projektPidLista.get(i) + "';");

            contentLeaderFirst = idb.fetchSingle("Select fornamn From anstalld where aid = " + aid + ";");
            contentLeaderLast = idb.fetchSingle("Select efternamn From anstalld where aid = " + aid + ";");

            message = message + "\n" + nameMessage + contentName + "\n" + descriptionMessage + contentBesk + "\n" + startMessage + contentStart + "\n" + endMessage + contentEnd + "\n" + costMessage + contentCost + "\n" + statusMessage + contentStatus + "\n" + priorityMessage + contentPriority + "\n" + leaderMessage + contentLeaderFirst + " " + contentLeaderLast + "\n";
        }

        return message.trim();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvdelningSokIdButton;
    private javax.swing.JButton AvdelningSokNamnButton;
    private javax.swing.JButton SkapaNyttLandButton;
    private javax.swing.JButton addNewEmployeeButton;
    private javax.swing.JLabel avdelningErrorLabel;
    private javax.swing.JLabel avdelningLabel;
    private javax.swing.JTextArea avdelningListaArea;
    private javax.swing.JTextField avdelningSokField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblSökHandläggare5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel personelLblError;
    private javax.swing.JLabel projectTabErrorLabel;
    private javax.swing.JTextArea samarbetsPartnerInfo;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchPersonalEpostB;
    private javax.swing.JButton searchPersonnalNamnB;
    private javax.swing.JTextField searchProjektField;
    private javax.swing.JButton showProjectButton;
    private javax.swing.JButton skapaNyttProjektButton;
    private javax.swing.JLabel sokProjektLabel;
    private javax.swing.JLabel sökLandFelMedellande;
    private javax.swing.JTextField sökLandField;
    private javax.swing.JLabel sökLandLabel;
    private javax.swing.JButton sökaLandButton;
    private javax.swing.JPanel tabBranch;
    private javax.swing.JPanel tabCountry;
    private javax.swing.JPanel tabPartner;
    private javax.swing.JPanel tabPersonel;
    private javax.swing.JPanel tabProject;
    private javax.swing.JTabbedPane tabWindow;
    private javax.swing.JTextArea txtAreaprojectInformation;
    // End of variables declaration//GEN-END:variables
}
