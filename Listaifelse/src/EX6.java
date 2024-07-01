/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX6 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o numero 1");
        n1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Insira o numero 2");
        n2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Insira o numero 3");
        n3 = Integer.parseInt(input.nextLine());
        
        if (n1 <= n2 && n1 <= n3) {
            System.out.println("Menor: " + n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("Menor: " + n2);
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println("Menor: " + n3);
        }
    }

}
