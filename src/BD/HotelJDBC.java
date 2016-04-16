package BD;

import Negocio.Habitacion;
import Negocio.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Servicio.Conexion;
import com.sun.org.omg.SendingContext.CodeBase;
import java.util.ArrayList;

public class HotelJDBC {
    
   private final  String SQL_INSERT_HOT=
    "INSERT INTO Hotel (nomhotel,dirhotel,estrellas,idciudad,telhotel) VALUES(?,?,?,?,?)";
    
   private final String SQL_UPDATE_HOT=
           "UPDATE  Hotel set nomhotel=?,dirhotel=?,estrellas=?,idciudad=?,telhotel=? WHERE idhotel=?";
   private final String SQL_DELETE_HOT=
           "DELETE Hotel WHERE idhotel= ?";
   private final String SQL_LISTA=
           "SELECT * FROM v1";
   
   private final String SQL_NomCiu=
           "SELECT nomciudad from ciudad ORDER BY idciudad DESC";
   
    
   
   public int insert(String nomhotel,String dirhotel,int estrellas,int idciudad,int telhotel){
        Connection conn=null;
        PreparedStatement stat= null;
        ResultSet rs= null;
        int rows=0;
        try{
        Conexion.getConexion();
        conn= (Connection)Conexion.getConecxion();
        stat= conn.prepareStatement(SQL_INSERT_HOT);
        int index=1;
        stat.setString(index++,nomhotel);
        stat.setString(index++,dirhotel);
        stat.setInt(index++,estrellas);
        stat.setInt(index++,idciudad);
        stat.setInt(index++,telhotel);
            System.out.println("Ejecutando Query"+SQL_INSERT_HOT);
            rows=stat.executeUpdate();//NOmero de registros afectado
            System.out.println("registros afectado"+rows);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    finally{
            Conexion.close(stat);        
            Conexion.close(conn);
            return rows;
        }
    }
   
    public int update (String nomhotel,String dirhotel,int estrellas,int idciudad,int telhotel,int idhotel){
    Connection conn=null;
        PreparedStatement stat= null;
        ResultSet rs= null;
        int rows=0;
        try{
        conn= (Connection)Conexion.getConecxion();
        stat= conn.prepareStatement(SQL_UPDATE_HOT);
        int index=1;
        stat.setString(index++,nomhotel);
        stat.setString(index++,dirhotel);
        stat.setInt(index++,estrellas);
        stat.setInt(index++,idciudad);
        stat.setInt(index++,telhotel);
        stat.setInt(index++,idhotel);
            System.out.println("Ejecutando Query"+SQL_UPDATE_HOT);
            rows=stat.executeUpdate();
                System.out.println("registros afectado"+rows);
        }catch(SQLException ex){
            System.err.println("No realizo");
            ex.printStackTrace();
        }
    finally{
            Conexion.close(stat);        
            Conexion.close(conn);
            return rows;
        }
    } 
    
     public int delete(int idhotel){
        Connection conn=null;
        PreparedStatement stat= null;
        ResultSet rs= null;
        int rows=0;
        try{
        conn= (Connection)Conexion.getConecxion();
        stat= conn.prepareStatement(SQL_DELETE_HOT);
        int index=1;
        stat.setInt(index++,idhotel);
        System.out.println("Ejecutando Query"+SQL_DELETE_HOT);
            rows=stat.executeUpdate();
        }catch(SQLException es){
        es.printStackTrace();
        }finally{
          Conexion.close(stat);        
            Conexion.close(conn);
            return rows;
     }
   }  
     
   public ArrayList<Hotel> listaHot(){
       Connection co=null;
       PreparedStatement stat=null;
       ResultSet rs=null;
       ArrayList<Hotel> hot=new ArrayList();
       int rows=0,idciudad=0;
       try{
       co=Conexion.getConecxion();
       stat=co.prepareStatement(SQL_LISTA);
       rs=stat.executeQuery();
       while(rs.next()){
           //idciudad=Integer.parseInt(rs.getString("idciudad"));
           //Hotel h=new Hotel(rs.getString("nomhotel"),rs.getString("nomciudad"),idciudad,Integer.parseInt(rs.getString("idhotel")),Integer.parseInt(rs.getString("estrellas")),Integer.parseInt("telHotel"));
           Hotel h=new Hotel(rs.getString("nomhotel"),rs.getString("nomciudad"),Integer.parseInt(rs.getString("idciudad")));
           h.setNumeroEstrellas(Integer.parseInt(rs.getString("estrellas")));
           h.setTelHot(Integer.parseInt(rs.getString("telhotel")));
           h.setId_hotel(Integer.parseInt(rs.getString("idhotel")));
           hot.add(h);
       }
       }catch(SQLException es){
           es.printStackTrace();
       }finally{
           Conexion.close(co);
           Conexion.close(rs);
           Conexion.close(stat);
           return hot;
       }
   }
   
 
}
