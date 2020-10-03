package hw9;

public class AccountApp {
    public static void main(String[] args) {
        Account checking = new Account();
        checking.number = "145 874 8473";
        checking.balance = 17281;

        checking.addMoney(2000);

        System.out.println(checking.balance);
    }
}
