
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX8 {
    public static void main(String[] args) {
        char categoria;
        double salario, nsal = 0;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome do funcionario: ");
        nome = input.nextLine();

        System.out.print("Insira a categoria do funcionario: ");
        categoria = input.next().charAt(0);
        categoria = Character.toUpperCase(categoria);

        System.out.print("Insira o salario atual do funcionario: ");
        salario = input.nextDouble();

        if (categoria == 'A') {
            nsal = salario * 1.1;

        } else if (categoria == 'B') {
            nsal = salario * 1.15;

        } else if (categoria == 'C') {
            nsal = salario * 1.25;

        } else if (categoria == 'D') {
            nsal = salario * 1.15;

        } else if (categoria == 'E') {
            nsal = salario * 1.15;

        } else if (categoria == 'F') {
            nsal = salario * 1.25;

        } else if (categoria == 'H') {
            nsal = salario * 1.1;

        } else {
            nsal = salario * 1.30;

        }
        System.out.println("nome: " + nome);
        System.out.printf("Salario atual: R$%.2f%n", salario);
        System.out.println("categoria: " + categoria);
        System.out.printf("Novo salario: R$%.2f%n", nsal);

    }

}
