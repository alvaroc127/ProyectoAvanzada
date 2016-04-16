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
public class FactoryCategoria {

    public FactoryCategoria() {
    }
    
    public Categoria getCategoria(String tipc){
        if(tipc.equalsIgnoreCase("Golden")){
            return new Golden();
        }else{
               if(tipc.equalsIgnoreCase("premiun")){
               return new Premiun();
               }
        }    
    return null;
    }
    
}
