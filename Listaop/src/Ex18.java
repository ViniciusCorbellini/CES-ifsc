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
public class Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaNascimento, mesNascimento, anoNascimento, dia, mes, ano;

        System.out.print("Insira a sua data de nascimento (DD/MM/YYYY): ");
        String dataNasc = scanner.nextLine();
        
        String[] partes = dataNasc.split("/");
        diaNascimento = Integer.parseInt(partes[0]);
        mesNascimento = Integer.parseInt(partes[1]);
        anoNascimento = Integer.parseInt(partes[2]);

        System.out.print("Insira o dia de hoje (DD/MM/YYYY): ");
        String dataHoje = scanner.nextLine();
        
        String[] dataHojeArray = dataHoje.split("/");
        dia = Integer.parseInt(dataHojeArray[0]);
        mes = Integer.parseInt(dataHojeArray[1]);
        ano = Integer.parseInt(dataHojeArray[2]);

        int totalAno = ano - anoNascimento;
        int totalMeses = mes - mesNascimento;
        int totalDias = dia - diaNascimento;
        
        totalDias = totalAno * 360 + totalMeses * 30 + totalDias;
        System.out.println("Se passaram " + totalDias + " dias desde seu nascimento");
        
        
    }

}
