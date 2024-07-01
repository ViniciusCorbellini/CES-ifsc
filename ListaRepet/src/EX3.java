
package listarepeticao;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 1, contador = 0;
        String nome;
        char sexo;

        while (idade != 0) {
            System.out.print("Insira a sua idade (ou 00 para encerrar o programa): ");
            String idadeStr = input.nextLine();

            if (!idadeStr.equals("00")) {

                idade = Integer.parseInt(idadeStr);

                System.out.print("Insira o seu nome: ");
                nome = input.nextLine();

                System.out.print("Insira o seu genero (M para masculino ou F para feminino): ");
                sexo = input.next().charAt(0);
                sexo = Character.toUpperCase(sexo);

                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Sexo: " + sexo);

                contador++;
                input.nextLine();
            } else {
                break;
            }
        }

        System.out.println("Quantidade de repetições do algoritmo: " + contador);

    }

}
