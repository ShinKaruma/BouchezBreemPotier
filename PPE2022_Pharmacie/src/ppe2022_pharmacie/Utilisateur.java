/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppe2022_pharmacie;

/**
 *
 * @author sio2021
 */
public class Utilisateur {
    private int idUser;
    private String login;
    private Service unService;

    public Utilisateur(String login, String service, int idService, int idUser) {
        this.login = login;
        this.unService = new Service(idService, service);
        this.idUser = idUser;
    }

    public Service getService() {
        return unService;
    }

    public String getLogin() {
        return login;
    }
    
    public int getIdUser(){
        return idUser;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setService(Service service) {
        this.unService = service;
    }

    
    
    @Override
    public String toString() {
        return "login=" + login + " | service=" + unService.getLibelle() + " | idService=" + unService.getIdService();
    }
    
    
    
}
