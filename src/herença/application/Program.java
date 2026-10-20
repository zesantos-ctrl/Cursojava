package herença.application;

import java.util.List;

import herença.entities.Account;
import herença.entities.BuisnessAccount;
import herença.entities.SavingAccount;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // Account ac = new Account(1001, "alex", 0.0);

        // BuisnessAccount bacc = new BuisnessAccount(1002, "maria", 0.0, 500.0);

        // // UPCASTING
        // Account ac1 = bacc;

        // Account ac2 = new BuisnessAccount(1003, "bob", 0.0, 200.0);
        // Account ac3 = new BuisnessAccount(1004, "ANNA", 0.0, 0.01);

        // // DOWCASTNG

        // BuisnessAccount ac4 = (BuisnessAccount) ac2;
        // ac4.loan(100.0);

        // // BuisnessAccount ac5 = (BuisnessAccount) ac3;
        // if (ac3 instanceof BuisnessAccount) {
        // BuisnessAccount ac5 = (BuisnessAccount) ac3;
        // ac5.loan(200.0);
        // System.out.println("Loan!");
        // }

        // if (ac3 instanceof SavingAccount) {
        // SavingAccount ac5 = (SavingAccount) ac3;
        // ac5.updateBalance();
        // System.out.println("Update!");
        // }

        // Account acc1 = new Account(1001, "alex", 1000.0);
        // acc1.withdraw(200.0);
        // System.out.println(acc1.getBalance());

        // Account acc2 = new SavingAccount(1002, "maria", 1000.0, 0.01);
        // acc2.withdraw(200.0);
        // System.out.println(acc2.getBalance());

        // Account acc3 = new BuisnessAccount(1003, "bob", 1000.0, 500.0);
        // acc1.withdraw(200.0);
        // System.out.println(acc3.getBalance());

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(0.01, 1001, "Alex", 500.0));
        list.add(new BuisnessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingAccount(0.01, 1004, "Bob", 300.0));
        list.add(new BuisnessAccount(1005, "Anna", 500.0, 500.0));

        double soma = 0.0;
        for (Account acc : list) {
            soma += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", soma);
        for (Account acc : list) {
           acc.deposit(10.0);
        }
        for (Account acc : list) {
           System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
