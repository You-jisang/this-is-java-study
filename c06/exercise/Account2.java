package c06.exercise;

public class Account2 {
    private String num;
    private String name;
    private int balance;
    public Account2(String num, String name, int balance) {
        this.num = num;
        this.name = name;
        this.balance = balance;
    }

    public String getNum(){return num;}
    public String getName(){return name;}
    public int getBalance(){return balance;}

    public void setNum(String num){
        this.num = num;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
