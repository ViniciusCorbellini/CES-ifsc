/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class EX12 {
    public static void main(String[] args) {
        double ang;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor do angulo:");
        ang = input.nextDouble();
        
        if (ang<90){
            System.out.println("Angulo agudo");
        
        }else if (ang ==90){
            System.out.println("Angulo reto");
        
        }else if (ang > 90){
            System.out.println("Angulo obtuso");
        }
    }
}
