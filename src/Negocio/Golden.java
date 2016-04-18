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
public class Golden implements Categoria{

    private Date antiguedad;
    private Descuento des;

    
        public Golden() {
    }
        
     public Golden(Date fechaAn){
     this.antiguedad=fechaAn;
     }
    
    public Descuento getDes() {
        return des;
    }

    public void setDes(Descuento des) {
        this.des = des;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Golden(Date antiguedad, Descuento des) {
        this.antiguedad = antiguedad;
        this.des = des;
    }

    @Override
    public String nomCategoria() {
        return getClass().getSuperclass().getName();
    }

    @Override
    public int descuen() {
        return des.returnaDesc();
    }
    
}
