package exercícios;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int codigo;
        int quantidade; 
        

        System.out.println("Insira o código do produto: ");
        codigo = teclado.nextInt();
        System.out.println("Insira a quantidade: ");
        quantidade = teclado.nextInt();
        
        double total = 0;

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else if (codigo == 5)  {
            total = quantidade * 1.5;
        }
        else {
            System.out.println("ERRO! Selecione entre os códigos 1 e 5.");
        }

        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}
