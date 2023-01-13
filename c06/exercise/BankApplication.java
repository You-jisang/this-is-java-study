package c06.exercise;

import java.util.Scanner;

public class BankApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Account2[] account2 = new Account2[100];
    public static void main(String[] args) {

        boolean x= true;
        while (x) {
            System.out.println("----------------------------------------");
            System.out.println("1.계좌 생성|2.계좌목록|3.예금|4.출금|5.종료|");
            System.out.println("----------------------------------------");
            System.out.print("선택>");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String num =  scanner.nextLine();
                    System.out.print("계좌주: ");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    Account2 newAccount = new Account2(num, name, balance);

                    for (int i = 0; i < account2.length; i++){
                        if(account2[i] == null) {
                            account2[i] = newAccount;
                            break;
                        }
                    }
                    break;
                case "2" :
                    System.out.println("---------");
                    System.out.println("계좌목록");
                    System.out.println("---------");

                    for(int i = 0; i < account2.length; i++) {
                        if(account2[i] == null) break;
                        Account2 account = account2[i];
                        System.out.print(account.getNum());
                        System.out.print("   ");
                        System.out.print(account.getName());
                        System.out.print("   ");
                        System.out.print(account.getBalance());
                        System.out.println();
                    }
                    break;
                case "3" :
                    System.out.println("---------");
                    System.out.println("예금");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String num1 = scanner.nextLine();
                    System.out.print("예금액: ");
                    int add = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < account2.length; i++){
                        if(account2[i].getNum().equals(num1)) {
                            account2[i].setBalance(account2[i].getBalance() + add);
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("---------");
                    System.out.println("출금");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String num2 = scanner.nextLine();
                    System.out.print("출금액: ");
                    int minus = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i <account2.length; i++) {
                        if(account2[i].getNum().equals(num2)) {
                            if(account2[i].getBalance() - minus > 0) {
                                account2[i].setBalance(account2[i].getBalance() - minus);
                                break;
                            } else {
                                System.out.println("잔액이 부족합니다.");
                                break;
                            }
                        }
                    }
                    break;
                case "5" :
                    x = false;
                    break;

            }
        }
        System.out.println("프로그램 종료");
    }
}
