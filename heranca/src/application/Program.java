package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(500);
        System.out.println("Balance after withdraw: " + acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Ana", 1000.0, 0.01);
        acc2.withdraw(500);
        System.out.println("Balance after withdraw: " + acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println("Balance after withdraw: " + acc3.getBalance());

//        BusinessAccount account = new BusinessAccount();
//
//        Account account1 = new Account(1001, "Alex", 0.0);
//
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//
//        //UPCASTING
//
//        Account account2 = bacc;
//        Account account3 = new BusinessAccount(1003, "John", 0.0, 200.0);
//        Account account4 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
//
//
//        // DOWNCASTING
//
//        BusinessAccount account5 = (BusinessAccount)account3;
//        account5.loan(100.0);
//
//
//        if (account4 instanceof BusinessAccount) {
//            BusinessAccount account6 = (BusinessAccount)account4;
//            account6.loan(100.0);
//            System.out.println("Loan!");
//        }
//        if  (account4 instanceof SavingsAccount) {
//            SavingsAccount account6 = (SavingsAccount) account4;
//            account6.updateBalance();
//            System.out.println("Update!");
//        }

    }
}