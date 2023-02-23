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
public class Dolar extends Moneda {

    public void dolares() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
        double moneda = Double.valueOf(valor);
        double dolar = 4928.8;
        String nombre = "dolares estadounidenses";
        super.setNombre(nombre);
        super.setValor(moneda);
        super.setDivisa(dolar);
        super.divisas();
//        if (valor == null) {
//            JOptionPane.showMessageDialog(null, "Debes ingresar un valor");
//        } else if (moneda == 0) {
//            JOptionPane.showMessageDialog(null, "Si quieres puedes volverlo a intentar, ya que no se admiten valores iguales a 0");
//            super.divisas();
//        } else {
//            super.divisas();
//        }

    }

}
