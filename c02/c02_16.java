package c02;

public class c02_16 {
    public static void main(String[] args) {
        //문자열을 기본타입으로 변환 String.valueof 기억하기 정수,실수형을 문자열로 변환함
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 :" + value1); // 문자열 10이 정수형 10으로 출력
        System.out.println("value2 :" + value2);
        System.out.println("value3 :" + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1); // 정수형 10이 문자열 10으로 출력
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
