/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Cliente
 */
public class EX7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] val = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o " + (i + 1) + "° valor");
            val[i] = input.nextInt();
        }
        Arrays.sort(val);

        System.out.println("aqui estão os valores em ordem crescente:");
        for (int valor : val) {
            System.out.println(valor);
        }
    }

}
