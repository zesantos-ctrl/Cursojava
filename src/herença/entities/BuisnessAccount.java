package herença.entities;

public class BuisnessAccount extends Account {
    private double loanlimit;

    public BuisnessAccount() {
        super();
    }

    public BuisnessAccount(Integer number, String holder, double balance, double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amount) {
        if (amount <= loanlimit) {
            balance += amount - 10.0;
        }
    }
}
