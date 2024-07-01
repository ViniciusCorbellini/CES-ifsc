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
public class Ex9 {

    public static void main(String[] args) {
        float quantidadeCafe, custoCafe, volumeLeite, custoLeite, pacotesBolacha, custoBolacha;
        float gastoCafe, gastoLeite, gastoBolacha, gastoTotal;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o peso de café vendido (em Kg): ");
        quantidadeCafe = Float.parseFloat(input.nextLine());

        System.out.print("Insira o custo do quilo do café (R$): ");
        custoCafe = Float.parseFloat(input.nextLine());

        System.out.print("Insira o volume vendido de leite (em Litros): ");
        volumeLeite = Float.parseFloat(input.nextLine());

        System.out.print("Insira o custo do litro do leite (R$): ");
        custoLeite = Float.parseFloat(input.nextLine());

        System.out.print("Insira a quantidade de pacotes de bolcha vendida: ");
        pacotesBolacha = Float.parseFloat(input.nextLine());

        System.out.print("Insira o custo unitário do pacote de bolacha (R$): ");
        custoBolacha = Float.parseFloat(input.nextLine());

        gastoCafe = quantidadeCafe * custoCafe;
        gastoLeite = volumeLeite * custoLeite;
        gastoBolacha = pacotesBolacha * custoBolacha;
        gastoTotal = gastoCafe + gastoLeite + gastoBolacha;

        System.out.println("__________________________________");
        System.out.printf("Total gasto com café: R$%.2f", gastoCafe);
        System.out.printf("\nTotal gasto com leite: R$%.2f", gastoLeite);
        System.out.printf("\nTotal gasto com bolacha: R$%.2f", gastoBolacha);
        System.out.printf("\nValor total: R$%.2f", gastoTotal);
    }

}
