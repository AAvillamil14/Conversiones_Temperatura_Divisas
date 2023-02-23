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
public class Yen extends Moneda{


    public void yenes() {
        
        String valor = (JOptionPane.showInputDialog(null, "Ingrese el valor que quiere convertir")).toString();
        String nombre ="Yen japones";
        double moneda = Double.valueOf(valor);
        double yen = 36.54d;
        setNombre(nombre);
        setValor(moneda);
        setDivisa(yen);
        super.divisas();
        
        }
    }
    
    

