package c04;

public class c04_BreakOutterExample {
    public static void main(String[] args) throws Exception{
        Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;
                }
            }
        }

        System.out.println("exit");
    }
}
