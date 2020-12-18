/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedeExamenVisual;

import javax.swing.JOptionPane;

/**
 *
 * @author federico
 */
public class Validador {
    public boolean Vacio(String E){
    if (E.isEmpty()){
    return false;
    }else {
    return true;
    }
    }
public boolean MayoMenor(Double w){ 
if(w<11){
    if (w>0){
    return true;
    }
JOptionPane.showMessageDialog(null, "El valor es incorrecto deben ser mínimo 1");
//    JOptionPane.showConfirmDialog(null,"El valor es incorrecto");
return false;  
}   
JOptionPane.showMessageDialog(null, "El valor es incorrecto debe ser maximo 10");
//JOptionPane.showConfirmDialog(null,"El valor es incorrecto");
return false;
}
}
