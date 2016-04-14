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
import Controlador.*;
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
         
      //new VistaPrincipal().setVisible(true);
        //JOptionPane.showMessageDialog(null,"Hola MUNDO");//adicionado hola muynod
        ControladorHabitacion coH=new ControladorHabitacion();
        ControladorHotel conHo=new ControladorHotel();
        //conHo.grabarHotel("Hotel 7","CR 51", 3, 5,345334);
        for(int i=0;i<conHo.listaHoteles().size();i++){
        System.out.println(conHo.listaHoteles().get(i).getNombre());
        }
        //System.out.println(coH.listaHabitaciones().toString());
    }
    
}
