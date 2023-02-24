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
public class Fahrenheit extends Temperatura{
    
    public void fahrenheit_c(){
          Temperatura temperatura = new Temperatura();
        String valoringresado2=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados =Double.valueOf(valoringresado2);
            super.setGrados(grados);
            super.fahrenheit_celcius();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.fahrenheit();
        }
    }
    public void fahrenheit_k(){
         Temperatura temperatura = new Temperatura();
        String valoringresado=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados =Double.valueOf(valoringresado);
            super.setGrados(grados);
            super.fahrenheit_kelvin();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.fahrenheit();
        }
    }
}
