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
public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        double quociente, resto;
        
        System.out.print("Insira um número inteiro para a divisão por 2: ");
        numero = Integer.parseInt(input.nextLine());
        
        resto = numero % 2;
        quociente = (numero - resto) / 2;
        
        System.out.println("O quociente da divisão de " + numero + " por 2 é: " + quociente);
        System.out.println("O Resto da divisão de " + numero + " por 2 é: " + resto);
    }

}
