package c04;

import java.util.Scanner;

public class c04_Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int money = 0;

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택>");

            inputString = scanner.nextLine();

            switch (inputString) {
                case "1":
                    System.out.print("예금액>");
                    money +=  Integer.parseInt(scanner.nextLine());
                    break;
                case "2":
                    System.out.print("출금액>");
                    money -=  Integer.parseInt(scanner.nextLine());
                    break;
                case "3":
                    System.out.print("잔고>" + money);
                    System.out.println();
                    break;
                case "4":
                    System.out.println();
                    System.out.print("프로그램 종료");
                    break;
                default:
                    System.out.println("1~4사이의 숫자를 입력해주세요.");
            }

            if (inputString.equals("4")) break;
        }
    }
}
