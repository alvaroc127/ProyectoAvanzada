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
public class Suite implements Tipo{
    private int capacidad;
    
    public Suite() {
        
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    
    
    public Suite(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
