/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;

        System.out.print("Insira o valor do lado X: ");
        x = scanner.nextDouble();

        System.out.print("Insira o valor do lado Y: ");
        y = scanner.nextDouble();

        System.out.print("Insira o valor do lado Z: ");
        z = scanner.nextDouble();
        
        if (x < y + z && y < x + z && z < x + y) {
            
            if (x == y && y == z) {
                System.out.println("equilátero.");
            
            } else if (x == y || x == z || y == z) {
                System.out.println("isósceles.");
            
            } else {
                System.out.println("triângulo escaleno.");
            }
        } else {
            System.out.println("Esses lados não formam um triângulo.");
        }
    }

}
