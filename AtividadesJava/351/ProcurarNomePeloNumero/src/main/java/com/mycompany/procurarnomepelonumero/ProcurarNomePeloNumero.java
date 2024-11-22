/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.procurarnomepelonumero;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class ProcurarNomePeloNumero {

    public static void main(String[] args) {
        // Instancia a classe Resultados
        Resultados resultados = new Resultados();

        // Preenche o vetor com os nomes por meio da interação do usuário
        for (int i = 0; i <= 4; i++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome " + (i + 1) + ": ");
            resultados.adicionarNome(i, nome); // Envia o nome para a classe Resultados
        }

        // Laço para obter e exibir o nome correspondente ao número fornecido
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Digite o número da pessoa (1 a 5) ou 0 para sair:");
            int num = Integer.parseInt(input); // Converte a entrada para inteiro
            
            if (num == 0) { // Condição de saída
                JOptionPane.showMessageDialog(null, "Programa encerrado!");
                break;
            }

            // Valida o número digitado
            if (num < 1 || num > 5) {
                JOptionPane.showMessageDialog(null, "Número fora do intervalo! Tente novamente.");
            } else {
                // Obtém o nome correspondente ao número fornecido
                String nome = resultados.obterNome(num - 1); // Ajusta para índice do vetor
                JOptionPane.showMessageDialog(null, "Nome da pessoa: " + nome);
            }
        }
    }
}
