/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Temperatura {

    String celcius[] = {"Seleccione una opcion", "Convertir grados celcius a fahrenheit", "Convertir grados celcius a kelvin"};
    String fahrenheit[] = {"Seleccione una opcion", "Convertir grados fahrenheit a celcius", "Convertir grados fahrenheit a kelvin"};
    String kelvin[] = {"Seleccione una opcion", "Convertir grados kelvin a celcius", "Convertir grados kelvin a fahrenheit"};
    double grados;

 

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public void celcius() {
        Celcius c = new Celcius();
        String opcion = (JOptionPane.showInputDialog(null, "Conversiones de Temperatura", "Menu", JOptionPane.INFORMATION_MESSAGE, null, celcius, celcius[0])).toString();
        switch (opcion) {
            case "Convertir grados celcius a fahrenheit":
                c.celcius_f();
                break;
            case "Convertir grados celcius a kelvin":
                c.celius_k();
                break;
        }
    }

    public void fahrenheit() {
        Fahrenheit f = new Fahrenheit();
        String opcion2 = (JOptionPane.showInputDialog(null, "Conversiones de Temperatura", "Menu", JOptionPane.INFORMATION_MESSAGE, null, fahrenheit, fahrenheit[0])).toString();
        switch (opcion2) {
            case "Convertir grados fahrenheit a celcius":
                f.fahrenheit_c();
                break;
            case "Convertir grados fahrenheit a kelvin":
                f.fahrenheit_k();
                break;
        }
    }

    public void kelvin() {
        Kelvin k=new Kelvin();
        String opcion3 = (JOptionPane.showInputDialog(null, "Conversiones de Temperatura", "Menu", JOptionPane.INFORMATION_MESSAGE, null, kelvin, kelvin[0])).toString();
        switch (opcion3) {
            case "Convertir grados kelvin a celcius":
                k.kelvin_c();
                break;
            case "Convertir grados kelvin a fahrenheit":
                k.kelvin_f();
                break;
        }
    }

    public void celcius_fahrenheit() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = (getGrados() * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados fahrenheit son: " + format.format(conversion) + "°F");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                celcius();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }
    }

    public void celcius_kelvin() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = getGrados() + 273.15;
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados Kelvin son: " + format.format(conversion) + "°K");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                celcius();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }

    }

    public void fahrenheit_celcius() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = (getGrados()-32) / 1.8;
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados celcius son: " + format.format(conversion) + "°C");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                fahrenheit();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }
    }

    public void fahrenheit_kelvin() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = (getGrados() - 32) * 5/9 + 273.15;
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados kelvin son: " + format.format(conversion) + "°K");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                fahrenheit();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }
    }

    public void kelvin_celcius() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = (getGrados() - 273.1);
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados celcius son: " + format.format(conversion) + "°C");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                kelvin();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }
    }

    public void kelvin_fahrenheit() {
        DecimalFormat format = new DecimalFormat("#.000");
        double conversion = 1.8*(getGrados() - 273.15) + 32;
        JOptionPane.showMessageDialog(null, "Los grados que ingresaste convertidos a grados fahrenheit son: " + format.format(conversion) + "°F");
        int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                kelvin();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;
        }
    }

}
