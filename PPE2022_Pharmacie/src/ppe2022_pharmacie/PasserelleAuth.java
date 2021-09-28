package ppe2022_pharmacie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PasserelleAuth {

    private static String url = "jdbc:postgresql://192.168.1.245:5432/PPE2022_Hopital_Pharmacie_BBP";
    private static String user = "potier";
    private static String passwd = "potier";
    private static Connection pdo;

    public PasserelleAuth(String pUrl, String pUser, String pPasswd) {
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

    public static int[] Authentification(String login, String password) {
        int[] infos = new int[2];
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "Select count(*), droits from authentification where login ='" + login + "' and passe='" + password + "' group by droits";
            ResultSet authResultat = state.executeQuery(requete);
            if (authResultat.next()) {
                infos[0] = authResultat.getInt(1);
                infos[1] = authResultat.getInt(2);
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur Dans la connexion");
        }
        return infos;
    }

//    public static String getHashMdp(String login) {
//        if (pdo == null) {
//            Connection();
//        }
//    }

    public static ArrayList<Stock> donnerTousLesStocks() {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Stock> lesStocks = new ArrayList<Stock>();
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from stock";
            ResultSet stockResultat = state.executeQuery(requete);
            while (stockResultat.next()) {
                int id = stockResultat.getInt(1);
                String libelle = stockResultat.getString(2);
                int qtteStock = stockResultat.getInt(3);
                int seuil = stockResultat.getInt(4);
                String categorie = stockResultat.getString(5);
                Stock unStock = new Stock(id, libelle, qtteStock, seuil, categorie);
                lesStocks.add(unStock);
            }
            stockResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return lesStocks;
    }

    public static ArrayList<Stock> donnerStockSeuil() {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Stock> lesStocks = new ArrayList<Stock>();
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from stock where qtte <= seuil";
            ResultSet stockResultat = state.executeQuery(requete);
            while (stockResultat.next()) {
                int id = stockResultat.getInt(1);
                String libelle = stockResultat.getString(2);
                int qtteStock = stockResultat.getInt(3);
                int seuil = stockResultat.getInt(4);
                String categorie = stockResultat.getString(5);
                Stock unStock = new Stock(id, libelle, qtteStock, seuil, categorie);
                lesStocks.add(unStock);
            }
            stockResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return lesStocks;
    }
    
    public static ArrayList<String> donnerCategorie() {
        if (pdo == null) {
            Connection();
        }
        ArrayList ArrayCategorie = new ArrayList();
        try {
            Statement state = pdo.createStatement();
            String requete = "select distinct categorie from stock";
            ResultSet stockResultat = state.executeQuery(requete);
            String Tous = "Tous";
            ArrayCategorie.add(Tous);
            while (stockResultat.next()) {
                String categorie = stockResultat.getString(1);
//                Stock unStock = new Stock(categorie);
                ArrayCategorie.add(categorie);
            }
            stockResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return ArrayCategorie;
    }  
    
    public static ArrayList<Stock> AfficheEnFonctionCategorie(String pCategorie) {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Stock> lesStocks = new ArrayList<Stock>();
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from stock where categorie = \'"+pCategorie+"\'";
            ResultSet stockResultat = state.executeQuery(requete);
            while (stockResultat.next()) {
                int id = stockResultat.getInt(1);
                String libelle = stockResultat.getString(2);
                int qtteStock = stockResultat.getInt(3);
                int seuil = stockResultat.getInt(4);
                String categorie = stockResultat.getString(5);
                Stock unStock = new Stock(id, libelle, qtteStock, seuil, categorie);
                lesStocks.add(unStock);
            }
            stockResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return lesStocks;
    }
//    public void CreaDemande(Demande uneDemande) {
//        if (pdo == null) {
//            Connection();
//        }
//        try{
//            String requete = "insert into demande values (?, ?, ?, ?)";
//            PreparedStatement prepare = pdo.prepareStatement(requete);
//            prepare.setInt(1, uneDemande.getIdD());
//            prepare.setInt(2, uneDemande.getIdS());
//            prepare.setInt(3, uneDemande.getIdM());
//            prepare.setInt(4, uneDemande.getQtte());
//            int res = prepare.executeUpdate();   
//        }
//        catch(Exception e){
//            
//        }
//    }
}
