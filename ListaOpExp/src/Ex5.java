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
public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double altura, base, area, perimetro;
        
        System.out.print("Insira a medida da altura: ");
        altura = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira a medida da base: ");
        base = Double.parseDouble(input.nextLine());
        
        area = base * altura;
        perimetro = (base + altura)* 2;
        System.out.println("A área do retângulo é: " + area + "\nO perimetro é: " + perimetro);
    }
}
