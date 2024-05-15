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

    private InfDB idb;
    

    public Validering() throws InfException {
        this.idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
    }

    
    public static Boolean giltigEpost(String ePost) {
        Boolean giltigtFormat = false;

        if (ePost.endsWith(".com") || ePost.endsWith(".se") || ePost.endsWith (".net") && ePost.contains("@")) {
            giltigtFormat = true;
        }
        return giltigtFormat;
    }
    
    /**
     * Metod som validerar inputs, ser till att de inte är tomma samt inte består
     * av endast blanksteg samt ser till att det inte är vad redan står i rutan.
     * @param newText
     * @param validationText
     * @return true om överens, false om inte.
     */
    public static boolean fieldValidation(String newText, String validationText) {
        boolean validated = true;
        if (newText.equals(validationText) || newText.isEmpty() || newText.isBlank()) {
            validated = false;
        }
        return validated;
    }

    

    /**
     * Check admin med hjälp av aid TODO// programmering
     *
     * @param aid
     * @return true om admin, false om inte admin
     */
    public Boolean checkAdminAid(String aid) {
        Boolean adminHittad = false;

        try {
            String sqlFrågaAdmin = "select aid from admin where aid = " + aid;
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

    public Boolean checkProjektLedareAid(String aid) {
        Boolean projektLedareHittad = false;

        try {
            String sqlFrågaProjekt = "select projektchef from projekt where projektchef = " + aid;
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
    
    public static Boolean checkDateFormat (String datum) {
       Boolean checkDateFormat = false; 
        String korrektFormat = "\\d{4}-\\d{2}-\\d{2}";
        
        if (datum.matches(korrektFormat))
        {
            checkDateFormat = true; 
        }
        
        return checkDateFormat;
    }
}
