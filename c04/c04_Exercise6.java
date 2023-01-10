package c04;

public class c04_Exercise6 {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (i == j) {
                    if (j == 5) break; // 마지막은 줄바꿈 X
                    System.out.println();
                }
            }
        }
    }
}
