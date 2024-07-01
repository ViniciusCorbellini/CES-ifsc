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
public class Ex3 {

    public static void main(String[] args) {
        boolean consumoEl;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantia de KwH consumida: ");
        double kw = input.nextDouble();

        System.out.println("Insira o preço do KwH: ");
        double preco = input.nextDouble();

        double total = kw * preco;
        double juro = total * 1.1;

        System.out.println("O preco total a ser pago é de: R$" + total + ", e com juros será: R$" + juro);
        
        boolean consumoElevado = quantidadeQuilowatts > 70;
        System.out.println("Consumo elevado = " + consumoEl);

    }
}
