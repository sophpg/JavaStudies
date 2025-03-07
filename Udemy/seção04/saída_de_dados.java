package seção04;
import java.util.Locale;

public class saída_de_dados {
    public static void main(String[] args) {

        double x = 10.5467;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x); // %n ou \n executam quebra de linha 
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US); // importação de classe ---> import java.util.Locale;
        // essa ação muda o local para o escolhido pelo desenvolvedor e configura a localização utilizando características dela 
        System.out.printf("%.4f\n", x);

        // concatenar elementos com print e println
        System.out.println("Resultado = " + x + " metros.");

        //concatenar elementos com printf --> ("texto 1 %f texto 2 %f texto 3", variavel1, variavel2)
        System.out.printf("Resultado = %.2f metros%n", x); 
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
        // %f - ponto fluetuante - float 
        // %d - inteiro - int 
        // %s - texto - string
        // %n ou \n - quebra de linha 
    }
}