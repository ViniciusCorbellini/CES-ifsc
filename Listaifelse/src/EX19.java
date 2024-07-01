/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Insira o dia:");
        dia = Integer.parseInt(input.nextLine());

        System.out.println("Insira o mes:");
        mes = Integer.parseInt(input.nextLine());

        System.out.println("Insira o ano:");
        ano = Integer.parseInt(input.nextLine());

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ano >= 0 && ano <= 9999) {
            if (mes >= 1 && mes <= 12) {
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                        && (dia >= 1 && dia <= 31)) {
                    System.out.println("Data valida");
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
                    System.out.println("Data valida");
                } else if (mes == 2) {
                    if ((bissexto && dia >= 1 && dia <= 29) || (!bissexto && dia >= 1 && dia <= 28)) {
                        System.out.println("Data valida");
                    } else {
                        System.out.println("Data invalida");
                    }
                } else {
                    System.out.println("Data invalida");
                }
            } else {
                System.out.println("Data invalida");
            }
        } else {
            System.out.println("Data invalida");
        }
    }
}
