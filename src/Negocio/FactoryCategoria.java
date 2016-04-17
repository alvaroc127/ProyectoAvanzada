/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;

/**
 *
 * @author felipe
 */
public class FactoryCategoria {

    public FactoryCategoria() {
    }
    
    public Categoria getCategoria(String tipc,Date antigu){
        FactoriaDescuento fd=new FactoriaDescuento();
        if(tipc.equalsIgnoreCase("Golden")){
            Categoria ca=new Golden(antigu,fd.getDescuento("normal"));
            return ca;
        }else{
               if(tipc.equalsIgnoreCase("premiun")){
                   Categoria c1=new Premiun(antigu,fd.getDescuento("Especial1"));
               return c1;
               }
        }    
    return null;
    }
    
}
