/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Celsius(C°): ");
        double celsius = input.nextDouble();
        double F = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em Fahrenheint é:  " + F + "°");
    }

}
