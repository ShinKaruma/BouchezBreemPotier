package ppe2022_pharmacie;

/**
 *
 * @author sio2021
 */
public class Demande {

    @Override
    public String toString() {
        return "Demande{" + "idD=" + idD + ", idS=" + unService + ", idM=" + unMedicament + ", qtte=" + qtte + '}';
    }
    
    private int idD;
    private Service unService;
    private Stock unMedicament;
    private int qtte;

    public Demande(int idD, Service unService,Stock unMedicament, int qtte) {
        this.idD = idD;
        this.unService = unService;
        this.unMedicament =unMedicament ;
        this.qtte = qtte;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public Service getUnService() {
        return unService;
    }

    public void setUnService(Service unService) {
        this.unService = unService;
    }

    public Stock getUnMedicament() {
        return unMedicament;
    }

    public void setUnMedicament(Stock unMedicament) {
        this.unMedicament = unMedicament;
    }

    

    

    public int getQtte() {
        return qtte;
    }

    public void setQtte(int qtte) {
        this.qtte = qtte;
    }
}
