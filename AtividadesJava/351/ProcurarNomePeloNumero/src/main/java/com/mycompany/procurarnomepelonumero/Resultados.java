/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.procurarnomepelonumero;

/**
 *
 * @author Estudos
 */
public class Resultados {

    private String[] nomes = new String[5];

    public void adicionarNome(int indice, String nome) {
        nomes[indice] = nome;
    }

    public String obterNome(int indice) {
        return nomes[indice];
    }
}
