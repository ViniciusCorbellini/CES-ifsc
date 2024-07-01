/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listarepeticao;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, contadorOtimo = 0, contadorRuim = 0, numFichas = 20;
        int maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;
        char nota;
        int arrayRuim[] = new int[numFichas];

        for (int i = 0; i < 20; i++) {

            System.out.println("\nFicha -->" + (i + 1));

            System.out.print("Insira sua idade: ");
            idade = Integer.parseInt(input.nextLine());

            if (idade > maiorIdade) {
                maiorIdade = idade;

            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            mostrarOpiniao();
            boolean opcaoValida = false;

            while (!opcaoValida) {
                System.out.print("opiniao: ");
                nota = input.next().charAt(0);
                nota = Character.toUpperCase(nota);

                switch (nota) {
                    case 'A':
                        contadorOtimo++;
                        opcaoValida = true;
                        break;
                    case 'B':
                        opcaoValida = true;
                        break;
                    case 'C':
                        opcaoValida = true;
                        break;
                    case 'D':
                        arrayRuim[contadorRuim] = idade;
                        contadorRuim++;
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("Insira uma avaliacao valida! ");

                }
            }
            input.nextLine();
        }

        double media = 0.0;
        if (contadorRuim != 0) {
            int soma = 0;
            for (int j = 0; j < contadorRuim; j++) {
                soma += arrayRuim[j];
            }
            media = (double) soma / contadorRuim;
        }

        int diferenca = maiorIdade - menorIdade;

        System.out.println("\nQuantidade de respostas otimo(A): " + contadorOtimo);
        System.out.println("Media da idade das pessoas que responderam ruim: " + media);

        System.out.println("Diferenca entre a maior e menor idade: " + diferenca);

    }

    public static void mostrarOpiniao() {
        System.out.println("Insira a sua opiniao em relacao ao filme: ");
        System.out.println("A: Otimo");
        System.out.println("B: Bom");
        System.out.println("C: Regular");
        System.out.println("D: Ruim");

    }
}
