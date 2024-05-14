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
 *
 * @author meldi
 */
public class MenyHandlaggare extends javax.swing.JFrame {
    private InfDB idb;
    private static int userAid;
    private Validering validering;

    /**
     * Creates new form MenyHandläggare
     */
    public MenyHandlaggare(int userAid) throws InfException {
        idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
        this.userAid = userAid;
        validering = new Validering();

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

        jPanel1 = new javax.swing.JPanel();
        HandläggarMeny = new javax.swing.JTabbedPane();
        profilTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        visaKnapp = new javax.swing.JButton();
        avdelningTab = new javax.swing.JPanel();
        jLblSökHandläggare = new javax.swing.JLabel();
        avdelningSokruta = new javax.swing.JTextField();
        avdelningSok = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        personalList = new javax.swing.JLabel();
        projektTab = new javax.swing.JPanel();
        jLblSökHandläggare4 = new javax.swing.JLabel();
        projektSokruta = new javax.swing.JTextField();
        projektSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        minaProjectField = new javax.swing.JLabel();
        samarbetspartnerTab2 = new javax.swing.JPanel();
        jLblSökHandläggare5 = new javax.swing.JLabel();
        samarbetspartnerSokruta = new javax.swing.JTextField();
        samarbetspartnerSok = new javax.swing.JButton();
        hållbarhetsmalTab = new javax.swing.JPanel();
        jLblSökHallbarhetsmål = new javax.swing.JLabel();
        hallbarhetsmalSokruta = new javax.swing.JTextField();
        hallbarhetsmalSok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Info");

        visaKnapp.setText("Visa Profil:");
        visaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilTabLayout = new javax.swing.GroupLayout(profilTab);
        profilTab.setLayout(profilTabLayout);
        profilTabLayout.setHorizontalGroup(
            profilTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(profilTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visaKnapp)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        profilTabLayout.setVerticalGroup(
            profilTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visaKnapp)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        HandläggarMeny.addTab("Profil", profilTab);

        jLblSökHandläggare.setText("Sök Handläggare");

        avdelningSokruta.setColumns(8);

        avdelningSok.setText("Sök");
        avdelningSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avdelningSokjButton2ActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        try{
            jTextArea3.setText(fetchEmployees());
        }
        catch(Exception e){
        }
        jScrollPane3.setViewportView(jTextArea3);

        personalList.setText("Department's employees");

        javax.swing.GroupLayout avdelningTabLayout = new javax.swing.GroupLayout(avdelningTab);
        avdelningTab.setLayout(avdelningTabLayout);
        avdelningTabLayout.setHorizontalGroup(
            avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avdelningTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(avdelningTabLayout.createSequentialGroup()
                        .addComponent(jLblSökHandläggare, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personalList, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(avdelningTabLayout.createSequentialGroup()
                        .addGroup(avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avdelningSok)
                            .addComponent(avdelningSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)))
                .addContainerGap())
        );
        avdelningTabLayout.setVerticalGroup(
            avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avdelningTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSökHandläggare)
                    .addComponent(personalList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(avdelningTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(avdelningTabLayout.createSequentialGroup()
                        .addComponent(avdelningSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avdelningSok)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );

        HandläggarMeny.addTab("Avdelning", avdelningTab);

        jLblSökHandläggare4.setText("Sök Projekt");

        projektSokruta.setColumns(8);

        projektSok.setText("Sök");
        projektSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektSokjButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        try{
            jTextArea1.setText(fetchProject());
        }
        catch(Exception e){}
        jScrollPane1.setViewportView(jTextArea1);

        minaProjectField.setText("My projects");

        javax.swing.GroupLayout projektTabLayout = new javax.swing.GroupLayout(projektTab);
        projektTab.setLayout(projektTabLayout);
        projektTabLayout.setHorizontalGroup(
            projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projektTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projektSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektSok)
                    .addComponent(jLblSökHandläggare4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(projektTabLayout.createSequentialGroup()
                        .addComponent(minaProjectField)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        projektTabLayout.setVerticalGroup(
            projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projektTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSökHandläggare4)
                    .addComponent(minaProjectField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(projektTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projektTabLayout.createSequentialGroup()
                        .addComponent(projektSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(projektSok)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );

        HandläggarMeny.addTab("Projekt", projektTab);

        jLblSökHandläggare5.setText("Sök Samarbetspartner");

        samarbetspartnerSokruta.setColumns(8);

        samarbetspartnerSok.setText("Sök");
        samarbetspartnerSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samarbetspartnerSokjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout samarbetspartnerTab2Layout = new javax.swing.GroupLayout(samarbetspartnerTab2);
        samarbetspartnerTab2.setLayout(samarbetspartnerTab2Layout);
        samarbetspartnerTab2Layout.setHorizontalGroup(
            samarbetspartnerTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(samarbetspartnerTab2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(samarbetspartnerTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(samarbetspartnerSok)
                    .addComponent(samarbetspartnerSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSökHandläggare5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 564, Short.MAX_VALUE))
        );
        samarbetspartnerTab2Layout.setVerticalGroup(
            samarbetspartnerTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(samarbetspartnerTab2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLblSökHandläggare5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(samarbetspartnerSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(samarbetspartnerSok)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        HandläggarMeny.addTab("Samarbetspartner", samarbetspartnerTab2);

        jLblSökHallbarhetsmål.setText("Sök Hållbarhetsmål");

        hallbarhetsmalSokruta.setColumns(8);
        hallbarhetsmalSokruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallbarhetsmalSokrutaActionPerformed(evt);
            }
        });

        hallbarhetsmalSok.setText("Sök");
        hallbarhetsmalSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallbarhetsmalSokjButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Aktiva hållbarhetsmål");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        try{
            jTextArea2.setText(fetchHallbarhetsmal());
        }
        catch(Exception e){
        }
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout hållbarhetsmalTabLayout = new javax.swing.GroupLayout(hållbarhetsmalTab);
        hållbarhetsmalTab.setLayout(hållbarhetsmalTabLayout);
        hållbarhetsmalTabLayout.setHorizontalGroup(
            hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hållbarhetsmalTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hallbarhetsmalSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hallbarhetsmalSok)
                    .addComponent(jLblSökHallbarhetsmål, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(hållbarhetsmalTabLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hållbarhetsmalTabLayout.setVerticalGroup(
            hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hållbarhetsmalTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSökHallbarhetsmål)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hållbarhetsmalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hållbarhetsmalTabLayout.createSequentialGroup()
                        .addComponent(hallbarhetsmalSokruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hallbarhetsmalSok)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );

        HandläggarMeny.addTab("Hållbarhetsmål", hållbarhetsmalTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(HandläggarMeny)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(HandläggarMeny, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("jLabel2");

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

    private void avdelningSokjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avdelningSokjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avdelningSokjButton2ActionPerformed

    private void projektSokjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektSokjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projektSokjButton2ActionPerformed

    private void samarbetspartnerSokjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samarbetspartnerSokjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_samarbetspartnerSokjButton2ActionPerformed

    private void hallbarhetsmalSokjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallbarhetsmalSokjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallbarhetsmalSokjButton2ActionPerformed

    private void hallbarhetsmalSokrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallbarhetsmalSokrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallbarhetsmalSokrutaActionPerformed

    private void visaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaKnappActionPerformed
        // TODO add your handling code here:
        //SKA ÖPPNA UPP PERSONALINFO
        //@param UserAID, AID
        int aid = userAid; // Fungerar för syftet av denna metod.
        try {
            new PersonalInfo(aid, userAid).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(MenyHandlaggare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_visaKnappActionPerformed

    
    /**
     * metod som lägger in varje tabelles rad på en ny rad i en textsträng.
     * 
     * Kan vara värt att undersöka och endast visa de mål som är aktiva för avdelning 
     * TODO
     * DEBUGG för att se VARFÖR den skriver ut NULL
     * @return message
     * @throws InfException 
     */
    public String fetchHallbarhetsmal() throws InfException{
        ArrayList<String> namnLista = idb.fetchColumn("Select namn from hallbarhetsmal;");
        ArrayList<String> beskrivningLista = idb.fetchColumn("Select beskrivning from hallbarhetsmal;");
        
        String message = null;
        String contentName = null;
        String contentBesk = null;
        for(int i = 0; i < namnLista.size(); i++){
                contentName = namnLista.get(i);
                contentBesk = beskrivningLista.get(i);
                message = message +"\n"+ contentName +"\n"+contentBesk+"\n";
        }
        return message.trim();
    }
    
    
    /**
     * Ej nöjd.
     * @return
     * @throws InfException 
     */
    public String fetchProject() throws InfException{
        ArrayList<String> namnLista = idb.fetchColumn("Select projektnamn from projekt;");
        ArrayList<String> beskrivningLista = idb.fetchColumn("Select beskrivning from projekt;");
        
        String message = null;
        String contentName = null;
        String contentBesk = null;
        for(int i = 0; i < namnLista.size(); i++){
                contentName = namnLista.get(i);
                contentBesk = beskrivningLista.get(i);
                message = message +"\n"+ contentName +"\n"+contentBesk+"\n";
        }
        return message.trim();
    }
    
    /**
     * SKA BARA VISA PÅ RÄTT AVDELNING SÅ 
     * SQL QUERRY bör ändras till where avdId = userAid's avdId
     * @return
     * @throws InfException 
     */
    public String fetchEmployees() throws InfException{
        ArrayList<String> fNamnLista = idb.fetchColumn("Select fornamn from anstalld;");
        ArrayList<String> eNamnLista = idb.fetchColumn("Select efternamn from anstalld;");
        
        String message = null;
        String contentFName = null;
        String contentEName = null;
        for(int i = 0; i < fNamnLista.size(); i++){
                contentFName = fNamnLista.get(i);
                contentEName = eNamnLista.get(i);
                message = message +"\n"+ contentFName +" "+contentEName+"\n";
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
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenyHandlaggare(userAid).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(MenyHandlaggare.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane HandläggarMeny;
    private javax.swing.JButton avdelningSok;
    private javax.swing.JTextField avdelningSokruta;
    private javax.swing.JPanel avdelningTab;
    private javax.swing.JButton hallbarhetsmalSok;
    private javax.swing.JTextField hallbarhetsmalSokruta;
    private javax.swing.JPanel hållbarhetsmalTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblSökHallbarhetsmål;
    private javax.swing.JLabel jLblSökHandläggare;
    private javax.swing.JLabel jLblSökHandläggare4;
    private javax.swing.JLabel jLblSökHandläggare5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel minaProjectField;
    private javax.swing.JLabel personalList;
    private javax.swing.JPanel profilTab;
    private javax.swing.JButton projektSok;
    private javax.swing.JTextField projektSokruta;
    private javax.swing.JPanel projektTab;
    private javax.swing.JButton samarbetspartnerSok;
    private javax.swing.JTextField samarbetspartnerSokruta;
    private javax.swing.JPanel samarbetspartnerTab2;
    private javax.swing.JButton visaKnapp;
    // End of variables declaration//GEN-END:variables
}
