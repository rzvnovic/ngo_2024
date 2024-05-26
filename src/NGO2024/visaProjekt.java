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
import javax.swing.JFrame;

/**
 * Klass som öppnar fönster för projektinfo med vissa gömda åtkomster för
 * handledare. 
 *
 * @author Cyrus 08/05/2024
 * @version 10/05/2024
 */

public class VisaProjekt extends javax.swing.JFrame {
//fel
    private InfDB idb;

    //tas emot från klassen anställd
    private static String pid;
    private static String userAid;
    private static Validering validering;

    /**
     * Creates new form PersonalInfo
     */
    public VisaProjekt(String pid, String userAid) throws InfException {

        this.userAid = userAid; 
        this.pid = pid;    
        validering = new Validering();

        try {
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        } catch (InfException ex) {
            Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * sätter text på alla fält utom projektledare
     * @param select
     * @param pid
     * @return 
     */
    public String setDisplayText1(String select, String pid) {
        String sqlQuerry;
        try {
            String sqlFraga = ("select " + select + " from projekt where pid =" + pid + ";");
            sqlQuerry = idb.fetchSingle(sqlFraga);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return sqlQuerry;
    }
    
    /**
     * sätter text på fältet projektledare 
     * @param pid
     * @return 
     */
    public String setDisplayText2(String pid) {
        String fornamn = null;
        String efternamn = null;
        try {
            String leaderPid = idb.fetchSingle("select projektchef from projekt where pid = "+pid+";");
            fornamn = idb.fetchSingle("select fornamn from anstalld where aid = " +leaderPid+ ";");
            efternamn = idb.fetchSingle("select efternamn from anstalld where aid = " +leaderPid+ ";");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return (fornamn + " " + efternamn);
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
        projNameField = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        desField = new javax.swing.JTextField();
        startDateField = new javax.swing.JTextField();
        endDateField = new javax.swing.JTextField();
        costField = new javax.swing.JTextField();
        commitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projektNamnDisplay = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        desDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        startDateDisplay = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        endDateDisplay = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        costDisplay = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        statusDisplay = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        prioDisplay = new javax.swing.JTextPane();
        deleteButton = new javax.swing.JButton();
        priorityBox = new javax.swing.JComboBox<>();
        statusButton = new javax.swing.JComboBox<>();
        changePButton = new javax.swing.JButton();
        lblPNamn = new javax.swing.JLabel();
        lblDescrip = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        lblKostnad = new javax.swing.JLabel();
        projectLedareField = new javax.swing.JTextField();
        projektLeadDisplay = new javax.swing.JTextField();
        lblProjektL = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        laggTillHandlaggareField = new javax.swing.JTextField();
        lblLäggTill = new javax.swing.JLabel();
        laggTillButton = new javax.swing.JButton();
        laggTillErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        projNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projNameFieldMouseClicked(evt);
            }
        });
        projNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projNameFieldActionPerformed(evt);
            }
        });

        lblInfo.setText("Information");

        desField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desFieldMouseClicked(evt);
            }
        });

        startDateField.setText("yyyy-mm-dd");
        startDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startDateFieldMouseClicked(evt);
            }
        });
        startDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateFieldActionPerformed(evt);
            }
        });

        endDateField.setText("yyyy-mm-dd");
        endDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endDateFieldMouseClicked(evt);
            }
        });
        endDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateFieldActionPerformed(evt);
            }
        });

        costField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                costFieldMouseClicked(evt);
            }
        });
        costField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costFieldActionPerformed(evt);
            }
        });

        commitButton.setText("Ok");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        projektNamnDisplay.setEditable(false);
        projektNamnDisplay.setText(setDisplayText1("projektnamn", pid));
        jScrollPane1.setViewportView(projektNamnDisplay);

        desDisplay.setEditable(false);
        desDisplay.setText(setDisplayText1("beskrivning", pid));
        jScrollPane2.setViewportView(desDisplay);

        startDateDisplay.setEditable(false);
        startDateDisplay.setText(setDisplayText1("startdatum", pid));
        jScrollPane3.setViewportView(startDateDisplay);

        endDateDisplay.setEditable(false);
        endDateDisplay.setText(setDisplayText1("slutdatum" , pid));
        jScrollPane4.setViewportView(endDateDisplay);

        costDisplay.setEditable(false);
        costDisplay.setText(setDisplayText1("kostnad", pid));
        jScrollPane5.setViewportView(costDisplay);

        statusDisplay.setEditable(false);
        statusDisplay.setText(setDisplayText1(("status"),pid));
        jScrollPane6.setViewportView(statusDisplay);

        prioDisplay.setEditable(false);
        prioDisplay.setText(setDisplayText1("prioritet", pid));
        jScrollPane7.setViewportView(prioDisplay);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Ta bort projekt");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        priorityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));
        priorityBox.setToolTipText("Priority\n");
        priorityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityBoxActionPerformed(evt);
            }
        });

        statusButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avslutat", "Pågående", "Planerat" }));
        statusButton.setToolTipText("Priority\n");
        statusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusButtonActionPerformed(evt);
            }
        });

        changePButton.setText("Ändra partners i projekt");
        changePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePButtonActionPerformed(evt);
            }
        });

        lblPNamn.setText("Projektnamn");

        lblDescrip.setText("Beskrivning");

        lblStartdatum.setText("Startdatum");

        lblSlutdatum.setText("Slutdatum");

        lblKostnad.setText("Kostnad");

        try{
            projektLeadDisplay.setText(setDisplayText2(pid));
        }catch(Exception e){}
        projektLeadDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektLeadDisplayActionPerformed(evt);
            }
        });

        lblProjektL.setText("Projektledare");

        lblLäggTill.setText("Lagg till handläggare");

        laggTillButton.setText("Lägg till");
        laggTillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillButtonActionPerformed(evt);
            }
        });

        laggTillErrorLabel.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStartdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSlutdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProjektL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLäggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(statusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projNameField)
                            .addComponent(desField)
                            .addComponent(startDateField)
                            .addComponent(endDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(changePButton)
                            .addComponent(commitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectLedareField)
                            .addComponent(laggTillHandlaggareField))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(laggTillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(projektLeadDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane4))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(priorityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299)
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(laggTillErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(projNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPNamn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescrip))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStartdatum))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSlutdatum))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblKostnad))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(statusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priorityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projektLeadDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(projectLedareField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProjektL)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(laggTillHandlaggareField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLäggTill)
                    .addComponent(laggTillButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(laggTillErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(commitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );

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

    private void projNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projNameFieldActionPerformed
    /**
     * 
     *
     * @param evt
     */
    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed

        String newProjN = projNameField.getText().trim();
        String newDescription = desField.getText().trim();
        String newStartDate = startDateField.getText().trim();
        String newEndDate = endDateField.getText().trim();
        String newCost = costField.getText().trim();
        String newProjektLedare = projectLedareField.getText().trim();
        int status = statusButton.getSelectedIndex();
        int priority = priorityBox.getSelectedIndex();
        String newPriority = null;
        String newStatus = null;

        if (validering.fieldValidation(newProjN, "Department Name")) {
            updateDatabase("projektnamn", newProjN, pid);
            projektNamnDisplay.setText(newProjN);

        }
        if (validering.fieldValidation(newDescription, "Description ")) {
            updateDatabase("beskrivning", newDescription, pid);
            desDisplay.setText(newDescription);

        }
        if (validering.fieldValidation(newStartDate, "yyyy-mm-dd") && validering.checkDateFormat(newStartDate)) {
            updateDatabase("startdatum", newStartDate, pid);
            startDateDisplay.setText(newStartDate);

        }
        if (validering.fieldValidation(newEndDate, "yyyy-mm-dd") && validering.checkDateFormat(newEndDate)) {
            updateDatabase("slutdatum", newEndDate, pid);
            endDateDisplay.setText(newEndDate);

        }
        if (validering.fieldValidation(newCost, "Cost")) {
            updateDatabase("kostnad", newCost, pid);
            costDisplay.setText(newCost);

        }
        if (validering.fieldValidation(newProjektLedare, "Projektledare")) {
            if (newProjektLedare.trim().contains(" ")) {
                try {
                    int index = newProjektLedare.indexOf(" ");
                    String fornamn = newProjektLedare.substring(0, index);
                    String efternamn = newProjektLedare.substring(index + 1);
                    String aid = idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';");
                    if (!validering.checkAdminAid(aid)) {
                        idb.update("UPDATE ngo_2024.projekt t SET t.projektchef = " + aid + " WHERE t.pid = " + pid + ";");
                        projektLeadDisplay.setText(fornamn + " " + efternamn);
                    } else {
                        //error
                        //välj en handläggare som projektledare.
                        errorLabel.setText("Välj en handläggare som projektleadare");
                    }
                } catch (InfException ex) {
                    Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                errorLabel.setText("Felaktikt format.");
                //vanligen ange för och efternamn
            }
        }
        newStatus = statusPicker(status);
        updateDatabase("status", newStatus, pid);
        newPriority = priorityPicker(priority);
        updateDatabase("prioritet", newPriority, pid);

        //cityValidation(newCity, newAvdid);
        statusDisplay.setText(newStatus);
        prioDisplay.setText(newPriority);


    }//GEN-LAST:event_commitButtonActionPerformed
    /**
     * metod som uppdaterar databasen med information som är inmatat i ett fält.
     *
     * @param column vilken kolumn som bör uppdateras
     * @param value vad cellen skall uppdateras med
     * @param avdid vilken aid som ändringen ska ske på
     */
    private void updateDatabase(String column, String value, String pid) {
        try {
            String sqlQuerry = ("UPDATE ngo_2024.projekt t SET t." + column + " = '" + value + "' WHERE t.pid = " + pid + ";");
            idb.update(sqlQuerry);
        } catch (InfException ex) {
            Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String priorityPicker(int priority) {
        if (priority == 3) {
            return "låg";
        } else if (priority == 2) {
            return "medel";
        } else {
            return "hög";
        }
    }

    private String statusPicker(int status) {
        if (status == 3) {
            return "plannerad";
        } else if (status == 2) {
            return "pågående";
        } else {
            return "avslutad";
        }
    }

    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void projNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projNameFieldMouseClicked
        // TODO add your handling code here:
        if (projNameField.getText().equals("Department Name")) {
            projNameField.setText("");
        }
    }//GEN-LAST:event_projNameFieldMouseClicked
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
    private void startDateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startDateFieldMouseClicked
        // TODO add your handling code here:
        if (startDateField.getText().equals("Start Date")) {
            startDateField.setText("");
        }
    }//GEN-LAST:event_startDateFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void endDateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endDateFieldMouseClicked
        // TODO add your handling code here:
        if (endDateField.getText().equals("End Date")) {
            endDateField.setText("");
        }
    }//GEN-LAST:event_endDateFieldMouseClicked
    /**
     * metod tar bort text från fältet om det klickas
     *
     * @param evt
     */
    private void costFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costFieldMouseClicked
        // TODO add your handling code here:
        if (costField.getText().equals("Cost")) {
            costField.setText("");
        }
    }//GEN-LAST:event_costFieldMouseClicked

    /**
     * Metod som tar bort profilen som sökts up.
     *
     * @param evt
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO tar bort profilen ur tabellen genom idb.delete()
        String deleteProjpartner = ("DELETE FROM ngo_2024.projekt_partner WHERE pid =" + pid + ";");
        String deleteHallProject = ("DELETE FROM ngo_2024.proj_hallbarhet WHERE pid =" + pid + ";");
        String deleteAnsProject = ("DELETE FROM ngo_2024.ans_proj WHERE pid =" + pid + ";");
        String deleteProject = ("DELETE FROM ngo_2024.projekt WHERE pid =" + pid + ";");

        try {
            idb.delete(deleteAnsProject);
            idb.delete(deleteHallProject);
            idb.delete(deleteProjpartner);
            idb.delete(deleteProject);
        } catch (InfException ex) {
            Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void costFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costFieldActionPerformed

    private void startDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateFieldActionPerformed

    private void endDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateFieldActionPerformed

    private void priorityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityBoxActionPerformed

    private void statusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusButtonActionPerformed

    private void changePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePButtonActionPerformed
        try {
            new SamarbetspartnerLista(pid, userAid).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_changePButtonActionPerformed

    private void projektLeadDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektLeadDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projektLeadDisplayActionPerformed

    /**
     * Lägger till en handledare i ans_proj och därmed i projektet.
     * @param evt 
     */
    private void laggTillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillButtonActionPerformed
        String newHandlaggare = laggTillHandlaggareField.getText().trim();
        if (newHandlaggare.trim().contains(" ")) {
            try {
                int index = newHandlaggare.indexOf(" ");
                String fornamn = newHandlaggare.substring(0, index);
                String efternamn = newHandlaggare.substring(index + 1);
                String aid = idb.fetchSingle("select aid from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "';");
                if(aid != null){
                if (!validering.checkAdminAid(aid)) {
                    idb.insert("INSERT INTO ngo_2024.ans_proj (pid, aid) VALUES (" + pid + ", " + aid + ");");
                } else {
                    
                    laggTillErrorLabel.setText("Välj en handläggare anställd");
                }
                }
                else{
                    laggTillErrorLabel.setText("Kunde inte hitta handläggare.");
                }
            } catch (InfException ex) {
                Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
                laggTillErrorLabel.setText("Handlaggare redan tillagd.");
            }
        } else {
            laggTillErrorLabel.setText("Felaktikt format.");
        }
    }//GEN-LAST:event_laggTillButtonActionPerformed

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
        java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>


    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                new VisaProjekt(pid, userAid).setVisible(true);
                Validering validering = new Validering();
            } catch (InfException ex) {
                Logger.getLogger(VisaProjekt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePButton;
    private javax.swing.JButton commitButton;
    private javax.swing.JTextPane costDisplay;
    private javax.swing.JTextField costField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextPane desDisplay;
    private javax.swing.JTextField desField;
    private javax.swing.JTextPane endDateDisplay;
    private javax.swing.JTextField endDateField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton laggTillButton;
    private javax.swing.JLabel laggTillErrorLabel;
    private javax.swing.JTextField laggTillHandlaggareField;
    private javax.swing.JLabel lblDescrip;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblKostnad;
    private javax.swing.JLabel lblLäggTill;
    private javax.swing.JLabel lblPNamn;
    private javax.swing.JLabel lblProjektL;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JTextPane prioDisplay;
    private javax.swing.JComboBox<String> priorityBox;
    private javax.swing.JTextField projNameField;
    private javax.swing.JTextField projectLedareField;
    private javax.swing.JTextField projektLeadDisplay;
    private javax.swing.JTextPane projektNamnDisplay;
    private javax.swing.JTextPane startDateDisplay;
    private javax.swing.JTextField startDateField;
    private javax.swing.JComboBox<String> statusButton;
    private javax.swing.JTextPane statusDisplay;
    // End of variables declaration//GEN-END:variables
}
