package seção04.exercícios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int valor01 = sc.nextInt();
        int valor02 = sc.nextInt();

        int soma = valor01 + valor02;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
