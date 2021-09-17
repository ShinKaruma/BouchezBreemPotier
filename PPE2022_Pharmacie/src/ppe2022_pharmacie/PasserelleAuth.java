package ppe2022_pharmacie;

import java.sql.Connection;
import java.sql.DriverManager;

public class PasserelleAuth {
    private static String url = "jdbc:postgresql://192.168.1.245:5432/PPE2022_Hopital_Pharmacie_BBP";
    private static String user = "potier";
    private static String passwd = "potier";
    private static Connection pdo;
    
    
    public PasserelleAuth(String pUrl, String pUser, String pPasswd){
        url = pUrl;
        user = pUser;
        passwd = pPasswd;
    }
    
    public static void Connection() {
        //Etablir connexion
        try {
            pdo = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        } catch (Exception e) {
            System.out.println("Connexion refusé !");
            System.out.println(e.getMessage());
        }
    }
}
