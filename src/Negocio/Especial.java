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
public class Especial implements Servicio{
    
    private int bedidas;
    private double cargo;
    private int comidad;

    public Especial() {
    }

    public Especial(int bedidas, double cargo, int comidad) {
        this.bedidas = bedidas;
        this.cargo = cargo;
        this.comidad = comidad;
    }

    public int getBedidas() {
        return bedidas;
    }

    public void setBedidas(int bedidas) {
        this.bedidas = bedidas;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public int getComidad() {
        return comidad;
    }

    public void setComidad(int comidad) {
        this.comidad = comidad;
    }

    @Override
    public void calcularCargo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
