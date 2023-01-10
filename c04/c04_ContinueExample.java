package c04;

public class c04_ContinueExample {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i<=10; i++){
            if (i%2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
