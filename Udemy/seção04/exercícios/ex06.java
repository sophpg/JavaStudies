package seção04.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.print("Insira o valor A: ");
        A = sc.nextDouble();
        System.out.print("Insira o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Insira o valor de C: ");
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = 3.14159 * C * C;
        trapezio = ((A + B) * C) /2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f\n", triangulo);
        System.out.printf("CÍRCULO: %.3f\n", circulo);
        System.out.printf("TRAPÉZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETÂNGULO: %.3f\n", retangulo);

        sc.close();
    }
    
}
