/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleurs;

import Vues.Authentification;
/**
 *
 * @author Samba
 */
public class C_Authentification {
    private Authentification authentification;
    
    public static void main(String[] args){
      new C_Authentification();
    }
    /**
     * Constructeur
     */
    public C_Authentification(){
        authentification = new Authentification(this);
        authentification.setVisible(true);
        
    }
    
    
    
}

