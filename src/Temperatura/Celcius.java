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
public class Celcius extends Temperatura{
    
    public void celcius_f(){
        Temperatura temperatura = new Temperatura();
        String valoringresado=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados =Double.valueOf(valoringresado);
            super.setGrados(grados);
            super.celcius_fahrenheit();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.celcius();
        }
    }
    public void celius_k(){
        Temperatura temperatura = new Temperatura();
        String valoringresado=JOptionPane.showInputDialog(null, "Ingrese los grados que quiere convertir");
        try {
            double grados2 =Double.valueOf(valoringresado);
            super.setGrados(grados2);
            super.celcius_kelvin();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            temperatura.celcius();
        }
    }
}
