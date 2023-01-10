package c04;

public class c04_IfNestedExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81;

        System.out.println("점수: " + score);

        if (score >=90) {
            if(score >=95) {
                System.out.println("등급은 A+입니다");
            } else {
                System.out.println("등급은 A입니다");
            }
        }else {
            if(score >= 85) {
                System.out.println("등급은 B+입니다");
            } else {
                System.out.println("등급은 B입니다");
            }
        }
    }
}
