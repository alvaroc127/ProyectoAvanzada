/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;
import Servicio.Conexion;
import java.sql.SQLException;


/**
 *
 * @author felipe
 */
public class Reserva {
    private int cantidad_dia;
    private Cliente client;
    private Date fecha_inicio;
    private Date fecha_salid;
    private Habitacion habitacion;
    private double val_cancela;

    public Reserva(int cantidad_dia, Cliente client, Date fecha_inicio, Date fecha_salid, Habitacion habitacion, double val_cancela) {
        this.cantidad_dia = cantidad_dia;
        this.client = client;
        this.fecha_inicio = fecha_inicio;
        this.fecha_salid = fecha_salid;
        this.habitacion = habitacion;
        this.val_cancela = val_cancela;
    }

    public Reserva() throws SQLException {
        System.out.println(Conexion.getConecxion().getClass());
    }
    
    

    public int getCantidad_dia() {
        return cantidad_dia;
    }

    public void setCantidad_dia(int cantidad_dia) {
        this.cantidad_dia = cantidad_dia;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_salid() {
        return fecha_salid;
    }

    public void setFecha_salid(Date fecha_salid) {
        this.fecha_salid = fecha_salid;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double getVal_cancela() {
        return val_cancela;
    }

    public void setVal_cancela(double val_cancela) {
        this.val_cancela = val_cancela;
    }
    
    
    public void aplicarDescuento(){
    
    
    }
    
    
}
