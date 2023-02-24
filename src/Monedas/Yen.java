/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import Conversiones.Menu;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Yen extends Moneda {

    public void yenes() {
        try {
            Menu menu = new Menu();
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            String nombre = "Yen japones";
            try {
                double moneda = Double.valueOf(valor);
                double yen = 36.54d;
                setNombre(nombre);
                setValor(moneda);
                setDivisa(yen);
                super.divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menuM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
    }
    
     public void p_yenes() {
        try {
            Menu menu = new Menu();
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            String nombre = "Yen japones";
            try {
                double moneda = Double.valueOf(valor);
                double p_col = 36.09d;
                setNombre(nombre);
                setValor(moneda);
                setDivisa(p_col);
                super.p_divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menuM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
    }
}
