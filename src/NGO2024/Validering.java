/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NGO2024;

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
        
        
            
}

