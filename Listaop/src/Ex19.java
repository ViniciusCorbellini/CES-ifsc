/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaoperadores;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, resto, num1, num2, num3, soma;

        System.out.print("Insira um numero entre 0 e 999: ");
        num = Integer.parseInt(input.nextLine());

        num1 = num / 100;
        resto = num % 100;

        num2 = resto / 10;
        num3 = resto % 10;

        soma = num1 + num2 + num3;

        System.out.println("Soma: " + num1 + " + " + num2 + " + " + num3);
        System.out.println("Resultado: " + soma);

    }

}
