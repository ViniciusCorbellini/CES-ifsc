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
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, consumo, preco;

        System.out.println("Qual é a distância a ser percorrida em Km?");
        distancia = input.nextDouble();

        System.out.println("Qual é o consumo médio do carro em Km/litro?");
        consumo = input.nextDouble();

        System.out.println("Qual é o custo do litro do combustível?");
        preco = input.nextDouble();

        double x = distancia / consumo;
        double y = x * preco;

        System.out.println("O valor a ser gasto com combustível na viagem será de aproximadamente R$" + y);

    }

}
