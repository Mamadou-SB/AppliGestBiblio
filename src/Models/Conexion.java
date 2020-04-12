/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

 /*
 * @author Samba
 */
public class Conexion {
    Connection con;
    
   public Connection getConnection() {
    
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Pilote chargée");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bosy","root","");
            System.out.println("Connexion Etablie");
           
        } 
        catch (Exception e) {
          
            System.out.println(e);}
   
        return con;
    }
    
}