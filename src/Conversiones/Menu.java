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

    private String arreglo[] = {"Seleccione una opcion", "Conversion de pesos colombianos a monedas extranjeras", "Conversion de monedas extranjeras a pesos colombianos", "Conversion de temperatura: Grados Celcius", "Conversion de temperatura: Grados Fahrenheit", "Conversion de temperatura: Grados Kelvin", "Conversion de peso"};

    public void menufuncion() {
        Moneda monedas = new Moneda();
        Temperatura temperatura = new Temperatura();

        try {
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arreglo, arreglo[0])).toString();
            switch (opcion) {
                case "Conversion de pesos colombianos a monedas extranjeras":
                    monedas.peso_extranjera();
                    break;
                case "Conversion de monedas extranjeras a pesos colombianos":
                    monedas.peso_extranjera();
                    break;
                case "Conversion de temperatura: Grados Celcius":
                    temperatura.celcius();
                    break;
                case "Conversion de temperatura: Grados Fahrenheit":
                    temperatura.fahrenheit();
                    break;
                case "Conversion de temperatura: Grados Kelvin":
                    temperatura.kelvin();
                    break;
                case "Conversion de peso":
                    int valor = JOptionPane.showConfirmDialog(null, "¿Quieres continuar convirtiendo?");
                    if (valor == 0) {
                        menufuncion();
                    } else {
                        JOptionPane.showMessageDialog(null, "Gracias por su atención");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "debe ingresar  una opcion");
                    menufuncion();
                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
        }

    }
}
