/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.HabitacionJDBC;
import Negocio.Habitacion;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ControladorHabitacion {
    private Habitacion habit=new Habitacion();
    private HabitacionJDBC habJDBC=new HabitacionJDBC();
    private TablaHabitacion tabH;
    
    public ControladorHabitacion(){
            
    }

    public HabitacionJDBC getHabJDBC() {
        return habJDBC;
    }

    public Habitacion getHabit() {
        return habit;
    }

    public void setHabJDBC(HabitacionJDBC habJDBC) {
        this.habJDBC = habJDBC;
    }

    public void setHabit(Habitacion habit) {
        this.habit = habit;
    }
    
   public void guardarHabita(double precio,String tipo,int idHotel){
       habJDBC.insertarHabit(precio, tipo, idHotel);
   }

    public TablaHabitacion getTabH() {
        return tabH;
    }

    public void setTabH(TablaHabitacion tabH) {
        this.tabH = tabH;
    }
   
   
  public ArrayList<Habitacion> listaHabitaciones(int idhotel){
     return habJDBC.listarHaibtacion(idhotel);
    }
  
  public void iniciarTabla(ArrayList<Habitacion> habs){
  tabH=new TablaHabitacion(habs);
  }
  
  
  
}
