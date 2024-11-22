/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimirmenu;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class ImprimirMenu {

    public static void main(String[] args) {
        int opcao;
        String frase;

        do {

            String menu = """
                          MENU
                          1 - Imprime o comprimento da frase
                          2 - Imprime os dois primeiros e os dois últimos caracteres da frase
                          3 - Imprime a frase espelhada
                          4 - Termina o algoritmo
                          Escolha uma opção:
                          """;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1 -> { //comprimento
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    int comprimento = Resultados.calcularComprimento(frase);
                    JOptionPane.showMessageDialog(null, "Número de caracteres da frase: " + comprimento);
                }
                case 2 -> { //2 primeiros e ultimos caracter
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    if (frase.length() <= 4) {
                        JOptionPane.showMessageDialog(null, "A frase precisa ter pelo menos 5 caracteres.");
                    } else {
                        String Primeiros = Resultados.obterPrimeiros(frase);
                        String Ultimos = Resultados.obterUltimos(frase);
                        JOptionPane.showMessageDialog(null, """
                                                            Dois primeiros caracteres: %s
                                                            Dois últimos caracteres: %s
                                                            """.formatted(Primeiros, Ultimos));
                    }
                }
                case 3 -> { //espelho
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    String espelhada = Resultados.espelharFrase(frase);
                    JOptionPane.showMessageDialog(null, "Frase espelhada: " + espelhada);
                }
                case 4 -> { //fim
                    JOptionPane.showMessageDialog(null, """
                                                        +----------------------------+
                                                        | FIM DO PROGRAMA |
                                                        +----------------------------+
                                                                  |
                                                                  |
                                                               \\ O /
                                                                 | |
                                                                /   \\
                                                        
                                                            Marcos Eduardo
                                                        """);
                }
                default -> {//erro
                    JOptionPane.showMessageDialog(null, "Digite um numero valido");
                }
            }
        } while (opcao != 4); // vai repetir se n for a ultima opção
    }
}