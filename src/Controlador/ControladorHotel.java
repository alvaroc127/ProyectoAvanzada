/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.HotelJDBC;
import Negocio.Hotel;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ControladorHotel {
    
    private Hotel hote=new Hotel();
    private HotelJDBC hotelJDBC=new HotelJDBC();

    public ControladorHotel() {
    }

    public Hotel getHote() {
        return hote;
    }

    public void setHote(Hotel hote) {
        this.hote = hote;
    }

    public HotelJDBC getHotelJDBC() {
        return hotelJDBC;
    }

    public void setHotelJDBC(HotelJDBC hotelJDBC) {
        this.hotelJDBC = hotelJDBC;
    }
    
    public void grabarHotel(String nombreCiudd,String dirhhotel,int estrellas, int idciudad,int telHotel){
    hotelJDBC.insert(nombreCiudd, dirhhotel,estrellas,idciudad,telHotel);
    }
    
    public ArrayList<Hotel> listaHoteles(){
    return hotelJDBC.listaHot();
    }
    
    
    
    
    
}
