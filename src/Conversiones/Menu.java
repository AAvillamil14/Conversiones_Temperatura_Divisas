/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import Monedas.Dolar;
import Monedas.Moneda;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Menu {

    private String arreglo[] = {"Seleccione una opcion", "Conversion de moneda", "Conversion de temperatura", "Conversion de peso"};

    public void menufuncion() {
        Moneda monedas = new Moneda();
        //return  JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE , null, arreglo, arreglo[0]).toString();
        String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arreglo, arreglo[0])).toString();
        switch (opcion) {
            case "Conversion de moneda":
                monedas.logicaMonedas();
                break;
            case "Conversion de temperatura":
                JOptionPane.showMessageDialog(null, "temperatura");
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

    }
}
