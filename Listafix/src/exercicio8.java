/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio8 {

    public static void main(String args[]) {
        double num1, num2, num3, num4, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("insira o segundo número: ");
        num2 = input.nextDouble();
        System.out.println("insira o terceiro número: ");
        num3 = input.nextDouble();
        System.out.println("insira o quarto número: ");
        num4 = input.nextDouble();

        num1 = Math.pow(num1, 2);
        num2 = Math.pow(num2, 2);
        num3 = Math.pow(num3, 2);
        num4 = Math.pow(num4, 2);

        System.out.println("Os quadrados são: " + num1 + "/ " + num2 + "/ " + num3 + "/ " + num4);
        soma = num1 + num2 + num3 + num4;
        System.out.println("A soma dos quadrados é " + soma);
    }

}
