/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NGO2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/*import oru.inf.InfException;
import oru.inf.InfDB;


/**
 *
 * @author meldi
 */
public class Validering {

    private final InfDB idb;
    //DENNA METOD KAN GÖRAS BÄTTRE OM ÖNSKAS MED HÅRDARE KONTROLL FYI 

    public Validering() throws InfException {
        this.idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
    }

    public static Boolean epostHarGiltigtFormat(String ePost) {
        Boolean giltigtFormat = false;

        if (ePost.endsWith("@example.com")) {
            giltigtFormat = true;
        }
        return giltigtFormat;
    }

    /**
     * metod som kollar om är admin med hjälp av epost.
     * @param ePost
     * @return true om admin, false om inte admin
     */
    private Boolean checkAdmin(String ePost) {
        Boolean adminHittad = false;

        try {
            String sqlFrågaAdmin = "select aid from admin where aid in (select aid from anstalld where epost = '" + ePost + "')";
            String anställningsIDS = idb.fetchSingle(sqlFrågaAdmin);

            if (anställningsIDS != null) {
                int anställningsIDInt = Integer.parseInt(anställningsIDS);
                adminHittad = true;
            }

        } catch (NumberFormatException | InfException ex) {
            ex.printStackTrace();

        }
        return adminHittad;
    }
    
    /**
     * metod som kollar ifall någon är projektledare med hjälp av epost
     * @param ePost
     * @return true om projektledare, false om inte
     */
    private Boolean checkProjektLedare(String ePost) {
        Boolean projektLedareHittad = false;

        try {
            String sqlFrågaProjekt = "select projektchef from projekt where projektchef in (select aid from anstalld where epost = '" + ePost + "')";
            String anställningsIDString = idb.fetchSingle(sqlFrågaProjekt);

            if (anställningsIDString != null) {
                //nedanstående rad kan eventuellt tas bort, testa 
                int anställningsIDInt = Integer.parseInt(anställningsIDString);
                projektLedareHittad = true;
            }

        } catch (NumberFormatException | InfException ex) {
            ex.printStackTrace();

        }
        return projektLedareHittad;
    }
    
    
    /**
     * Check admin med hjälp av aid
     * TODO// programmering
     * @param aid
     * @return true om admin, false om inte admin
     */
    private Boolean checkAdminAid(int aid) {
        Boolean adminHittad = false;

        try {
            String sqlFrågaAdmin = "select aid from admin where aid in (select aid from anstalld where epost = '" + aid + "')";
            String anställningsIDS = idb.fetchSingle(sqlFrågaAdmin);

            if (anställningsIDS != null) {
                int anställningsIDInt = Integer.parseInt(anställningsIDS);
                adminHittad = true;
            }

        } catch (NumberFormatException | InfException ex) {
            ex.printStackTrace();

        }
        return adminHittad;
    }
    
    /**
     * metod som kollar ifall någon är projektledare
     * TODO // programmering
     * @param aid
     * @return true om projektledare, false om inte
     */
    private Boolean checkProjektLedareAid(int aid) {
        Boolean projektLedareHittad = false;

        try {
            String sqlFrågaProjekt = "select projektchef from projekt where projektchef in (select aid from anstalld where epost = '" + aid + "')";
            String anställningsIDString = idb.fetchSingle(sqlFrågaProjekt);

            if (anställningsIDString != null) {
                //nedanstående rad kan eventuellt tas bort, testa 
                int anställningsIDInt = Integer.parseInt(anställningsIDString);
                projektLedareHittad = true;
            }

        } catch (NumberFormatException | InfException ex) {
            ex.printStackTrace();

        }
        return projektLedareHittad;
    }
}
