/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imprimirmenu;

/**
 *
 * @author Estudos
 */
public class Resultados {

    public static int calcularComprimento(String frase) {
        return frase.length();
    }

    public static String obterPrimeiros(String frase) {
        return frase.substring(0, 2);
    }

    public static String obterUltimos(String frase) {
        return frase.substring(frase.length() - 2);
    }

    public static String espelharFrase(String frase) {
        StringBuilder espelhada = new StringBuilder(frase);
        return espelhada.reverse().toString();
    }
}