/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author meldi
 */
public class StartClass {
    private static InfDB idb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        // TODO code application logic here
        idb = new InfDB("ngo_2024","3306", "dbAdmin2024","dbAdmin2024PW");
        //new Inloggning(idb).setVisible(true);
        System.out.println("funkar");
    }
        catch (InfException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
