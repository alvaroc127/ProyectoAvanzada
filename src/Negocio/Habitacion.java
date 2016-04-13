/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author felipe
 */
public class Habitacion {
    private int numero_hab;
    private double precio;
    private  Tipo tipo;

    public Habitacion(int numero_hab, double precio, String tipo) {
        FctoryHabitacion fa=new FctoryHabitacion();
        this.numero_hab = numero_hab;
        this.precio = precio;
        this.tipo=fa.getHabitacion(tipo);
    }

    
    
    public int getNumero_hab() {
        return numero_hab;
    }

    public void setNumero_hab(int numero_hab) {
        this.numero_hab = numero_hab;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
