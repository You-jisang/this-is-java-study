package c05;

public class c05_MultidimensionalArrayByNewListExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for(int j= 0; j< mathScores[i].length;j++) {
                System.out.println(mathScores[i][j]);
            }
        }

        int[][] english = new int[2][];
        english[0] = new int[2];
        english[1] = new int[3];

        for (int i = 0; i < english.length; i++) {
            for(int j= 0; j< english[i].length;j++) {
                System.out.println(english[i][j]);
            }
        }

    }
}
