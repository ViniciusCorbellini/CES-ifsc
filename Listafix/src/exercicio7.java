/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira um número: ");
        double number = scanner.nextDouble();
        double quadrado = number * number;
        System.out.println("O quadrado de " + number);
        System.out.println("é: " + quadrado);
    }

}
