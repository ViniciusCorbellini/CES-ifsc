/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX16 {

    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor da abcissa (x):");
        x = input.nextDouble();
        
        System.out.println("Insira o valor da ordenada (y):");
        y = input.nextDouble();
        
        if (x > 0 && y > 0) {
            System.out.println("o ponto está localizado no primeiro quadrante");
        
        } else if (x < 0 && y > 0) {
            System.out.println("o ponto está localizado no segundo quadrante");
        
        } else if (x < 0 && y < 0) {
            System.out.println("o ponto está localizado no terceiro quadrante");
        
        } else if (x > 0 && y < 0) {
            System.out.println("o ponto está localizado no quarto quadrante");
        }
    }
}
