
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Insira a idade do nadador (5+): ");
        idade = Integer.parseInt(input.nextLine());

        if (idade <= 10 && idade >= 5) {
            System.out.println("Categoria infantil");

        } else if (idade <= 17) {
            System.out.println("Categoria juvenil");

        } else if (idade <= 60) {
            System.out.println("Categoria adulta");

        } else if (idade > 60) {
            System.out.println("Categoria Senior");

        } else {
            System.out.println("Idade invalida");

        }
    }
}
