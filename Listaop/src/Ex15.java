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
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salBruto, imposto, salLiq, ganho, total;

        System.out.print("Insira o seu salario bruto: ");
        salBruto = Double.parseDouble(input.nextLine());

        System.out.print("Insira o numero de dependentes que voce possui: ");
        int depen = Integer.parseInt(input.nextLine());

        imposto = 0.74;
        salLiq = salBruto * imposto;

        ganho = depen * 150;
        total = ganho + salLiq;

        System.out.println("O seu salario liquido e de: R$" + salLiq + ", e voce ganhara um adicional de R$" + ganho + " por conta dos dependentes, " + "totalizando: R$" + total);

    }

}
