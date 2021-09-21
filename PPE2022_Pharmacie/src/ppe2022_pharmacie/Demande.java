/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe2022_pharmacie;

/**
 *
 * @author sio2021
 */
public class Demande {

    private int idD;
    private int idS;
    private int idM;
    private int qtte;

    public Demande(int idD, int idS, int idM, int qtte) {
        this.idD = idD;
        this.idS = idS;
        this.idM = idM;
        this.qtte = qtte;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public int getQtte() {
        return qtte;
    }

    public void setQtte(int qtte) {
        this.qtte = qtte;
    }

}
