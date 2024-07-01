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
public class Ex16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mercadoriaA, mercadoriaA2, mercadoriaB, mercadoriaB2, mercadoriaC, mercadoriaC2, inflacao;

        System.out.print("Qual era o preço da mercadoria A no dia 01/01/2022? ");
        mercadoriaA = input.nextDouble();

        System.out.print("Qual era o preço da mercadoria B no dia 01/01/2022? ");
        mercadoriaB = input.nextDouble();

        System.out.print("Qual era o preço da mercadoria C no dia 01/01/2022? ");
        mercadoriaC = input.nextDouble();

        System.out.print("Qual era o preço da mercadoria A no dia 01/02/2022? ");
        mercadoriaA2 = input.nextDouble();

        System.out.print("Qual era o preço da mercadoria B no dia 01/02/2022? ");
        mercadoriaB2 = input.nextDouble();

        System.out.print("Qual era o preço da mercadoria C no dia 01/02/2022? ");
        mercadoriaC2 = input.nextDouble();

        inflacao = (((mercadoriaA2 - mercadoriaA) / mercadoriaA) + ((mercadoriaB2 - mercadoriaB) / mercadoriaB) + ((mercadoriaC2 - mercadoriaC) / mercadoriaC)) / 3;
        boolean inflacaoAlta = inflacao > 0.0055;
        System.out.println("\nInflacao acima da meta: "+inflacaoAlta); 
        
        }

}
