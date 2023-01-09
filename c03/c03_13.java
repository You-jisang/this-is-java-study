package c03;

public class c03_13 {
    //삼항 연산자
    public static void main(String[] args) {
        int score = 70;
        char grade = ((score > 90) ? 'A': (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");

    }
}
