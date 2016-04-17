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
public class FactoriaDescuento{

    public FactoriaDescuento() {
    }
    
    
    public Descuento getDescuento(String tipo){
        if(tipo.equalsIgnoreCase("normal")){
            return new Normal(5);
    }else{
           if(tipo.equalsIgnoreCase("especial1")){
           return new Especial1(10);
           }
            }
    return null;
    }
    
}
