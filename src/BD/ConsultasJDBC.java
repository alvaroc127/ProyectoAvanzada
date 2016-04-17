/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Negocio.FctoryHabitacion;
import Negocio.Habitacion;
import Servicio.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author felipe
 */
public class ConsultasJDBC {
  //Habitaciones disponibles
   private final String SQL_SELECT1=
           "select * from v3 where idhotel=?";
   
   public List<Habitacion> select1(int codHotel){
       Connection  conn =null;
       PreparedStatement stat=null;
       ResultSet rs=null;
       FctoryHabitacion fac=new FctoryHabitacion();
       Habitacion habitacion=null;
       List<Habitacion>habitaciones =new ArrayList<Habitacion>();
       try{
       int index=1;
       conn= (Connection) Conexion.getConecxion();      
       stat =conn.prepareStatement(SQL_SELECT1);
       stat.setInt(index++,codHotel);
       rs=stat.executeQuery();
       while(rs.next()){
       habitacion=new Habitacion(Integer.parseInt(rs.getString("numhab")),Double.parseDouble(rs.getString("precio")),fac.getHabitacion(rs.getString("tipo")));

            habitaciones.add(habitacion);
       }
       }catch(SQLException ex){
       ex.printStackTrace();
       }
       finally{
           Conexion.close(stat);
           Conexion.close(conn);
           Conexion.close(rs);
           return habitaciones;
       }
    }
}

    

