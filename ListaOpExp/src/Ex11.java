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
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Formatter formatter = new Formatter();
        int totalSegundos, segundos, minutos, horas;

        System.out.print("Insira o tempo do vídeo em segundos: ");
        totalSegundos = Integer.parseInt(input.nextLine());

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        formatter.format("%02dh:%02dm:%02ds", horas, minutos, segundos);
        String horario = formatter.toString();

        System.out.println("A duração do vídeo é de: " + horario);

    }

}
