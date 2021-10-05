package ppe2022_pharmacie;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

public class Passerelle {

    private static String url = "jdbc:postgresql://192.168.1.245:5432/PPE2022_Hopital_Pharmacie_BBP";
    private static String user = "potier";
    private static String passwd = "potier";
    private static Connection pdo;

    public Passerelle(String pUrl, String pUser, String pPasswd) {
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
        int[] infos = new int[3];
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "Select count(*), service, idpersonnel from authentification where login ='" + login + "' and passe='" + password + "' group by service, idpersonnel";
            ResultSet authResultat = state.executeQuery(requete);
            if (authResultat.next()) {
                infos[0] = authResultat.getInt(1);
                infos[1] = authResultat.getInt(2);
                infos[2] = authResultat.getInt(3);
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur Dans la connexion");
        }
        return infos;
    }

    public static String getHashMdp(String login) {
        String info = "";
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "select passe from authentification where login = '" + login + "'";
            ResultSet authResultat = state.executeQuery(requete);
            if (authResultat.next()) {
                info = authResultat.getString(1);
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération du mdp");
        }
        return info;
    }

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
            String requete = "select * from stock where categorie = \'" + pCategorie + "\'";
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
//            System.out.println(e);
//            System.out.println("Erreur insertion demande");
//        }
//    }

    public static void ajouterUtilisateur(String login, String passe, int service) {
        if (pdo == null) {
            Connection();
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte raw[] = md.digest(passe.getBytes("UTF-8"));
            String hash;
            hash = DatatypeConverter.printHexBinary(raw);
            System.out.println(hash);

            String requete = "insert into authentification (login, passe, service) values(?, ?, ?)";
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setString(1, login);
            prepare.setString(2, hash);
            prepare.setInt(3, service);
            prepare.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans l'ajout d'un utilisateur");
        }
    }

    public static String getService(int idService) {
        String requete = "select libelle from service where idservice = " + idService;
        String service = "";
        try {
            Statement state = pdo.createStatement();
            ResultSet serviceResultat = state.executeQuery(requete);
            if (serviceResultat.next()) {
                service = serviceResultat.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération du service");
        }
        return service;
    }

    public static ArrayList<Utilisateur> getTousLesUser() {
        String requete = "select login, service.libelle, service, idpersonnel from authentification join service on authentification.service = service.idservice";
        ArrayList<Utilisateur> lesUsers = new ArrayList<>();
        try {
            Statement state = pdo.createStatement();
            ResultSet userResultat = state.executeQuery(requete);
            while (userResultat.next()) {
                String login = userResultat.getString(1);
                String service = userResultat.getString(2);
                int idService = userResultat.getInt(3);
                int idUser = userResultat.getInt(4);

                lesUsers.add(new Utilisateur(login, service, idService, idUser));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération des users");
        }
        return lesUsers;
    }

    public static void delUnUser(int idUser) {
        String requete = "delete from authentification where idpersonnel=?";
        try {
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setInt(1, idUser);
            prepare.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la suppression d'un utilisateur");
        }
    }

    public static void validerQtte(int qtteD, int idM) {

        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "UPDATE stock SET qtte=" + qtteD + " WHERE idm=" + idM;
            int r = state.executeUpdate(requete);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Aucune Demande ou id");
        }

    }

    public static int avoirQtte(int idD) {
        int qtteD = 0;
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "SELECT qtte FROM demande WHERE 'idD'=" + idD;
            ResultSet qtteResultat = state.executeQuery(requete);

            if (qtteResultat.next()) {
                qtteD = qtteResultat.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Aucune Demande ou id");
        }
        return qtteD;
    }

    public static ArrayList<Demande> AfficherDemande() {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Demande> lesDemandes = new ArrayList<Demande>();
        try {
            Statement state = pdo.createStatement();
            String requete = "SELECT * FROM demande";
            ResultSet demandeResultat = state.executeQuery(requete);

            while (demandeResultat.next()) {
                int idD = demandeResultat.getInt(1);
                int idS = demandeResultat.getInt(2);
                int idM = demandeResultat.getInt(3);
                int qtte = demandeResultat.getInt(4);
                Demande uneDemande = new Demande(idD, idS, idM, qtte);
                lesDemandes.add(uneDemande);
            }
            demandeResultat.close();
            state.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Aucune Demande ou id");
        }
        return lesDemandes;
    }

    public static ArrayList<Service> getTousLesServices() {
        ArrayList<Service> lesService = new ArrayList<>();
        String requete = "select * from service";
        try {
            Statement state = pdo.createStatement();
            ResultSet serviceResultat = state.executeQuery(requete);
            while (serviceResultat.next()) {
                int idService = serviceResultat.getInt(1);
                String libelle = serviceResultat.getString(2);
                lesService.add(new Service(idService, libelle));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération des services");
        }
        return lesService;
    }

    public static int getIdService(String libelle) {
        int idService = 0;
        try {
            Statement state = pdo.createStatement();
            String requete = "select idservice from service where libelle='" + libelle+"'";
            ResultSet authResultat = state.executeQuery(requete);
            if (authResultat.next()) {
                idService = authResultat.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération des services");
        }
        return idService;
    }
}
