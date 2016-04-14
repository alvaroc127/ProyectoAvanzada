/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Negocio.Habitacion;
import Servicio.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class HabitacionJDBC {
    private String INSERTASQL="INSERT INTO habitacion (precio,tipo) VALUES (?,?)";
    private String SQL_HABITACION="SELECT * FROM habitacion ORDER BY numhab DESC";
    
    public int insertarHabit(double precio,String tipo){
        Connection cos=null;
        PreparedStatement stat=null;
        Conexion.getConexion();
        int rowns=0;
        try{
        cos=Conexion.getConecxion();
        stat=cos.prepareStatement(INSERTASQL);
        int index=1;
        stat.setDouble(index++,precio);
        stat.setString(index++, tipo);
        rowns=stat.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            Conexion.close(cos);
            Conexion.close(stat);
            return rowns;
        }
    }
    
    
    public ArrayList<Habitacion> listarHaibtacion(){
        Connection co=null;
        PreparedStatement stat=null;
        ResultSet rs=null;
        ArrayList<Habitacion> habitaciones=new ArrayList<Habitacion>();
        try{   
        co=(Connection)Conexion.getConecxion();
        stat=co.prepareStatement(SQL_HABITACION);
        rs=stat.executeQuery();
        while(rs.next()){
            Habitacion hab=new Habitacion(Integer.parseInt(rs.getString("numhab")),Double.parseDouble(rs.getString("precio")),rs.getString("tipo"));
            habitaciones.add(hab);
        }
        }catch(SQLException ex){
        ex.printStackTrace();
        }finally{
            Conexion.close(co);
            Conexion.close(stat);
        return habitaciones;
        }
    }
    
    
    
    
}
