/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotarefa;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Ex12 {

    public static void main(String[] args) {
        double pesoPrato, pesoPratoMontado, quilo, valor;
        Scanner input = new Scanner(System.in);

        quilo = 39;
        pesoPrato = 0.450;

        System.out.print("Insira o peso do prato montado (em Kg): ");
        pesoPratoMontado = input.nextDouble();

        pesoPratoMontado = pesoPratoMontado - pesoPrato;
        valor = quilo * pesoPratoMontado;
        System.out.printf("Valor a pagar: R$%.2f", valor);

    }

}
