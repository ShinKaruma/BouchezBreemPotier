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
    private String login;
    private String service;
    private int idService;

    public Utilisateur(String login, String service, int idService) {
        this.login = login;
        this.service = service;
        this.idService = idService;
    }

    public String getService() {
        return service;
    }
    
    
    
}
