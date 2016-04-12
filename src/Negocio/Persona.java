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
public class Persona {
    private int id_persona;
    private String nombre;
    private int tel;

    public Persona(){
    
    }

    public Persona(int id_persona, String nombre, int tel) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.tel = tel;
    }
    
    
    
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    
    
    
    
    
}
