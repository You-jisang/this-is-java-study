package c05;

public class c05_ReplaceExample {
    public static void main(String[] args) {
        String oLdStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oLdStr.replace("자바", "Java");

        System.out.println(oLdStr);
        System.out.println(newStr);
    }
}
