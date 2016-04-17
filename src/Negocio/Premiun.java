/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;

/**
 *
 * @author felipe
 */
public class Premiun implements Categoria {
    private Date antiguedad;
    private Descuento desc;

    public Premiun(Date antiguedad, Descuento desc) {
        this.antiguedad = antiguedad;
        this.desc = desc;
    }

    
    
    public Descuento getDesc() {
        return desc;
    }

    public void setDesc(Descuento desc) {
        this.desc = desc;
    }
    
    
    public Premiun() {
    }

    public Premiun(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String nomCategoria() {
       return getClass().getName();
    }

    @Override
    public int descuen() {
        return desc.returnaDesc();
    }

   
    
    
    
}
