package c05;

public class c05_exercise8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int students = 0;

        for (int i = 0; i < array.length; i++) {
            for(int score : array[i]) {
                sum += score;
                students++;
            }
        }
        double avg = (double) sum / students;
        System.out.println("전체 합: " + sum + ", 평균: " + avg);
    }
}
