package c06.exercise;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int money) {
        if(money >= MIN_BALANCE && money <= MAX_BALANCE) {
            balance = money;

        }
    }
}
