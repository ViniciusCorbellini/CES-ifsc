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
public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempo, distancia;

        System.out.print("Informe, em segundos, o tempo que transcorreu entre ter visto o raio e ter ouvido o som do trovao: ");
        tempo = input.nextDouble();

        distancia = tempo * 340;
        System.out.println("Voce esta a " + distancia + "m do raio.");

        boolean areaPerigo = distancia <= 200;
        System.out.printf("Area de risco: %b", areaPerigo);

    }
}
