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
public class Ex8 {

    public static void main(String[] args) {
        double salarioMin, quantidadeVendas, valorVendas, salario;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor do salário mínimo: ");
        salarioMin = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira a quantidade de automóveis vendidos: ");
        quantidadeVendas = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira o valor das vendas: ");
        valorVendas = Double.parseDouble(input.nextLine());     
        
        salario = salarioMin*2 + quantidadeVendas*150 + valorVendas*0.05;
        System.out.println("O salário do funcionário é: "+salario);
    }

}
