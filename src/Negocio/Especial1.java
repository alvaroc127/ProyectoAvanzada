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
public class Especial1 implements Descuento{
    private int porcentaje;

    public Especial1() {
    }

    public Especial1(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

   
   
    @Override
    public int returnaDesc() {
       return porcentaje;
    }
    
    
}
