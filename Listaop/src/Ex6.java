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
public class Ex6 {

    public static void main(String[] args) {
        double prova1, prova2, trabalho, frequencia;
        boolean aprovado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a nota da prova 1: ");
        prova1 = input.nextDouble();
        
        System.out.print("Insira a nota da prova 2: ");
        prova2 = input.nextDouble();
        
        System.out.print("Insira a nota do trabalho: ");
        trabalho = input.nextDouble();
        
        System.out.print("Insira a frequencia: ");
        frequencia = input.nextDouble();

        aprovado = (trabalho >= 7 && (prova1 >= 6 || prova2 >=6) && frequencia >= 75) || (trabalho >= 6 && trabalho <= 7 && (prova1 >= 6 || prova2 >=6) && frequencia >= 90);
        System.out.printf("\nAprovado: %b",aprovado);
    }

}
