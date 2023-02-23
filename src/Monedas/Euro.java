/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Euro extends Moneda {

    
    public void euros() {
        
        String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
        double moneda = Double.valueOf(valor);
        double euro = 5226.30d;
        String nombre = "euros";
        super.setNombre(nombre);
        super.setValor(moneda);
        super.setDivisa(euro);
        super.divisas();
//        if (valor == null) {
//            JOptionPane.showMessageDialog(null, "Debes ingresar un valor");
//        } else if (moneda == 0) {
//            JOptionPane.showMessageDialog(null, "Si quieres puedes volverlo a intentar, ya que no se admiten valores iguales a 0");
//        } else {
//            super.divisas();
//        }
        
    }

}
