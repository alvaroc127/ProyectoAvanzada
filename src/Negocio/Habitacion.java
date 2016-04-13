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
    
    
}
