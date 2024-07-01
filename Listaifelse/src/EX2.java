/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX2 {

    public static void main(String[] args) {
        double p1, p2, tr;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a nota da prova 1: ");
        p1 = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira a nota da prova 2: ");
        p2 = Double.parseDouble(input.nextLine());
        
        System.out.print("Insira a nota do trabalho: ");
        tr = Double.parseDouble(input.nextLine());
        
        if (tr >= 7) {
            if (p1 >= 6 || p2 >= 6) {
                System.out.println("Parabéns, você foi aprovado");
            } else {
                System.out.println("Infelizmente, você não foi aprovado");
            }

        } else {
            System.out.println("Infelizmente, você não foi aprovado");
        }

    }

}
