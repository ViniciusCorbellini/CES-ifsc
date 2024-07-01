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
public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sistdecola;
        double pista;
        int peso, visibilidade, precipitacao, passageiros;

        System.out.print("Insira o tamanho da pista(em Km):");
        pista = scanner.nextDouble();

        System.out.print("Insira o peso do aviao(em toneladas): ");
        peso = scanner.nextInt();

        System.out.print("Insira a visibilidade da pista(metros): ");
        visibilidade = scanner.nextInt();

        System.out.print("Insira a precipitacao, caso nao esteja chovendo digite 0 (em mm): ");
        precipitacao = scanner.nextInt();

        System.out.print("Insira a quantidade de passageiros no aviao: ");
        passageiros = scanner.nextInt();

        System.out.print("O avião possui sistema de decolagem(s/n)? ");
        sistdecola = scanner.next().charAt(0);
        boolean sistDecolagem = sistdecola == 's';

        boolean decolar = ((pista < 1.5 && peso < 40) || ((pista >= 1.5 && pista <= 2) && peso <= 60) || (pista > 2)) && (visibilidade > 20 || sistDecolagem) && (precipitacao < 5) && !(passageiros > 100 && (precipitacao != 0));
        System.out.printf("Decola: %b\n", decolar);

    }

}
