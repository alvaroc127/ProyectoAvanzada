/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.ClienteDB;
import Negocio.Cliente;
import Negocio.Habitacion;
import Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ControladorCliente {
    
    private Persona cliente;
    private ArrayList<Cliente> clientes;
    private ClienteDB cldb=new ClienteDB();

    public ControladorCliente() {
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ClienteDB getCldb() {
        return cldb;
    }

    public void setCldb(ClienteDB cldb) {
        this.cldb = cldb;
    }
    public void grabarCliente(String nombre,String dirHuespe,int tel){
        cldb.insertar(nombre,dirHuespe, tel);
    }
    
    public ArrayList<Cliente> validarCat(int codCli){
        if(cldb.obtenerCat(codCli)!=null){
        return cldb.obtenerCat(codCli);
        }else{
        return null;
        }
    }
    
    
    
    
    
    
    
    
}
