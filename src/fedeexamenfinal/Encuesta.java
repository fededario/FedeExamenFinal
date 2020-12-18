/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedeexamenfinal;

import fedeExamenVisual.formularioCliente;

/**
 *
 * @author federico
 */
public class Encuesta extends Cliente {
   Double NivelAtencion, NivelRecomendacion, NivelResolucion;
   
    public Encuesta(String nombre,String apellido,String numeroCliente, Double NivelAtencion, Double NivelRecomendacion, Double NivelResolucion){
     super(nombre, apellido, numeroCliente);
        NivelAtencion=this.NivelAtencion;
     NivelRecomendacion=this.NivelRecomendacion;
     NivelResolucion=this.NivelResolucion;
    }

    public Double getNivelAtencion() {
        return NivelAtencion;
    }

    public void setNivelAtencion(Double NivelAtencion) {
        this.NivelAtencion = NivelAtencion;
    }

    public Double getNivelRecomendacion() {
        return NivelRecomendacion;
    }

    public void setNivelRecomendacion(Double NivelRecomendacion) {
        this.NivelRecomendacion = NivelRecomendacion;
    }

    public Double getNivelResolucion() {
        return NivelResolucion;
    }

    public void setNivelResolucion(Double NivelResolucion) {
        this.NivelResolucion = NivelResolucion;
    }
  
    public double promedio(Double n1, double n2, double n3){
double promedio;

promedio= (n1 + n2 + n3)/3;
        //NivelAtencion + NivelRecomendacion + NivelResolucion;
return promedio;
    }
    //int Nivelatencion, int NivelRecomendacion, int NivelResolucion
}
