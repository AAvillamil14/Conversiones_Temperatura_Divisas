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
public class Libra extends Moneda {

    public void libras() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
        String nombre= "libras esterlinas";
        double moneda = Double.valueOf(valor);
        double libra =5934.14d;
        super.setValor(moneda);
        super.setDivisa(libra);
        super.setNombre(nombre);
        super.divisas();
        
    }

}
