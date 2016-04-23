/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Hotel {
    
    private String direccion;
    private int id_ciudad;
    private int id_hotel;
    private String nombre;
    private String nombreCiudad;
    private  ArrayList<Habitacion> Habitaciones; 
    private int numeroEstrellas;
    private int telHot;

    public Hotel() {
    }

    public Hotel(int idhotel,String nomHotel,String dirHotel,int numE,int idCiud,int Telf){
    this.id_hotel=idhotel;
    nombre=nomHotel;
    direccion=dirHotel;
    numeroEstrellas=numE;
    id_ciudad=idCiud;
    telHot=Telf;
    }
    
    public Hotel(String direccion, int id_ciudad, int id_hotel, String nombre, String nombreCiudad, ArrayList<Habitacion> Habitaciones, int numeroEstrellas) {
        this.direccion = direccion;
        this.id_ciudad = id_ciudad;
        this.id_hotel = id_hotel;
        this.nombre = nombre;
        this.nombreCiudad = nombreCiudad;
        this.Habitaciones = Habitaciones;
        this.numeroEstrellas = numeroEstrellas;
    }
    

    public Hotel(String nombre,String nombreCiudad,int id_ciudad,int id_hotel,int numeroEstrellas,int telHot){
        this.nombre=nombre;
        this.nombreCiudad=nombreCiudad;
        this.id_ciudad=id_ciudad;
        this.id_hotel=id_hotel;
        this.numeroEstrellas=numeroEstrellas;
        this.telHot=telHot;
    }

    public Hotel(String nombre,String nombreCiudad,int id_ciudad){
    this.nombre=nombre;
    this.nombreCiudad=nombreCiudad;
    this.id_ciudad=id_ciudad;
    }
    
    
    public int getTelHot() {
        return telHot;
    }

    public void setTelHot(int telHot) {
        this.telHot = telHot;
    }
    
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> Habitaciones) {
        this.Habitaciones = Habitaciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
