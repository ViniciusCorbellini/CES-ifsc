/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[3];
        int[] estoque = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Insira o nome de um produto: ");
            produtos[i] = scanner.nextLine();

            System.out.print("Insira a quantidade em estoque desse produto: ");
            estoque[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
        System.out.println("O(s) seguinte(s) produto(s) estao abaixo de estoque minimo(30 unidades)");
        for (int i = 0; i < 3; i++) {
            if (estoque[i] < 30) {
                System.out.println(produtos[i] + " - Quantidade em estoque: " + estoque[i]);
            }
        }
    }
}
