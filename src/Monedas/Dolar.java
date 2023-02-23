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
public class Dolar extends Moneda {

    public void dolares() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double dolar = 4928.8;
                String nombre = "dolares estadounidenses";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(dolar);
                super.divisas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                menu.menufuncion();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
    }
    public void p_dolares(){

        try {
            String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
            Menu menu = new Menu();
            try {
                double moneda = Double.valueOf(valor);
                double peso = 4885.67;
                String nombre = "dolares estadounidenses";
                super.setNombre(nombre);
                super.setValor(moneda);
                super.setDivisa(peso);
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
