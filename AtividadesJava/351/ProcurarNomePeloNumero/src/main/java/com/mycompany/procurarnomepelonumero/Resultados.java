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

    // Vetor para armazenar os nomes
    private String[] nomes = new String[5];

    // Método para adicionar um nome ao vetor
    public void adicionarNome(int indice, String nome) {
        nomes[indice] = nome;
    }

    // Método para obter o nome correspondente ao índice
    public String obterNome(int indice) {
        return nomes[indice];
    }
}
