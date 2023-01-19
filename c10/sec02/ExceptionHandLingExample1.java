package c10.sec02;

import javax.swing.*;

public class ExceptionHandLingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("마무리실행");
        }


    }

    public static void main(String[] args) {
        System.out.println("프로그램시작");
        printLength("Thisisjavaprogram");
        printLength(null);
        System.out.println("프로그램종료");
    }
}
