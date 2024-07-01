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
public class Ex14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double pt, mt, cg, media;

        System.out.print("Digite o nome do candidato: ");
        nome = input.nextLine();

        System.out.print("Insira a sua nota em Português: ");
        pt = input.nextDouble();

        System.out.print("Insira a sua nota em Matemática: ");
        mt = input.nextDouble();

        System.out.print("Insira a sua nota em Conhecimentos Gerais: ");
        cg = input.nextDouble();

        media = (pt + mt + cg) / 3;

        System.out.println("O nome do candidato é: " + nome);
        System.out.println("A sua nota em Português foi: " + pt);
        System.out.println("A sua nota em Matemática foi: " + mt);
        System.out.println("A sua nota em Conhecimentos Gerais foi: " + cg);
        System.out.println("A sua média foi: " + media);

        boolean aprovado = media >= 7 && (pt >= 5 && mt >= 5 && cg >= 5);
        System.out.println("Aprovado: " + aprovado);

    }

}
