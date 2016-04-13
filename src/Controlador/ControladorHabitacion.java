/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.HabitacionJDBC;
import Negocio.Habitacion;

/**
 *
 * @author felipe
 */
public class ControladorHabitacion {
    private Habitacion habit;
    private HabitacionJDBC habJDBC=new HabitacionJDBC();
    
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
    
   public void guardarHabita(double precio,String tipo){
       habJDBC.insertarHabit(precio, tipo);
   }
    
   
   
    
    
    
}
