/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Servicio.Conexion;
import Vista.VistaPrincipal;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Proyecto20162 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
      Conexion co= Conexion.getConexion();   
      new VistaPrincipal().setVisible(true);
        JOptionPane.showMessageDialog(null,"Hola MUNDO");//adicionado hola muynod
        
    }
    
}
