/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import Monedas.Dolar;
import Monedas.Moneda;
import Temperatura.Temperatura;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Menu {
    private String menu[]={"Seleccione una opcion","Conversor de monedas","Conversor de temperatura"};
    private String arreglo[] = {"Seleccione una opcion", "Conversion de pesos colombianos a monedas extranjeras", "Conversion de monedas extranjeras a pesos colombianos"};
    private String arregloP[]={"Conversion de temperatura: Grados Celcius", "Conversion de temperatura: Grados Fahrenheit", "Conversion de temperatura: Grados Kelvin"};
    public void menuPrincipal(){
        try {
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0])).toString();
            switch (opcion) {
                case "Conversor de monedas":
                    menuM();
                    break;
                case "Conversor de temperatura":
                    menuT();
                    break;
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }
    }
    
    public void menuM() {
        Moneda monedas = new Moneda();

        try {
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arreglo, arreglo[0])).toString();
            switch (opcion) {
                case "Conversion de pesos colombianos a monedas extranjeras":
                    monedas.peso_extranjera();
                    break;
                case "Conversion de monedas extranjeras a pesos colombianos":
                    monedas.extranjera_peso();
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }

    }
    public void menuT(){
        Temperatura temperatura = new Temperatura();
         try {
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arregloP, arregloP[0])).toString();
            switch (opcion) {
                case "Conversion de temperatura: Grados Celcius":
                    temperatura.celcius();
                    break;
                case "Conversion de temperatura: Grados Fahrenheit":
                    temperatura.fahrenheit();
                    break;
                case "Conversion de temperatura: Grados Kelvin":
                    temperatura.kelvin();
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }

    }
}
