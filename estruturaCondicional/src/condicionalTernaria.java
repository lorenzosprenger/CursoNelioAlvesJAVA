import java.util.Scanner;

public class condicionalTernaria {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //(condicao) ? valor se for verdadeiro : valor se for falso

        double preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("O desconto é " + desconto);
        System.out.println("O preco ficou " + (preco - desconto));

    }
}
