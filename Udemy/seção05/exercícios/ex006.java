package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double numero; 

        System.out.println("Insira um número entre 0 e 100: ");
        numero = teclado.nextDouble();

        if (numero < 0) {
            System.out.println("Fora de intervalo.");
        }
        else if(numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo [26,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo [51,75]");
        }
        else if (numero <= 100.0) {
            System.out.println("Intervalo [76,100]");
        }
        else {
            System.out.println("Fora de intervalo.");
        }

        teclado.close();
    }
}
