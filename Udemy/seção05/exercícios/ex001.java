package exercícios;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro, positivo ou negativo: ");
        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("NÚMERO POSITIVO");
        }
        else {
            System.out.println("NÚMERO NEGATIVO");
        }

        teclado.close();
    }
    
}
