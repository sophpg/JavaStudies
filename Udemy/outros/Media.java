package outros;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double x, y, media;

        System.out.print("Digite o primeiro número: ");
        x = teclado.nextDouble(); 
        System.out.print("Digite o segundo número: ");
        y = teclado.nextDouble();
        media = (x + y) / 2;
        System.out.println("Media = " + media);
        
        teclado.close();
    }
}