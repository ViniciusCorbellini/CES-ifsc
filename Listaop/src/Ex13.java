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
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.print("Insira o valor de A: ");
        a = Double.parseDouble(input.nextLine());

        System.out.print("Insira o valor de B: ");
        b = Double.parseDouble(input.nextLine());

        System.out.print("Insira o valor de C: ");
        c = Double.parseDouble(input.nextLine());
        
        if (a + b < c) {
            System.out.println("A some de A com B é menor que C");
        } else if (a + b == c) {
            System.out.println("A soma de A com B é igual a C");
        } else {
            System.out.println("A soma de A com B é maior que C");
        }

    }

}
