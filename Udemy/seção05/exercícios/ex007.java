package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Insira o ponto x do quadrante: ");
        x = teclado.nextDouble();
        System.out.println("Insira o ponto y do quadrante: ");
        y = teclado.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else {
            System.out.println("Tente novamente.");
        }

        teclado.close();
    }
}
