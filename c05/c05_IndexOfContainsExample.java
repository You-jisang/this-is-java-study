package c05;

public class c05_IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("32");
        System.out.println(location);

        boolean result = subject.contains("32");
        System.out.println(result);


    }
}
