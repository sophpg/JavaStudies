package seção04.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, num1, num2;
        double valor1, valor2, total;

        System.out.println("Insira o código do produto 1: ");
        cod1 = sc.nextInt();
        System.out.println("Insira a quantidade do produto 1: ");
        num1 = sc.nextInt();
        System.out.println("Insira o valor unitário do produto 1: ");
        valor1 = sc.nextDouble();
        System.out.println("Insira o código do produto 2: ");
        cod2 = sc.nextInt();
        System.out.println("Insira a quantidade do produto 2: ");
        num2 = sc.nextInt();
        System.out.println("Insira o valor unitário do produto 2: ");
        valor2 = sc.nextDouble();

        total = (num1 * valor1) + (num2 * valor2);
        System.out.printf("VALOR A PAGAR: %.2f", total);

        sc.close();
    }
    
}
