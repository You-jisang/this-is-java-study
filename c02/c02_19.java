package c02;

import java.util.Scanner;
public class c02_19 {
    //키보드 입력 데이터를 변수에 저장
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 갑 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();

        }
        System.out.println(strX+strY);
        System.out.println("종료");

    }
}
