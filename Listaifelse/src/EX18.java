/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX18 {

    public static void main(String[] args) {
        double credito=0, salarioMedio;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o saldo medio do ultimo ano: ");
        salarioMedio = Double.parseDouble(input.nextLine());

        if (500 >= salarioMedio && salarioMedio >= 0) {
            System.out.println("O banco nao concedera nenhum credito de acordo com o valor de seu saldo medio");
            System.exit(0);

        } else if (salarioMedio > 500 && 1000 >= salarioMedio) {
            credito = salarioMedio * 0.30;

        } else if (salarioMedio > 1000 && 3000 >= salarioMedio) {
            credito = salarioMedio * 0.40;

        } else if (salarioMedio > 3000) {
            credito = salarioMedio * 0.50;

        } else {
            System.out.println("Valor invalido");
        }
        System.out.println("O banco concedera R$" + credito + " de credito");
    }

}
