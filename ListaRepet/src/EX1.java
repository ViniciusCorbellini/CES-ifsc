
package listarepeticao;

import java.util.Scanner;


public class EX1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1=1, num2=0;
        
        while (num1 != num2) {
            System.out.print("Digite um numero: ");
            num1 = Double.parseDouble(input.nextLine());
            
            System.out.print("Digite outro numero: ");
            num2 = Double.parseDouble(input.nextLine());
            
            if (num1 != num2){
                System.out.println("Os valores informados são diferentes! ");
            }
        }
        System.out.println("Os valores informados são iguais>>> Encerrando");

    }
    
}
