/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Negocio.Cliente;
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
public final class ClienteDB {
    private final String InsertarDB="INSERT INTO huesped (nomhuesp,dirhuesp,telhuesp) values(?,?,?)";
    private final String UpdateDB="UPDATE huesped SET nomhuesp=?, dirhuesp=?, telhuesp=? where idhuesp=?";
    private final String elimniDB="DELETE FROM huesped WHERE idhuespe=?";
    private final String SQL_lISTAR="select * FROM huesed ORDER BY idhuespe DESC";
    private final String ValidarCatGol= "select * from hospeda natural join huesped where extract(YEAR from current_date)-extract(YEAR from fechsal)>2 AND idhuesp= ?";
    private final String ValidarCatPrem= "select * from hospeda natural join huesped where extract(YEAR from current_date)-extract(YEAR from fechsal)>4 AND idhuesp= ?";
    
    public int insertar(String nombre,String dirhuespe,int telfono){
        Connection con=null;
        PreparedStatement stat=null;
        int rowns=0;
        try{
        Conexion.getConexion();
        con=(Connection) Conexion.getConecxion();
        stat=con.prepareStatement(InsertarDB);
        int index=1;
        stat.setString(index++, nombre);
        stat.setString(index++, dirhuespe);
        stat.setInt(index++,telfono);
        rowns=stat.executeUpdate();
        }catch(SQLException ex){
        ex.printStackTrace();
        }
        finally{
        Conexion.close(con);
        Conexion.close(stat);
        return rowns;
        }
    }
    
    
    
    public int update(String nomhuespe,String dirhuesp,int telhuespe){
    Connection co=null;
        PreparedStatement stat=null;
        int rowns=0;
        try{
        co=(Connection)Conexion.getConecxion();
        stat=co.prepareStatement(UpdateDB);
        int index=1;
        stat.setString(index++,nomhuespe);
        stat.setString(index++,dirhuesp);
        stat.setInt(index++,telhuespe);
        rowns=stat.executeUpdate();
        }catch(SQLException esx){
        esx.printStackTrace();
        }finally{
            Conexion.close(co);
            Conexion.close(stat);
        return rowns;
        }
    }
    
    
    public int eliminar(int id_persona){
    Connection co=null;
    PreparedStatement stat=null;
    int rowns=0;
    try{
    co=(Connection) Conexion.getConecxion();
    stat=co.prepareCall(elimniDB);
    int index=1;
    stat.setInt(index++, id_persona);
    rowns=stat.executeUpdate();
    }catch(SQLException ex){
    ex.printStackTrace();
    }finally{
        Conexion.close(co);
        Conexion.close(stat);
        return rowns;
        }
    }
    
    public ArrayList<Cliente> obtenerCatGolden(){
    Connection co=null;
    PreparedStatement stat=null;
    ResultSet rs=null;
    ArrayList<Cliente> cliet=new ArrayList();
    try{
        co=Conexion.getConecxion();
        stat=co.prepareStatement(ValidarCatGol);
        rs=stat.executeQuery();
        while(rs.next()){
            Cliente ca=new Cliente(Integer.parseInt(rs.getString("idhuesp")),rs.getString("nomheusp"),Integer.parseInt(rs.getString("telhuesp")));
            cliet.add(ca);
        }
    }catch(SQLException ex){
    ex.printStackTrace();
    }finally{
    Conexion.close(co);
    Conexion.close(stat);
    Conexion.close(rs);
    return cliet;
        }
    }
    
    public ArrayList<Cliente> obtenerCatPremi(){
    Connection co=null;
    PreparedStatement stat=null;
    ResultSet rs=null;
    ArrayList<Cliente> cliet=new ArrayList();
    try{
        co=Conexion.getConecxion();
        stat=co.prepareStatement(ValidarCatPrem);
        rs=stat.executeQuery();
        while(rs.next()){
            Cliente ca=new Cliente(Integer.parseInt(rs.getString("idhuesp")),rs.getString("nomheusp"),Integer.parseInt(rs.getString("telhuesp")));
            cliet.add(ca);
        }
    }catch(SQLException ex){
    ex.printStackTrace();
    }finally{
    Conexion.close(co);
    Conexion.close(stat);
    Conexion.close(rs);
    return cliet;
        }
    }
    
    
}
