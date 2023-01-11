package c05;

public class c05_ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }

        season[1] = "여름";
        System.out.println(season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);
        double avg = (double) sum/3;
        System.out.println(avg);
    }
}

