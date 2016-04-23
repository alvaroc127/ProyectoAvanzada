/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Negocio.FctoryHabitacion;
import Negocio.Habitacion;
import Negocio.Tipo;
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
    private final String INSERTASQL="INSERT INTO habitacion (precio,tipo,idhotel) VALUES (?,?,?)";
    private final String SQL_HABITACION=
            "SELECT * FROM habitacion natural join hotel where idhotel=?";    
    public int insertarHabit(double precio,String tipo,int idhotel){
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
        stat.setInt(index++,idhotel);
        rowns=stat.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            Conexion.close(cos);
            Conexion.close(stat);
            return rowns;
        }
    }
    
    
    public ArrayList<Habitacion> listarHaibtacion(int idhotel){
        Connection co=null;
        PreparedStatement stat=null;
        ResultSet rs=null;
        FctoryHabitacion fac=new FctoryHabitacion();
        ArrayList<Habitacion> habitaciones=new ArrayList<Habitacion>();
        try{
        int index=1;
        co=(Connection)Conexion.getConecxion();
        stat=co.prepareStatement(SQL_HABITACION);
        stat.setInt(index++,idhotel);
        rs=stat.executeQuery();
        while(rs.next()){
            Habitacion hab1=new Habitacion(Integer.parseInt(rs.getString("numhab")),Double.parseDouble(rs.getString("precio")),fac.getHabitacion(rs.getString("tipo")));
            habitaciones.add(hab1);
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
