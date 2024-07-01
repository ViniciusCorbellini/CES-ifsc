/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotarefa;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Ex16 {

    public static void main(String[] args) {
        int salario = 1500, c1 = 200, c2 = 120;
        double multa, resto;
        
        multa = (c1 + c2) * 1.02;
        resto = salario - multa;
        
        System.out.println("O restante do salário será: " + resto);
    }
}
