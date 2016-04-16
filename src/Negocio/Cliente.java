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
public class Cliente extends Persona{
    Categoria cat;

      public Cliente(){
    
    }
    
    public Cliente(Categoria cat) {
        this.cat = cat;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Cliente(int id_persona, String nombre, int tel) {
        super(id_persona, nombre, tel);
    }
    
        
}
