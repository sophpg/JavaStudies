package seção04;

public class processamento_de_dados {
    public static void main(String[] args) {
        
        //EX 01
        double b, B, h, area;

        b = 6.0; 
        B = 8.0; 
        h = 5.0;

        // BOAS PRÁTICAS DE PROGRAMAÇÃO 
        // é sempre indicado que identifique o tipo de variável, portanto, o .0 indica que é uma variável double
        // caso  fosse uma variável tipo float, seria indicado colocar um f após o número. EX: b = 6f;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //EX 02
        int a, c;
        double resultado;

        a = 5;
        c = 2;

        resultado = (double) a / c; 
        // como estão sendo utilizados dois números int, precisamos sinalizar que o resultado pode ser decimal, utilizando o doble entre parênteses na frente da operação
        System.out.println(resultado);
    }
}