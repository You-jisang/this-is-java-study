package c04;

public class c04_BreakExample {
    public static void main(String[] args) throws Exception {
        int count = 0;
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);

            count++;

            if (num == 6) {
                System.out.println("6번 당첨 ~~");
                break;
            }
        }
        System.out.println("총 굴린 횟수: " + count);
    }
}
