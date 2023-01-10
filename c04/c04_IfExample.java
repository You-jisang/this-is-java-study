package c04;

public class c04_IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B등급입니다."); // 실행되지 않는게 의도 였는데 중괄호가 없기 때문에 실행됨 중괄호를 하는 습관가지기!
    }
}
