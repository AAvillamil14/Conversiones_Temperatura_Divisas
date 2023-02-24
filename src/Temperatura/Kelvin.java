/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Kelvin extends Temperatura{
    
     public void kelvin_c(){
        Temperatura temperatura = new Temperatura();
        String valoringresado=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados =Double.valueOf(valoringresado);
            super.setGrados(grados);
            super.kelvin_celcius();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.kelvin();
        }
        }
     public void kelvin_f(){
        Temperatura temperatura = new Temperatura();
        String valoringresado=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados =Double.valueOf(valoringresado);
            super.setGrados(grados);
            super.kelvin_fahrenheit();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.kelvin();
        }
        }
}
