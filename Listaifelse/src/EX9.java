/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        double saldo, valor;
        int numeroConta;

        System.out.print("Insira o numero da conta: ");
        numeroConta = Integer.parseInt(input.nextLine());

        System.out.print("Insira o saldo atual: ");
        saldo = Double.parseDouble(input.nextLine());

        System.out.print("Insira o tipo de operacao (1 - depósito ou 2 - saque): ");
        op = Integer.parseInt(input.nextLine());

        System.out.print("Insira o valor da operação: ");
        valor = Double.parseDouble(input.nextLine());

        System.out.printf("\nConta : %d", numeroConta);

        if (op == 1) {
            saldo += valor;
            System.out.println("\nNovo saldo: " + saldo);

        } else if (op == 2) {
            saldo -= valor;
            System.out.println("\nNovo saldo: " + saldo);

        } else {
            System.out.println("Operador invalido");

        }

        if (saldo < 0) {
            System.out.println("Conta estourada");

        }
    }
}
