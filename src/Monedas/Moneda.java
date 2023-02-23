/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Moneda {

    private String arregloM[] = {"Seleccione una opcion", "Convertir de la moneda de tu país a Dólar", "Convertir de la moneda de tu país  a Euros", "Convertir de la moneda de tu país  a Libras Esterlinas", "Convertir de la moneda de tu país  a Yen Japonés", "Convertir de la moneda de tu país  a Won sul-coreano"};
    private double valor;
    private double divisa;
    private String nombre;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String[] getArregloM() {
        return arregloM;
    }

    public void setArregloM(String[] arregloM) {
        this.arregloM = arregloM;
    }

    public double getDivisa() {
        return divisa;
    }

    public void setDivisa(double divisa) {
        this.divisa = divisa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String logicaMonedas() {
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libra libra=new Libra();
        Yen yen = new Yen();
        Won won=new Won();
        String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arregloM, arregloM[0])).toString();
        switch (opcion) {
            case "Convertir de la moneda de tu país a Dólar":

                dolar.dolares();
                break;
            case "Convertir de la moneda de tu país  a Euros":

                euro.euros();
                break;
            case "Convertir de la moneda de tu país  a Libras Esterlinas":
                libra.libras();
                break;
            case "Convertir de la moneda de tu país  a Yen Japonés":
                yen.yenes();
                break;
            case "Convertir de la moneda de tu país  a Won sul-coreano":
                won.wons();
                break;

        }

        return opcion;

    }

    public void divisas() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        double num = getValor() / getDivisa();
        if (getValor() != 0) {
            JOptionPane.showMessageDialog(null, "El valor en "+ getNombre() +" es: " + limitando.format(num));
            int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        switch (decision) {
            case 0:
                logicaMonedas();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias por su atención");
                break;}
        
        }else if (getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Hasta pronto");
        } 
    }
}
