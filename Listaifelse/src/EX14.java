/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX14 {

    public static void main(String[] args) {
        double altura, pesoIdeal=0;
        char genero;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira sua altura (em metros): ");
        altura = input.nextDouble();

        System.out.print("Insira seu genero (M ou F): ");
        genero = input.next().charAt(0);
        genero = Character.toUpperCase(genero);

        if (genero == 'M') {
            pesoIdeal = 72.7 * altura - 58;

        } else if (genero == 'F') {
            pesoIdeal = 62.1 * altura - 44.7;

        } else {
            System.out.println("Erro: letra invalida");
            System.exit(0);

        }
        System.out.println("Peso ideal: " + pesoIdeal + " Kg");
    }
}
