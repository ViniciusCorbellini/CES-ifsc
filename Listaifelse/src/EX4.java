/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, resto;
        
        System.out.println("insira um numero qualquer");
        num = input.nextInt();
        resto = num % 2;
        
        if (resto == 1) {
            System.out.println("Impar");

        } else if (num == 0) {
            System.out.println("numero invalido");

        } else {
            System.out.println("Par");
        }

    }

}
