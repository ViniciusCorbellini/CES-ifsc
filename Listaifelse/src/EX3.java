/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX3 {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner input = new Scanner(System.in);

        System.out.println("insira o seu peso (em kg):");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Insira a sua altura (em metros):");
        altura = Double.parseDouble(input.nextLine());

        imc = peso / (altura * altura);
        System.out.println("imc: " + imc);

        if (imc < 20) {
            System.out.println("Magro");

        } else if (imc >= 20 && imc < 25) {
            System.out.println("normal");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");

        } else if (imc >= 30) {
            System.out.println("Sobrepeso");
            
        }
    }

}
