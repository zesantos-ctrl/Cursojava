package herença.entities;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(double interestRate, Integer number, String holder, double balance) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        // Soma ao saldo os juros (saldo * taxa de juros)
        balance += balance * interestRate;
    }

    @Override 
    public void withdraw(double amount) {
        balance -= amount;
    }
}
