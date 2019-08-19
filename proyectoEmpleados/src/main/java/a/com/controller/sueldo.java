/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Laura
 * @author Yesid
 */
@Named(value = "sueldo")
@RequestScoped
public class sueldo {

    /**
     * Creates a new instance of sueldo
     */
    //en esta variable se almacena el nombre que llega del Bean controllerFormulario
    private String nombre;
    //en esta variable se almacena el salario que llega del Bean controllerFormulario
    private double salario;
    //en esta variable se los dias que llegan del Bean controllerFormulario
    private int dias;
    //en esta variable se almacenan los idiomasque llegan del Bean controllerFormulario
    private String idiomas[];
    //en esta variable se almacena valor del sueldo total
    private double salarior;
    
    //constructor vacio del Bean Sueldo
    public sueldo() {
    }

    //constructor que inicializa las variables del Bean
    public sueldo(String nombre, double salario, int dias, String[] idiomas) {
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

    //Get que permite btener el salario que esta guardado en la variable
    public double getSalarior() {
        return salarior;
    }

    //Set que permite editar el salario que esta almacenado en la variable
    public void setSalarior(double salarior) {
        this.salarior = salarior;
    }
    
    
    //metodo que calcula el sueldo total de una persona
    public double calcularSueldo (double salario){
        
        salario= salario*dias;
        
        for (int i=0; i< idiomas.length; i++){
            if(idiomas [i] == "español"){
               salario = salario+100000;
            }
            else  if(idiomas [i] == "ingles"){
               salario = salario+200000;
            }else  if(idiomas [i] == "frances"){
               salario = salario+300000;
            }else  if(idiomas [i] == "Aleman"){
               salario = salario+500000;
            }
            
        }
        return salario;
    }   
    
}
