package c03;

public class c03_07 {
    //비교 연산자
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);

        String str1 = "자바";
        String str2 = "Java"; //문자열에는 .equals사용
        boolean result6 = (str1.equals(str2));
        boolean result7 = (!str1.equals(str2));
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);



    }
}
