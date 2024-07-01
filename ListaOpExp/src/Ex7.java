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
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeTipo1, quantidadeTipo2, quantidadeTipo3;
        double valorArrecadado1, valorArrecadado2, valorArrecadado3, valorTotal;

        System.out.print("Insira a quantidade de picolés do tipo 1 que form vendidos: ");
        quantidadeTipo1 = Integer.parseInt(input.nextLine());

        System.out.print("Insira a quantidade de picolés do tipo 2 que form vendidos: ");
        quantidadeTipo2 = Integer.parseInt(input.nextLine());

        System.out.print("Insira a quantidade de picolés do tipo 3 que form vendidos: ");
        quantidadeTipo3 = Integer.parseInt(input.nextLine());

        valorArrecadado1 = quantidadeTipo1 * 1.50;
        valorArrecadado2 = quantidadeTipo2 * 2;
        valorArrecadado3 = quantidadeTipo3 * 0.75;

        valorTotal = valorArrecadado1 + valorArrecadado2 + valorArrecadado3;
        System.out.println("___________________________________________");
        System.out.println("Valor arrecadado com o picolé 1: R$" + valorArrecadado1);
        System.out.println("Valor arrecadado com o picolé 2: R$" + valorArrecadado2);
        System.out.println("Valor arrecadado com o picolé 3: R$" + valorArrecadado3);
        System.out.println("Valor total arrecadado: R$" + valorTotal);
    }
}
