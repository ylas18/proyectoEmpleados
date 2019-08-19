/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Laura
 * @author Yesid
 */
@Named(value = "controllerFormulario")
@RequestScoped 
public class controllerFormulario {

    /**
     * Creates a new instance of controllerFormulario
     */
    //variable donde se almacena el nombre que digita el ususario
    private String nombre;
    //variable donde se almacena el sueldo que digita el ususario
    private double salario;
    //variable donde se almacenan los dias  que digita el ususario
    private int dias;
    //variable donde se almacenan los idiomas que seleccionan el usuario
    private String idiomas[];
    
    //constriucctor vacio del Bean
    public controllerFormulario() {
    }

    //constructor que inicializa las variables del Bean
    public controllerFormulario(String nombre, double salario, int dias, String[] idiomas) {
        this.nombre = nombre;
        this.salario = salario;
        this.dias = dias;
        this.idiomas = idiomas;
    }
 
    //Get que permite obtener el nombre que esta almacenado en la variable
    public String getNombre() {
        return nombre;
    }

    //Set que permite editar el nombre que esta almacenado en la variable
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Get que permite obtener el salario que esta almacenado en la variable
    public double getSalario() {
        return salario;
    }

    //Set que permite editar el salario que esta almacenado en la variable
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Get que permite obtener los dias que estan almacenados en la variable
    public int getDias() {
        return dias;
    }

    //Set que permite editar los dias  que estan almacenado en la variable
    public void setDias(int dias) {
        this.dias = dias;
    }
    
    //Get que permite obtener los idiomas que estan almacenados en la variable
    public String[] getIdiomas() {
        return idiomas;
    }

    //Get que permite editar los idiomas que estan almacenado en la variable
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    
  
    
    //metodo que envia los al Bean sueldo
    public String  enviarDatos (){
        FacesContext context = FacesContext.getCurrentInstance();
        sueldo res = context.getApplication().evaluateExpressionGet(context, "#{sueldo}", sueldo.class);
        
        res.setNombre(nombre);
        res.setSalario(salario);
        res.setDias(dias);
        res.setIdiomas(idiomas);
        return "sueldo";
     
    }
     
}
