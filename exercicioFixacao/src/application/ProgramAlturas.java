package application;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n+1];
        int[] idade = new int[n+1];
        double[] altura = new double[n+1];


        System.out.println();

        for (int i = 1; i < n+1; i++) {
            System.out.printf("Dados da %da pessoa: ",i );
            System.out.println();
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double menorIdade = 0,sum = 0, media = 0.0;


        for (int i = 1; i < n+1; i++) {
            sum += altura[i];

        }
        media = sum/ n;
        System.out.printf("Altura média: %.2f%%/n", media);
        for (int i = 1; i < n+1; i++) {
            if (idade[i] < 16){
                menorIdade++;
            }

        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f/n", (menorIdade/n) * 100);
        for (int i = 1; i < n+1; i++) {
            if (idade[i] < 16){
                System.out.printf("%s\n", nome[i]);
            }

        }



    }
}
