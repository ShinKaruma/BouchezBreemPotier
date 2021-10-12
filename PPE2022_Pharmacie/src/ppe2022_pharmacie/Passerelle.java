
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
    
    public static ArrayList<Commandes> donnerToutesLesCommandes() {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Commandes> lesCommandes = new ArrayList<Commandes>();
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from commandes";
            ResultSet commandesResultat = state.executeQuery(requete);
            while (commandesResultat.next()) {
                int idc = commandesResultat.getInt(1);
                String fournisseur = commandesResultat.getString(2);
                String medicament = commandesResultat.getString(3);
                int qtte = commandesResultat.getInt(4);
                Commandes uneCommande = new Commandes(idc, fournisseur, medicament, qtte);
                lesCommandes.add(uneCommande);
            }
            commandesResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner toutes les commandes");
        }
        return lesCommandes;
    }

    public static Stock donnerUnStock(int idM) {
        if (pdo == null) {
            Connection();
        }
        Stock unMedic=null;
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from stock where idm=?";
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setInt(1, idM);
            
            
            ResultSet res=prepare.executeQuery();
            if(res.next()){
                int id = res.getInt(1);
                String libelle = res.getString(2);
                int qtteStock = res.getInt(3);
                int seuil = res.getInt(4);
                String categorie = res.getString(5);
                unMedic = new Stock(id, libelle, qtteStock, seuil, categorie);
            }

            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return unMedic;
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
    
    public static ArrayList<String> donnerFournisseur() {
        if (pdo == null) {
            Connection();
        }
        ArrayList ArrayFournisseur = new ArrayList();
        try {
            Statement state = pdo.createStatement();
            String requete = "select distinct nom from fournisseur";
            ResultSet stockResultat = state.executeQuery(requete);
            while (stockResultat.next()) {
                String fournisseur = stockResultat.getString(1);
//                Stock unStock = new Stock(categorie);
                ArrayFournisseur.add(fournisseur);
            }
            stockResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return ArrayFournisseur;
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

    public static ArrayList<Stock> listerMedicament(String pMedicament) {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Stock> lesMedicaments = new ArrayList<Stock>();
        try {
            Statement state = pdo.createStatement();
            String requete = "select * from stock ";
            ResultSet medicResultat = state.executeQuery(requete);
            while (medicResultat.next()) {
                int id = medicResultat.getInt(1);
                String libelle = medicResultat.getString(2);
                int qtteStock = medicResultat.getInt(3);
                int seuil = medicResultat.getInt(4);
                String categorie = medicResultat.getString(5);
                Stock unMedic = new Stock(id, libelle, qtteStock, seuil, categorie);
                lesMedicaments.add(unMedic);
            }
            medicResultat.close();
            state.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur donner tous les stocks");
        }
        return lesMedicaments;
    }


    public static void CreaDemande(int idServ, int idMed, int qtte) {
        if (pdo == null) {
            Connection();
        }
        try {
            String requete = "insert into demande (idservice, idmedicament, quantite) values (?, ?, ?)";
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setInt(1, idServ);
            prepare.setInt(2, idMed);
            prepare.setInt(3, qtte);
            int res = prepare.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur insertion demande");
        }

    }

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
    
    public static boolean ajouterCommande(String fournisseur, String medicament, int qtte) {
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete1 = "select max(idc) from commandes";
            ResultSet stockResultat = state.executeQuery(requete1);
            if(stockResultat.next()){
                int idc = stockResultat.getInt(1) + 1;
                String requete2 = "insert into commandes (idc,fournisseur, medicament, qtte) values(?, ?, ?, ?)";
                PreparedStatement prepare = pdo.prepareStatement(requete2);
                prepare.setInt(1, idc);
                prepare.setString(2, fournisseur);
                prepare.setString(3, medicament);
                prepare.setInt(4, qtte);
                prepare.executeUpdate();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans l'ajout de la commande");
        }
        return true;
    }

    public static Service getService(int idService) {
        String requete = "select libelle from service where idservice = " + idService;
        Service service = null;
        String libelleService;
        try {
            Statement state = pdo.createStatement();
            ResultSet serviceResultat = state.executeQuery(requete);
            if (serviceResultat.next()) {
                libelleService = serviceResultat.getString(1);
                service = new Service(idService, libelleService);
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

    public static void validerQtte(int qtteD, int qtteM, int idM) {
        int qtteF = qtteM - qtteD;
        if (pdo == null) {
            Connection();
        }
        try {
            Statement state = pdo.createStatement();
            String requete = "UPDATE stock SET qtte=" + qtteF + " WHERE idm=" + idM;
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
            String requete = "SELECT qtte FROM stock WHERE idm=" + idD;
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

    public static void SupprDemande(int idD) {
        if (pdo == null) {
            Connection();
        }
        try {
            String requete = "delete from demande where iddemande=?";
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setInt(1, idD);
            prepare.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la suppression d'une Demande");
        }
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
            String requete = "select idservice from service where libelle='" + libelle + "'";
            ResultSet authResultat = state.executeQuery(requete);
            if (authResultat.next()) {
                idService = authResultat.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la récupération de l'id service");
        }
        return idService;
    }
    
    public static void modifUser(Utilisateur unUser, String passe){
        String requete = "Update authentification set login = ?, passe=?, service=? where idpersonnel=?";
         try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte raw[] = md.digest(passe.getBytes("UTF-8"));
            String hash;
            hash = DatatypeConverter.printHexBinary(raw);
            
            PreparedStatement prepare = pdo.prepareStatement(requete);
            prepare.setString(1, unUser.getLogin());
            prepare.setString(2, hash);
            prepare.setInt(3, unUser.getService().getIdService());
            prepare.setInt(4, unUser.getIdUser());
            prepare.executeUpdate();
            
            
         }catch (Exception e) {
            System.out.println(e);
            System.out.println("Erreur dans la modification de l'utilisateur");
        }
    }
    
    public static ArrayList<Demande> AfficherDemandeParService(int idService) {
        if (pdo == null) {
            Connection();
        }
        ArrayList<Demande> lesDemandes = new ArrayList<Demande>();
        try {
            Statement state = pdo.createStatement();
            String requete = "SELECT * FROM demande where ids="+idService;
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
}
