import entities.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Informe os dados da conta");
        System.out.print("Numero da conta: ");
        int number = input.nextInt();
        System.out.print("Titular: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = input.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = input.nextDouble();


        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }


        input.close();

    }
}