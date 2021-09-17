package ppe2022_pharmacie;

public class Stock {
    //Attribut
    private int id;
    private String libelle;
    private int qtteStock;
    
    //Constructeur
    public Stock(int pId, String pLibelle, int pQtteStock){
        id = pId;
        libelle = pLibelle;
        qtteStock = pQtteStock;
    }
    
    //Accesseur

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getQtteStock() {
        return qtteStock;
    }
    
    //Mutateur

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQtteStock(int qtteStock) {
        this.qtteStock = qtteStock;
    }
    
    //Méthode

    @Override
    public String toString() {
        return "| id: "+id+" | Libelle: "+libelle+" | Quantitée en Stock: "+qtteStock+"\n";
    }
    
}
