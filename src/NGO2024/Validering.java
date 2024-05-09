/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NGO2024;

import oru.inf.InfException;

/*import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author meldi
 */
public class Validering {
    
    //DENNA METOD KAN GÖRAS BÄTTRE OM ÖNSKAS MED HÅRDARE KONTROLL FYI 
    public static Boolean epostHarGiltigtFormat(String ePost){
        Boolean giltigtFormat = false;
   
            if (ePost.endsWith("@example.com")){
                giltigtFormat = true; 
                }
                return giltigtFormat;
        }
    

    /**
     * Check admin
     * @param ePost
     * @return true om admin, false om inte admin
     */
    private Boolean checkAdmin (String ePost)
    {
        Boolean adminHittad = false; 
        
        try { 
            String sqlFrågaAdmin = "select aid from admin where aid in (select aid from anstalld where epost = '" + ePost + "')";
            String anställningsIDS = idb.fetchSingle(sqlFrågaAdmin);
            
        if (anställningsIDS != null)
        {
           int anställningsIDInt = Integer.parseInt(anställningsIDS);
            adminHittad = true;
        }
        
        }
        
        catch(NumberFormatException | InfException ex){
            ex.printStackTrace();
            
        }
        return adminHittad; 
    }
    
    private Boolean checkProjektLedare (String ePost)
    {
        Boolean projektLedareHittad = false; 
        
        try { 
            String sqlFrågaProjekt = "select projektchef from projekt where projektchef in (select aid from anstalld where epost = '" + ePost + "')";
            String anställningsIDString = idb.fetchSingle(sqlFrågaProjekt);
            
        if (anställningsIDString != null)
        {
            //nedanstående rad kan eventuellt tas bort, testa 
           int anställningsIDInt = Integer.parseInt(anställningsIDString);
            projektLedareHittad = true;
        }
        
        }
        
        catch(NumberFormatException | InfException ex){
            ex.printStackTrace();
            
        }
        return projektLedareHittad; 
    }
            
}

