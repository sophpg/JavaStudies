package seção04.exercícios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, formula;

        System.out.println("Insira 4 valor inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        formula = (a * b - c * d);
        System.out.println("DIFERENÇA = " + formula);


        sc.close();

    }
}
