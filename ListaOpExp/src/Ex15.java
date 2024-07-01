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
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, engordar, emagrecer;
        
        System.out.print("Insira o seu peso: ");
        peso = Double.parseDouble(input.nextLine());
        
        engordar = peso * 1.15;
        emagrecer = peso * 0.8;
        
        System.out.printf("\nSe você engordar 15%%, seu peso será aproximadamente: %.2fKg", engordar);
        System.out.printf("\nSe você emagrecer 20%%, seu peso será aproximadamente: %.2fKg", emagrecer);
    }

}
