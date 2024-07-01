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
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora, minuto, segundo, totalSegundos;

        System.out.print("Insira o horario(hh:mm:ss): ");
        String horario = input.nextLine();
        String[] horarioArray = horario.split(":");

        hora = Integer.parseInt(horarioArray[0]);
        minuto = Integer.parseInt(horarioArray[1]);
        segundo = Integer.parseInt(horarioArray[2]);

        if (hora > 23) {
            System.out.println("Horário inválido");
            System.exit(0);
        }
        if (minuto > 59) {
            System.out.println("Horário inválido");
            System.exit(0);
        }
        if (segundo > 59) {
            System.out.println("Horário inválido");
            System.exit(0);
        }

        hora = hora * 3600;
        minuto = minuto * 60;
        totalSegundos = hora + minuto + segundo;
        System.out.println("Se passaram " + totalSegundos + " segundos desde o começo do dia");
    }
}
