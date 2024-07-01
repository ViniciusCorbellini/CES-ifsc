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
public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kw, preco, juro, total;

        System.out.println("Insira a quantia de KwH consumida: ");
        kw = input.nextDouble();
        
        System.out.println("Insira o preço do KwH: ");
        preco = input.nextDouble();
        total = kw * preco;
        
        juro = total * 0.1 + total;
        System.out.println("O preco total a ser pago é de: R$" + total + ", e com juros será: R$" + juro);

    }
}
