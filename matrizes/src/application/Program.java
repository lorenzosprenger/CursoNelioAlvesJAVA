package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal:");
        for (int row = 0; row < n; row++) {
            System.out.print( matriz[row][row] + " ");
        }
        System.out.println();

        Integer negative = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (matriz[row][col] < 0) {
                    System.out.print(matriz[row][col] + " ");
                    negative += 1;
                }
            }
        }
        System.out.println();
        System.out.print("Negative numbers: "+ negative);


        sc.close();
    }
}
