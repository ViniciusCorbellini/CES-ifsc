/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX11 {

    public static void main(String[] args) {
        int hora, min, sec;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o segundo (0-59): ");
        sec = input.nextInt();
        System.out.println("Insira o minuto (0-59): ");
        min = input.nextInt();
        System.out.println("Insira a hora (0-23): ");
        hora = input.nextInt();

        if (hora > 23 || hora < 0 || min > 59 || min < 0 || sec > 59 || sec < 0) {
            System.out.println("Horário invalido");
            System.exit(0);

        } else {
            sec++;
            if (sec >= 60) {
                sec = 00;
                min++;
                System.out.println("Hora");

                if (min >= 60) {
                    min = 00;
                    hora++;
                    if (hora >= 24) {
                        hora = 00;
                    }
                }

            }

        }
        System.out.println("Horario: " + hora + ":" + min + ":" + sec);

    }

}
