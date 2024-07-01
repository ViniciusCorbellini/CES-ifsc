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
public class EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, imposto = 0;
        char classeRenda;
        String cpf;

        do {
            System.out.println("______________________________");
            System.out.print("Insira o seu CPF (ou 00 para encerrar): ");
            cpf = input.nextLine();

            if (cpf.length() == 11 && !cpf.equals("00")) {
                System.out.print("Insira o seu salario: R$");
                salario = input.nextDouble();

                boolean opcaoValida = false;
                while (!opcaoValida) {
                    System.out.print("Insira a sua classe de renda (A,B,C,D ou E): ");
                    classeRenda = input.next().charAt(0);
                    classeRenda = Character.toUpperCase(classeRenda);

                    switch (classeRenda) {
                        case 'A':
                            imposto = 0;
                            System.out.println("Isento");
                            opcaoValida = true;
                            break;

                        case 'B':
                            imposto = salario * 0.05;
                            System.out.println("Aliquota: 5%");
                            opcaoValida = true;
                            break;

                        case 'C':
                            imposto = salario * 0.1;
                            System.out.println("Aliquota: 10%");
                            opcaoValida = true;
                            break;

                        case 'D':
                            imposto = salario * 0.15;
                            System.out.println("Aliquota: 15%");
                            opcaoValida = true;
                            break;

                        case 'E':
                            imposto = salario * 0.20;
                            System.out.println("Aliquota: 20%");
                            opcaoValida = true;
                            break;
                        default:
                            System.out.println("Insira uma classe valida! ");

                    }
                }

                System.out.println("Valor descontado: R$" + imposto);
                input.nextLine();

            } else if (cpf.equals("00")) {
                break;
            } else {
                System.out.println("O CPF deve possuir 11 caracteres!");
            }

        } while (!cpf.equals("00"));
        System.out.println("Encerrando");

    }

}
