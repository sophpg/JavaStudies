package seção04;
import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados2 {
    public static void main(String[] args) {
        
        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double x;
        String y;
        int z;

        x = sc.nextDouble();
        y = sc.next();
        z = sc.nextInt();
        
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); */

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        /* LIMPAR BUFFER DE LEITURA 
         *  quando se usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha,
         * essa quebra de linha fica pendente na entrada padrão.
         * Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
         * SOLUÇÃO: faça um nextLine() extra antes de fazer o nextLine de seu interesse.
         */

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine(); 
        s2 = sc.nextLine(); 
        s3 = sc.nextLine();
        
        // o nextLine lê frases, parágrafos, textos longos - ou seja, até a quebra de linha 
        // já somente o next() lê somente uma palavra 

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); 
    }
    
}
