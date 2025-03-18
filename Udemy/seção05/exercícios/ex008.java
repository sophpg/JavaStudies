package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double salario;
        double imposto;

        System.out.println("Insira o valor do salário entre R$0,00 e R$4500,00: ");
        salario = teclado.nextDouble();

        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

        if (imposto == 0.0) {
            System.out.println("Isento de imposto");
        }
        else {
            System.out.printf("R$ %.2f", imposto);
        }

        teclado.close();
    }
}
