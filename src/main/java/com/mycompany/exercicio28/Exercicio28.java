package com.mycompany.exercicio28;

import javax.swing.JOptionPane;

public class Exercicio28 {

    public static void main(String[] args) {

        int A[][] = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da linha " + i + " e da coluna " + j + ":"));

            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, "O valor contido na linha " + i + " e coluna " + j + " é " + A[i][j]);

            }
        }

        //A) Calcule e mostre a soma dos elementos da primeira coluna;
        int somaA = 0;
        for (i = 0; i < 3; i++) {
            somaA = somaA + A[i][0];

        }

        JOptionPane.showMessageDialog(null, "A soma da primeira coluna é: " + somaA);

        //B) Calcule e mostre a soma dos elementos de cada coluna; 
        for (j = 0; j < 3; j++) {
            int somaB = 0;
            for (i = 0; i < 3; i++) {
                somaB = somaB + A[i][j];
            }

            JOptionPane.showMessageDialog(null, "A soma da coluna " + j + " é: " + somaB);
        }

        //C) Calcule e mostre o produto dos elementos da primeira linha;
        int produtoC = 1;
        for (j = 0; j < 3; j++) {
            produtoC = produtoC * A[0][j];

        }

        JOptionPane.showMessageDialog(null, "O produto dos elementos da primeira linha é: " + produtoC);

        //D) Calcule e mostre a soma de todos os elementos da matriz:
        int somaD = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                somaD = somaD + A[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "A soma de todos os elementos é: " + somaD);

        //E) Calcule e mostre a média dos elementos da matriz;
        double somaE = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                somaE = somaE + A[i][j];

            }

        }

        double media = somaE / 9;

        JOptionPane.showMessageDialog(null, "A média de todos os elementos é: " + media);

        //F) Calcule e mostre os elementos que são maiores que a média;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > media) {
                    JOptionPane.showMessageDialog(null, "O elemento: " + A[i][j] + " é maior que a média " + media);

                }

            }

        }

        //G) Calcule e mostre o maior elemento da matriz e sua posição; 
        int maiorVa = A[0][0];
        int linhaMa = 0;
        int colunaMa = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                if (A[i][j] > maiorVa) {
                    maiorVa = A[i][j];
                    linhaMa = i;
                    colunaMa = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "O maior elemento é: " + maiorVa + "\n" + "Na linha: " + linhaMa + "\n" + "Na coluna: " + colunaMa);

        //H) Calcule e mostre o menor elemento da matriz e sua posição;
        int menorVa = A[0][0];
        int linhaMe = 0;
        int colunaMe = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                if (A[i][j] < menorVa) {
                    menorVa = A[i][j];
                    linhaMe = i;
                    colunaMe = j;

                }
            }

        }

        JOptionPane.showMessageDialog(null, "O menor elemento é: " + menorVa + "\n" + "Na linha: " + linhaMe + "\n" + "Na coluna: " + colunaMe);

    }
}
