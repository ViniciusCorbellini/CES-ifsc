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
public class EX7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de hóspedes!>>>>>");

        char continuar;
        char tipo;
        int dias, valorTotal = 0;
        String nome;
        do {
            System.out.print("\nInsira o nome do hospede: ");
            nome = input.nextLine();

            informacoes();

            boolean opcaoValida = false;
            while (!opcaoValida) {
                System.out.print("Escolha uma opção: ");
                tipo = input.next().charAt(0);
                tipo = Character.toUpperCase(tipo);

                input.nextLine();
                System.out.print("Insira o numero de dias de hospedagem: ");
                dias = Integer.parseInt(input.nextLine());

                switch (tipo) {
                    case 'A':
                        valorTotal = dias * 150;
                        opcaoValida = true;
                        break;
                    case 'B':
                        valorTotal = dias * 100;
                        opcaoValida = true;
                        break;
                    case 'C':
                        valorTotal = dias * 75;
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("\nEscolha uma opção válida -->");

                }
            }
            System.out.println("\nConta Final>>>>>");
            System.out.println("Nome: " + nome);
            System.out.println("Valor total: R$" + valorTotal);
            System.out.println("________________________________________");
            System.out.print("Deseja continuar (S or N)? ");
            continuar = input.next().charAt(0);
            continuar = Character.toUpperCase(continuar);
            input.nextLine();

        } while (continuar == 'S' || continuar == 's');

        System.out.println("________________________________________");
        System.out.println("Programa encerrado.");

    }

    public static void informacoes() {
        System.out.println("\nTipos de quarto: ");
        System.out.println("Tipo A /Diaria = R$150,00");
        System.out.println("Tipo B /Diaria = R$100,00");
        System.out.println("Tipo C /Diaria = R$75,00");
        System.out.println("________________________________________");
    }
}
