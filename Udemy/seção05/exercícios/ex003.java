package exercícios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = teclado.nextInt();

        if ((n1 % n2 == 0) || (n2 %n1 == 0)) {
            System.err.println("MÚLTIPLOS");
        } 
        else {
            System.out.println("NÃO MÚLTIPLO");
        }

        teclado.close();
    }
}
