/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.model;

/**
 *
 * @author Laura
 */
public class Interfaces {
     private String interfaces[];
     
     public Interfaces() {
        this.interfaces = new String [2];
        this.interfaces [1]= "index.xhtml";
        this.interfaces [2] = "sueldo.xhtml";
                
    }
     public String obtenerNombreInterfaz(int interfaceId) {
       return this.interfaces[interfaceId]; 
    }
    
}
