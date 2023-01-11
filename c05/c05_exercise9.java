package c05;

import java.util.Scanner;

public class c05_exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString;
        int students = 0;
        int[] scores = null;

        boolean x = true;

        while (x){
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택>");


            inputString = scanner.nextLine();


            switch (inputString) {
                case "1":
                    System.out.print("학생수> ");
                    students = Integer.parseInt(scanner.nextLine());
                    scores = new int[students];
                    break;
                case "2":
                    for(int i = 0; i < scores.length ; i++) {
                        System.out.printf("scores[%d]>", i);
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case "3":
                    for(int i = 0; i < scores.length ; i++) {
                        System.out.printf("scores[%d]>", i);
                        System.out.println(scores[i]);
                    }
                    break;
                case "4":
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }

                        sum += scores[i];
                    }
                    double avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                default:
                    x = false;
                    System.out.print("프로그램 종료");
            }
        }
    }
}
