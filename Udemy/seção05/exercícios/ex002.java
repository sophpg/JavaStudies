package exercícios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Insira um número inteiro qualquer: ");
        numero = teclado.nextInt();

        if ( (numero % 2) == 0 ) {
            System.out.println("NÚMERO PAR");
        }
        else {
            System.out.println("NÚMERO ÍMPAR");
        }

        teclado.close();
    }
}
