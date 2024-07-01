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
public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorProduto;
        double valorTotal = 0;
        int quantidade;
        int contador = 1;

        String[] itens = { "Hot dog", "X Salada", "Bauru com Ovo", "Refrigerante" };
        int[] codigos = { 100, 101, 102, 103 };
        double[] precos = { 4.00, 6.00, 6.50, 2.00 };
        mostrarCardapio(itens, codigos, precos);

        while (contador == 1) {
            System.out.print("Insira um código: ");
            int cod = input.nextInt();
            switch (cod) {
                case 100:
                    System.out.print("R$4,00 a unidade, qual é a quantidade desejada? ");
                    quantidade = input.nextInt();
                    valorProduto = 4.0 * quantidade;
                    break;

                case 101:
                    System.out.print("R$6,00, qual é a quantidade desejada? ");
                    quantidade = input.nextInt();
                    valorProduto = 6.0 * quantidade;
                    break;

                case 102:
                    System.out.print("R$6,50, qual é a quantidade desejada? ");
                    quantidade = input.nextInt();
                    valorProduto = 6.5 * quantidade;
                    break;

                case 103:
                    System.out.print("R$2,00, qual é a quantidade desejada? ");
                    quantidade = input.nextInt();
                    valorProduto = 2.0 * quantidade;
                    break;

                case 0:
                    valorProduto = 0;
                    break;

                default:
                    System.out.println(">>>>>");
                    System.out.println("Insira um código válido: 100, 101, 102, 103 ou 0 para encerarar o programa");
                    System.out.println(">>>>>");
                    continue;
            }
            valorTotal += valorProduto;
            System.out.println("Valor total: " + valorTotal);

            System.out.print("Desejas comprar mais algum item (s ou n): ");
            char pergunta = input.next().charAt(0);
            pergunta = Character.toUpperCase(pergunta);

            switch (pergunta) {
                case 'Y':
                    continue;
                case 'N':
                    contador++;
            }

        }
        System.out.println("Encerrando>>>");

    }

    public static void mostrarCardapio(String[] arrayFood, int[] arrayCodigos, double[] arrayPreco) {
        System.out.println("Bem vindo a lanchonete!");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Item: %s //Codigo: %d //Preço: %.2f%n", arrayFood[i], arrayCodigos[i], arrayPreco[i]);
        }
        System.out.println("______________________________________");
    }
}
