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
    private TablaHotel taho;

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
    
    public void grabarCiudad(String nombreCiudad){
    hotelJDBC.insertarCiudad(nombreCiudad);
    }
    
    public ArrayList<Hotel> listaHoteles(){
    return hotelJDBC.listaHot();
    }
    
    public ArrayList<Hotel> listaCiudades(String nomciudad){
    return hotelJDBC.listaCiudad(nomciudad);
    }
    
    public void iniciarTabla(Hotel htls){
        taho=new TablaHotel(htls);
    }

    
    
    public TablaHotel getTaho() {
        return taho;
    }

    public void setTaho(TablaHotel taho) {
        this.taho = taho;
    }
    
}
