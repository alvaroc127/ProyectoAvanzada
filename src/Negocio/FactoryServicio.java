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
public class FactoryServicio {
    
    public FactoryServicio() {
    }
    
    public Categoria getSevicio(String tipc){
        if(tipc.equalsIgnoreCase("Especial")){
            return (Categoria) new Especial();
        }else{
               if(tipc.equalsIgnoreCase("Basico")){
               return (Categoria) new Basico();
               }
        }    
    return null;
    }
    
    
}
