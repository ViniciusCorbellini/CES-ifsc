/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira um número para a radiciação: ");
        double x = scanner.nextDouble();
        if (x < 0) {
            System.out.println("Raiz indefinida");
        } else {
            double raiz = Math.sqrt(x);
            System.out.println("A raiz de " + x + " é:  " + raiz);
        }
    }
}
