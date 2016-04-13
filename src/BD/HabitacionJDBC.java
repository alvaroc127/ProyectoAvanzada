/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Servicio.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author felipe
 */
public class HabitacionJDBC {
    private String insertarCliente="";
    
    
    public int insertarHabit(double precio){
        Connection cos=null;
        PreparedStatement stat;
        Conexion.getConexion();
        int index=1;
        try{
        cos=Conexion.getConecxion();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        //stat=cos.prepareStatement();
    
    
    return 0;
    }
    
    
    
}
