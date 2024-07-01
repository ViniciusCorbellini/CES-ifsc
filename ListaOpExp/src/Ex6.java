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
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheint;

        System.out.print("Digite uma temperatura em Celsius: ");
        celsius = input.nextDouble();

        fahrenheint = (celsius * 9 / 5) + 32;
        System.out.printf("\nA temperatura em Fahrenheint é: %.2f°", fahrenheint);

    }

}
