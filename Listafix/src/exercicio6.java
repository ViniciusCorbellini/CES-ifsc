/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("insira a distância(Km): ");
        double distancia = scanner.nextDouble();
        System.out.print("insira o volume de combustível consumido(L): ");
        double volume = scanner.nextDouble();
        double consumomedio = distancia / volume;
        System.out.print(" o consumo foi de: " +consumomedio+"Km/L");
    }

}
