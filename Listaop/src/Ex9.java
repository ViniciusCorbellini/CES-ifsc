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
public class Ex9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double compra, pago, troco;
        int moeda1, cedula10, cedula100;

        System.out.print("Insira o custo da compra: ");
        compra = input.nextDouble();
        System.out.print("Insira o valor pago pelo cliente: ");
        pago = input.nextDouble();
        System.out.println("A compra foi de: R$" + compra + ", o valor pago foi: R$" + pago);

        troco = pago - compra;
        System.out.println("O troco dado ao cliente sera de: " + troco);

        if (pago > compra) {
            cedula100 = (int) troco / 100;
            troco -= cedula100 * 100;
            cedula10 = (int) troco / 10;
            troco -= cedula10 * 10;
            moeda1 = (int) troco;
            System.out.println(cedula100 + " cedulas de R$100, " + cedula10 + " cedulas de R$10, e " + moeda1 + " moedas de R$1.");

        } else {
            System.out.println("O valor pago foi insuficiente>>>>>");
        }
    }

}
