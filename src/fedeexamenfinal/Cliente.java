/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedeexamenfinal;

/**
 *
 * @author federico
 */
public class Cliente{
    String nombre, apellido, numeroCliente;
    
    public Cliente (String nombre, String apellido, String numeroCliente){
    nombre=this.nombre;
    apellido=this.apellido;
    numeroCliente=this.numeroCliente;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
   
}
