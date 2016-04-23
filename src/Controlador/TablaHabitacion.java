/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Habitacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felipe
 */
public class TablaHabitacion extends AbstractTableModel {

    private ArrayList<Habitacion> habitaciones=new ArrayList();
    private ArrayList<String> columnas=new ArrayList();

    public TablaHabitacion(ArrayList<Habitacion> habitaciones) {
        this.habitaciones=habitaciones;
        columnas.add("numero_hab");
        columnas.add("precio");
        columnas.add("tipo");
        columnas.add("el que falta =(");
    }

    TablaHabitacion() {
        
    }
    
    @Override
    public int getRowCount() {
       return habitaciones.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habitacion hab;
        hab=habitaciones.get(rowIndex);
      switch(columnIndex){
          case 0: return hab.getNumero_hab();
          case 1: return hab.getPrecio();
          case 2: return hab.getTipo().getTipo();
          case 4: return "hola";
          default: return null;
      }  
      
    
        
    }
    
    @Override
    public String getColumnName(int column){
    return columnas.get(column);
    }
    
    
    
}
