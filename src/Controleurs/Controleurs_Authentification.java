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
public class Controleurs_Authentification {
    Authentification authentification;
    
    public static void main(String[] args){
      new Controleurs_Authentification();
    }
    /**
     * Constructeur
     */
    public Controleurs_Authentification(){
        authentification = new Authentification(this);
        authentification.setVisible(true);
        
    }

    public void setVisible(boolean b) {
      
    }

   
    
    
}

