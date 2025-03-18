package exercícios;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int inicio;
        int fim; 
        int duracao;

        System.out.println("Insira o horário de início do jogo: ");
        inicio = teclado.nextInt();
        System.out.println("Insira o horário que finaliza o jogo: ");
        fim = teclado.nextInt();

        if (inicio < fim) {
            duracao = fim - inicio; 
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

        teclado.close();   
    }
}
