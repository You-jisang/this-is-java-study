package c04;

public class c04_SwitchExpressonExample {
    public static void main (String[] args) {
        char grade = 'B';
        // break 생략가능 문법

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원 입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원 입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원 입니다.");
            case 'B', 'b' -> System.out.println("일반 회원 입니다.");
            default -> System.out.println("손님입니다."); //중괄호 안에 실행문이 하나만 있을경우 중괄호 생략 가능
        }
    }
}
