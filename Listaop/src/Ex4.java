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
public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("Insira sua altura (em Metros): ");
        altura = input.nextDouble();

        System.out.print("Insira seu peso (em Kg): ");
        peso = input.nextDouble();

        imc = peso / (altura * altura);
        boolean pesoIdeal = imc > 25;
        
        System.out.println("IMC: " + imc);
        System.out.println("Acima do peso ideal: " + pesoIdeal);
    }

}
