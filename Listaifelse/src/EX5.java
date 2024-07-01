/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("insira um numero: ");
        numero = input.nextInt();

        if (numero <= 10) {
            System.out.println("F1");

        } else if (numero <= 100) {
            System.out.println("F2");

        } else {
            System.out.println("F3");

        }
    }

}
