/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;

/**
 *
 * @author Samba
 */
public class ConnectionDB {
 
    String urlPilote="com.mysql.jdbc.Driver";//chemin pour charger le pilote
    String urlBaseDonnees="jdbc:mysql://localhost:3306/db_bosy";//chemin du chargement de la base de donnee
    Connection con;
    
    public ConnectionDB(){
      
        
//chargement de notre pilote
try{
    Class.forName(urlPilote); 
    System.out.println("Chargement du pilote réussie");
}   
catch(ClassNotFoundException ex){
    System.out.println(ex);
}
//Connexion à la base de donnee
try {
    con=DriverManager.getConnection(urlPilote,"root","");
     System.out.println("Connexion à la base de donnée réussie");
}
catch(SQLException ex){
    
}

}
Connection ObtenirConnexion(){
    return con;
}
}
    
    
 

