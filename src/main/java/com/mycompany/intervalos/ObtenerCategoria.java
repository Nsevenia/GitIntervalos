/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intervalos;

/**
 *
 * @author Seven
 */
public class ObtenerIntervalo {
    public static double ObtenerIntervalo(double k) {
        if (k < -4) {
            return "Intervalo A";
        } else if (k < 6) {
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
}
