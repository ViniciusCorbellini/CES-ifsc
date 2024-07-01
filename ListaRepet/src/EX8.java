/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listarepeticao;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX8 {
    public static void main(String[] args) {
        int idade, contadorBilheteInfantil = 0, contadorBilheteAdulto = 0;
        Scanner input = new Scanner(System.in);
        char continuar;

        System.out.println("Bem-vindo a compra de bilhetes do parque de diversoes! ");
        System.out.println("_____________________________");

        do {
            System.out.print("Insira sua idade: ");
            idade = Integer.parseInt(input.nextLine());

            if (idade < 6 && idade >= 0) {
                System.out.println("Isento de pagamento.");

            } else if (idade <= 12) {
                System.out.println("Bilhete de crianca");
                contadorBilheteInfantil++;

            } else if (idade <= 65) {
                System.out.println("Bilhete normal");
                contadorBilheteAdulto++;

            } else if (idade > 65) {
                System.out.println("Bilhete de terceira idade");

            } else {
                System.out.println("Insira uma idade valida");
            }

            System.out.println("_____________________________");
            System.out.print("Deseja continuar? (S ou N): ");
            continuar = input.next().charAt(0);
            continuar = Character.toUpperCase(continuar);
            input.nextLine();
        } while (continuar == 'S' || continuar == 'Y');

        System.out.println("_____________________________");
        System.out.println("Quantidade de bilhetes infantis vendidos: " + contadorBilheteInfantil);
        System.out.println("Quantidade de bilhetes adultos vendidos: " + contadorBilheteAdulto);
    }

}
