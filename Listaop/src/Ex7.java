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
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, comprimento, largura, piso, volume, paredes;

        System.out.print("Insira a altura da sala: ");
        altura = input.nextDouble();

        System.out.print("Insira o comprimento da sala: ");
        comprimento = input.nextDouble();

        System.out.print("Insira a largura da sala: ");
        largura = input.nextDouble();

        System.out.println("_____________________________");
        piso = comprimento * largura;
        System.out.println("A area do piso e de " + piso + " metros quadrados.");

        volume = altura * comprimento * largura;
        System.out.println("O volume da sala e de " + volume + " metros cubicos.");

        paredes = (altura * comprimento * 2) + (altura * largura * 2);
        System.out.println("A ares das paredes e de " + paredes + " metros quadrados");

        boolean arPequeno = volume < 100;
        boolean arMedio = volume >= 100 && volume <= 500;
        boolean arGrande = volume > 500;

        System.out.printf("\nAr Pequeno: %b" + "\nAr Medio: %b" + "\nAr Grande: %b", arPequeno, arMedio, arGrande);

    }
}
