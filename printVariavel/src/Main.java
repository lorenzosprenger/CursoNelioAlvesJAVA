import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int numeroInteiro = 22;
        double numeroDouble = 10.23512;
        String nome = "Lorenzo";
        int idade = 18;
        double altura = 1.75;



        System.out.println("O número inteiro é " + numeroInteiro);
        System.out.printf("O número flutuante com 2 casas decimais é %.2f%n", numeroDouble);

        Locale.setDefault(Locale.US);
        System.out.printf("O número flutuante com 4 casas decimais é %.4f%n", numeroDouble);
        System.out.println("RESULTADO = " + numeroInteiro + " METROS");

        System.out.printf("Meu nome é %s tenho %d anos e %.2f de altura%n", nome, idade, altura);
    }
}

