/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class EX17 {

    public static void main(String[] args) {
        double pesoTerra;
        String planeta;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu peso na Terra (em kg): ");
        pesoTerra = Double.parseDouble(input.nextLine());

        System.out.print("Insira o planeta para a conversão de peso (sem fazer o uso de acentos; EX: mercurio): ");
        planeta = input.nextLine().toLowerCase();

        double MERCURIO = pesoTerra * 0.37;
        double VENUS = pesoTerra * 0.88;
        double MARTE = pesoTerra * 0.38;
        double JUPITER = pesoTerra * 2.64;
        double SATURNO = pesoTerra * 1.15;
        double URANO = pesoTerra * 1.17;
        double NETUNO = pesoTerra * 1.18;

        switch (planeta) {
            case "mercurio":
                System.out.println("Peso em mercurio: " + MERCURIO);
                break;
            case "venus":
                System.out.println("Peso em venus: " + VENUS);
                break;
            case "marte":
                System.out.println("Peso em marte: " + MARTE);
                break;
            case "jupiter":
                System.out.println("Peso em jupiter: " + JUPITER);
                break;
            case "saturno":
                System.out.println("Peso em saturno: " + SATURNO);
                break;
            case "urano":
                System.out.println("Peso em urano: " + URANO);
                break;
            case "netuno":
                System.out.println("Peso em netuno: " + NETUNO);
                break;
            default:
                System.out.println("Planeta invalido, tente remover os acentos");
        }
    }
}
