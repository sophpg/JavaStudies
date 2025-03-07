package seção04.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        double horas, valor, salario;

        System.out.println("Insira o número do funcionário: ");
        numero = sc.nextInt();
        System.out.println("Insira o número de horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.println("Insira o valor recebido por hora trabalhada: ");
        valor = sc.nextDouble();

        salario = horas * valor;

        System.out.println("NÚMERO: " + numero);
        System.out.printf("SALÁRIO: R$%.2f", salario);

        sc.close();
    }
    
}
