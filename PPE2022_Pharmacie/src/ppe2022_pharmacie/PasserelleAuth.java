package ppe2022_pharmacie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PasserelleAuth {
    private static String url = "jdbc:postgresql://192.168.1.245:5432/PPE2022_Hopital_Pharmacie_BBP";
    private static String user = "potier";
    private static String passwd = "potier";
    private static Connection pdo;

    private static Object outputgetClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public PasserelleAuth(String pUrl, String pUser, String pPasswd){
        url = pUrl;
        user = pUser;
        passwd = pPasswd;
    }
    
    public static void ConnectionBDD() {
        //Etablir connexion
        try {
            pdo = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        } catch (Exception e) {
            System.out.println("Connexion refusé !");
            System.out.println(e.getMessage());
        }
    }
    
    public static void Auth(String login, String password){
        try {
        Statement state = pdo.createStatement();
        String requete = "SELECT count(*) FROM authentification WHERE login = "+login+" AND password = "+password;
        ResultSet output = state.executeQuery(requete);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur login");
        }
        
    }
}
