package seção04;
import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        // para variável int - nextInt();
        // para variável String - next();
        // para variável char - next().charAt(0); ---> aponta o caractere específico em sua posição
        // 

        System.out.printf("Você digitou: %.2f", x);


        sc.close();
    }
}
