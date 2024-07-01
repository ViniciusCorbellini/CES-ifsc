/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaoperadores;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Ex17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalParcelas, parcelasPagas;
        double valorParcela, saldoDevedor, totalPago, valorTotal;

        System.out.print("Insira o total de parcelas do consórcio: ");
        totalParcelas = Integer.parseInt(input.nextLine());

        System.out.print("Insira o valor das parcelas: ");
        valorParcela = Integer.parseInt(input.nextLine());

        System.out.print("Insira a quantidade de parcelas pagas: ");
        parcelasPagas = Integer.parseInt(input.nextLine());

        valorTotal = totalParcelas * valorParcela;
        totalPago = parcelasPagas * valorParcela;
        saldoDevedor = valorTotal - totalPago;

        System.out.println("Total pago: " + totalPago);
        System.out.println("Saldo devedor: " + saldoDevedor);
    }

}
