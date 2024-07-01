/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX1 {

    public static void main(String[] args) {
        double kw, pkw, conta, contaAtr;
        char atraso;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de KwH consumida: ");
        kw = Double.parseDouble(input.nextLine());

        System.out.print("Insira o preço do KwH: ");
        pkw = Double.parseDouble(input.nextLine());

        System.out.print("Conta atrasada (S ou N)? ");
        atraso = input.next().charAt(0);
        atraso = Character.toUpperCase(atraso);

        conta = kw * pkw;
        contaAtr = conta * 1.1;

        if (atraso == 'Y' || atraso == 'S') {
            System.out.println("Sua conta está em atraso: " + contaAtr);
            System.out.println("Conta se não houvesse atraso: " + conta);

        } else {
            System.out.println("Conta sem atraso: " + conta);
            System.out.println("Conta se houvesse atraso: " + contaAtr);

        }

        if (kw > 70) {
            System.out.println("Consumo elevado de energia");

        } else {
            System.out.println("Você é um consumidor consciente");

        }

    }

}
