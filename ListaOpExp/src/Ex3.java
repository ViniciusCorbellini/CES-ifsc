/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotarefa;

/**
 *
 * @author Cliente
 */
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, soma;
         
        System.out.print("Insira um número: ");
        a = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira um segundo número: ");
        b = Double.parseDouble(input.nextLine());
        
        soma = a*a + b*b;
        System.out.println("soma dos quadrados: " + soma);
    }
    
}
