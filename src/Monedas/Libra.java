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
public class Libra extends Moneda {

    public void libras() {

        try {
            Menu menu = new Menu();
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            String nombre = "libras esterlinas";
            try {
                double moneda = Double.valueOf(valor);
                double libra = 5875.74d;
                super.setValor(moneda);
                super.setDivisa(libra);
                super.setNombre(nombre);
                super.divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menuM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }

    }
    
     public void p_libras() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        try {
            Menu menu = new Menu();
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            String nombre = "libras esterlinas";
            try {
                double moneda = Double.valueOf(valor);
                double peso_col = 5875.74d;
                super.setValor(moneda);
                super.setDivisa(peso_col);
                super.setNombre(nombre);
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
