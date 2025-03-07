package seção04.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextInt();
        double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.printf("A = %.4f", area);

        sc.close();

    }
}
