/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio2e3 {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("digite um número: ");
        number = input.nextInt();
        int sucessor = number + 1;
        int antecessor = number - 1;
        System.out.println("sucessor: " + sucessor);
        System.out.println("antecessor: " + antecessor);
    }

}
