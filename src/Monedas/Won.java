/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import Conversiones.Menu;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Won extends Moneda {

    public void wons() {
        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double won = 3.76d;
                String nombre = "woms";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(won);
                super.divisas();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menufuncion();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }

    }
    public void p_wons(){
        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double peso_co = 3.76d;
                String nombre = "euros";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(peso_co);
                super.p_divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menufuncion();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
    }
}
