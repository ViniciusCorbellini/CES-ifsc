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
public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.print("Qual é o primeiro número? ");
        a = input.nextDouble();

        System.out.print("Qual é o segundo número? ");
        b = input.nextDouble();

        boolean iguais = a==b;
        System.out.printf("\nNumeros iguais: %b", iguais);
        
    }

}
