package ppe2022_pharmacie;

public class PPE2022_Pharmacie {

    public static void main(String[] args) {
        PasserelleAuth.ConnectionBDD();
        
        /**
        *droits:
        * 1 = pharmacien
        * 2 = infirmier
        * 3 = admin 
        * */
        
        PasserelleAuth.Auth("Valentin", "12345");
    }
    
}
