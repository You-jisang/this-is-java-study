package c05;

public class c05_SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String fistNum = ssn.substring(0,6);
        String secondNum = ssn.substring(7);

        System.out.println(fistNum);
        System.out.println(secondNum);

    }
}
