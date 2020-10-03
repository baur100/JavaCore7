package hw9;

public class Account {
    public String number;
    public double balance;

    public double addMoney(double amount) {
        return balance += amount;
    }
}
