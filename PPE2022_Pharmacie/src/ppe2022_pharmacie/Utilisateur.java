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
    private String service;
    private int idService;

    public Utilisateur(String login, String service, int idService, int idUser) {
        this.login = login;
        this.service = service;
        this.idService = idService;
        this.idUser = idUser;
    }

    public String getService() {
        return service;
    }

    public String getLogin() {
        return login;
    }
    
    public int getIdUser(){
        return idUser;
    }

    @Override
    public String toString() {
        return "login=" + login + " | service=" + service + " | idService=" + idService;
    }
    
    
    
}
