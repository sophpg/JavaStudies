import java.util.Locale;
import java.util.Scanner;

public class estrutura_condicional {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double horario;

        System.out.println("Insira o horário atual: ");
        horario = teclado.nextDouble();

        if (horario <= 5) {
            System.out.println("Bom dia!");
        } 

        teclado.close();

    }
}