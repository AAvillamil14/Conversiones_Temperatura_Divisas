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
public class Moneda {

    private final String arregloM[] = {"Seleccione una opcion", "Convertir de peso colombiano a Dólar", "Convertir de peso colombiano  a Euros", "Convertir de peso colombiano a Libras Esterlinas", "Convertir peso colombiano a Yen Japonés", "Convertir peso colombiano a Won sur-coreano"};
    private final String arregloM2[] = {"Seleccione una opcion", "Convertir de dolar a peso colombiano", "Convertir de Euros a peso colombiano", "Convertir de Libras Esterlinas a peso colombiano", "Convertir de Yen Japonés a peso colombiano", "Convertir de Won sur-coreano a peso colombiano"};
    private double valor;
    private double divisa;
    private String nombre;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public String peso_extranjera() {

        try {
            Dolar dolar = new Dolar();
            Euro euro = new Euro();
            Libra libra = new Libra();
            Yen yen = new Yen();
            Won won = new Won();
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arregloM, arregloM[0])).toString();
            switch (opcion) {
                case "Convertir de peso colombiano a Dólar":
                    dolar.dolares();
                    break;
                case "Convertir de peso colombiano  a Euros":
                    euro.euros();
                    break;
                case "Convertir de peso colombiano a Libras Esterlinas":
                    libra.libras();
                    break;
                case "Convertir de peso colombiano a Yen Japonés":
                    yen.yenes();
                    break;
                case "Convertir de peso colombiano a Won sur-coreano":
                    won.wons();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "debe ingresar  una opcion");
                    peso_extranjera();
                    break;
            }

            return opcion;
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
            return null;
        }
    }

    public String extranjera_peso() {
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libra libra = new Libra();
        Yen yen = new Yen();
        Won won = new Won();
        try {
            String opcion = (JOptionPane.showInputDialog(null, "ingrese una opcion", "Menú", JOptionPane.INFORMATION_MESSAGE, null, arregloM2, arregloM2[0])).toString();
            switch (opcion) {
                case "Convertir de dolar a peso colombiano":
                    dolar.p_dolares();
                    break;
                case "Convertir de Euros a peso colombiano":
                    euro.p_euros();
                    break;
                case "Convertir de Libras Esterlinas a peso colombiano":
                    libra.p_libras();
                    break;
                case "Convertir de Yen Japonés a peso colombiano":
                    yen.p_yenes();
                    break;
                case "Convertir de Won sur-coreano a peso colombiano":
                    won.p_wons();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "debe ingresar  una opcion");
                    extranjera_peso();
                    break;
            }
            return opcion;

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Gracias por su atención");
            return null;
        }

    }

    public void divisas() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        double num = getValor() / getDivisa();
        Menu menu = new Menu();
        if (getValor() != 0) {
            JOptionPane.showMessageDialog(null, "El valor en " + getNombre() + " es: " + limitando.format(num));
            int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
            switch (decision) {
                case 0:
                    peso_extranjera();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por su atención");
                    break;
            }

        } else if (getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor valido");
            menu.menufuncion();

        }
    }
    
        public void p_divisas() {
        DecimalFormat limitando = new DecimalFormat("#.00");
        double num = getValor()*getDivisa();
        Menu menu = new Menu();
        if (getValor() != 0) {
            JOptionPane.showMessageDialog(null, "El valor en " + getNombre() + " es: " + limitando.format(num));
            int decision = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
            switch (decision) {
                case 0:
                    extranjera_peso();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por su atención");
                    break;
            }

        } else if (getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor valido");
            menu.menufuncion();
        }
    }
}
