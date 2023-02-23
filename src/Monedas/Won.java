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
public class Won extends Moneda{

   
    
    public void wons(){
        String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
        double moneda = Double.valueOf(valor);
        double won = 3.76d;
        String nombre = "woms";
        super.setNombre(nombre);
        super.setValor(moneda);
        super.setDivisa(won);
        super.divisas();
    }
    
}
