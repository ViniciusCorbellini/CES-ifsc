
package listarepeticao;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 1, num2 = 0, soma;

        while (num1 >= num2) {
            System.out.print("Digite um numero: ");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite outro numero: ");
            num2 = Integer.parseInt(scanner.nextLine());

            if (num1 >= num2) {
                System.out.println("O segundo numero nao é maior que o primeiro! ");
            }
        }
        System.out.println("_____________________");

        soma = num1 + num2;
        System.out.println("Soma = " + soma);
        System.out.println("Encerrando>>>>>");

    }

}
