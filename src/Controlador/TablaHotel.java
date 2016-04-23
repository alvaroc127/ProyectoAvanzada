/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Hotel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felipe
 */
public class TablaHotel extends AbstractTableModel{

    private Hotel hoteles=new Hotel();
    private ArrayList<String> columnas=new ArrayList();

    public TablaHotel(Hotel hoteles){
        this.hoteles=hoteles;
        columnas.add("idhotel");
        columnas.add("nombre hotel");
        columnas.add("direccions");
        columnas.add("estrellas");
        columnas.add("ciudad");
        columnas.add("telefono");
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return columnas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: return hoteles.getId_hotel();
            case 1: return hoteles.getNombre();
            case 2: return hoteles.getDireccion();
            case 3: return hoteles.getNumeroEstrellas();
            case 4: return hoteles.getId_ciudad();
            case 5: return hoteles.getTelHot();
            default : return null;
        }
        
    }
    
    @Override
    public String getColumnName(int column){
    return columnas.get(column);
    }

    
    
}
