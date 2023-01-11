package c05;

public class c05_MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("1차원 배열 길이: " + scores.length);
        System.out.println("2차원 배열 길이: " + scores[0].length);
        System.out.println("2차원 배열 길이: " + scores[1].length);

        int class1Sum = 0;
        for(int score : scores[0]){
            class1Sum += score;
        }
        int class2Sum = 0;
        for(int score : scores[1]){
            class2Sum += score;
        }
        int totalSum = 0;


        System.out.println((double) class1Sum / 3);
        System.out.println((double) class2Sum /2);



    }
}
