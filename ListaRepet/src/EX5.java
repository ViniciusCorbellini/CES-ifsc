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
public class EX5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alturaMax = 0;
        int codigoGenero;
        int contadorMulheres = 0;

        int[] altura = new int[10];
        int[] mediafem = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nFicha -->" + (i + 1));

            System.out.print("Insira sua altura (em metros): ");
            altura[i] = Integer.parseInt(input.nextLine());

            if (altura[i] > alturaMax) {
                alturaMax = altura[i];
            }

            System.out.print("Insira seu gênero (1 para masculino, 2 para feminino): ");
            codigoGenero = Integer.parseInt(input.nextLine());

            if (codigoGenero == 2) {
                mediafem[contadorMulheres] = altura[i];
                contadorMulheres++;
            }
        }

        int soma = 0;
        for (int j = 0; j < contadorMulheres; j++) {
            soma += mediafem[j];
        }
        double mediaMulheres = (double) soma / contadorMulheres;

        int somaGeral = 0;
        for (int num : altura) {
            somaGeral += num;
        }
        double mediaGeral = (double) somaGeral / 10;

        System.out.println("\nMaior altura: " + alturaMax);
        System.out.println("Media das alturas das mulheres: " + mediaMulheres);
        System.out.println("Media da altura da turma: " + mediaGeral);
    }
}
