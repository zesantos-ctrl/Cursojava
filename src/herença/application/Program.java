package herença.application;

import herença.entities.Account;
import herença.entities.BuisnessAccount;
import herença.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {

        Account ac = new Account(1001, "alex", 0.0);

        BuisnessAccount bacc = new BuisnessAccount(1002, "maria", 0.0, 500.0);

        // UPCASTING
        Account ac1 = bacc;

        Account ac2 = new BuisnessAccount(1003, "bob", 0.0, 200.0);
        Account ac3 = new BuisnessAccount(1004, "ANNA", 0.0, 0.01);

        // DOWCASTNG

        BuisnessAccount ac4 = (BuisnessAccount) ac2;
        ac4.loan(100.0);

        // BuisnessAccount ac5 = (BuisnessAccount) ac3;
        if (ac3 instanceof BuisnessAccount) {
            BuisnessAccount ac5 = (BuisnessAccount) ac3;
            ac5.loan(200.0);
            System.out.println("Loan!");
        }

        if (ac3 instanceof SavingAccount) {
            SavingAccount ac5 = (SavingAccount) ac3;
            ac5.updateBalance();
            System.out.println("Update!");
        }

        Account acc1 = new Account(1001, "alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BuisnessAccount(1003, "bob", 1000.0, 500.0);
        acc1.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
