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
public class Euro extends Moneda {

    public void euros() {
        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double euro = 5226.30d;
                String nombre = "euros";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(euro);
                super.divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menuM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
        
    }
    public void p_euros(){
        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double peso_c = 5161.18d;
                String nombre = "euros";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(peso_c);
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
