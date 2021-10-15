package ppe2022_pharmacie;

/**
 *
 * @author sio2021
 */
public class Demande {
    
    private final ServiceDAO passerelleService = new ServiceDAO();
    
    private final MedicamentDAO passerelleMedicament = new MedicamentDAO();

    @Override
    public String toString() {
        return "Demande{" + "idD=" + idD + ", service = " + service.getLibelle() + ", medicament= " + medicament.getLibelle() + ", qtte=" + qtte + '}';

    }
    
    private int idD;
    private Service service;
    private Medicament medicament;
    private int qtte;

    public Demande(int idD, int idS, int idM, int qtte) {
        this.idD = idD;
        this.service = passerelleService.find(idS);
        this.medicament = passerelleMedicament.find(idM);
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

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public int getQtte() {
        return qtte;
    }

    public void setQtte(int qtte) {
        this.qtte = qtte;
    }
}
