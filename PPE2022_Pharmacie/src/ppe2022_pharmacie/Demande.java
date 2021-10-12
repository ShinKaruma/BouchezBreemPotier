package ppe2022_pharmacie;

/**
 *
 * @author sio2021
 */
public class Demande {

    @Override
    public String toString() {
        return "Demande{" + "idD=" + idD + ", service = " + service.getLibelle() + ", medicament= " + medicament.getLibelle() + ", qtte=" + qtte + '}';

    }
    
    private int idD;
    private Service service;
    private Stock medicament;
    private int qtte;

    public Demande(int idD, int idS, int idM, int qtte) {
        this.idD = idD;
        this.service = Passerelle.getService(idS);
        this.medicament = Passerelle.donnerUnStock(idM);
        this.qtte = qtte;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Stock getMedicament() {
        return medicament;
    }

    public void setMedicament(Stock medicament) {
        this.medicament = medicament;
    }

    public int getQtte() {
        return qtte;
    }

    public void setQtte(int qtte) {
        this.qtte = qtte;
    }
}
