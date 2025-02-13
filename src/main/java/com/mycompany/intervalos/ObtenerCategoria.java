/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intervalos;

/**
 *
 * @author Seven
 */
public class ObtenerCategoria {
    public static String ObtenerCategoria(int a) {
        if (a < -4) {
            return "Intervalo A";
        } else if (a < 6) { //Ya se sabe que a >= -4 por el primer if
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
}