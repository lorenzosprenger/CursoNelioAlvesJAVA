import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 0 ){
            System.out.println("NAO NEGATIVO");

        } else{
            System.out.println("NEGATIVO");
        }
        sc.close();
    }
}