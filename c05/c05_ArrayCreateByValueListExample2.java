package c05;

public class c05_ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;

        scores = new int[] { 83, 90, 87 };
        int sum1 = 0;
        for (int i : scores) {
            sum1 += i;
        }
        System.out.println(sum1);

        printItem(scores);
    }

    public static void printItem(int[] scores){
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
