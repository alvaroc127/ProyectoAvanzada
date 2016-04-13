/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author felipe
 */
public class FctoryHabitacion {

    public FctoryHabitacion() {
        
    }
    
    
    public Tipo getHabitacion(String tipo){
        Tipo hab=null;
        if(tipo.equalsIgnoreCase("suite")){
        hab=new Suite();
        }else{
            if(tipo.equalsIgnoreCase("doble")){
                hab=new Doble();
            }else{
                if(tipo.equalsIgnoreCase("sencilla")){
                    hab=new Sencilla();
                }
            }
        }
    return hab;
    }
    
}
