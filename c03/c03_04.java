package c03;

public class c03_04 {
    //오버플로우 언더플로우 이해
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: "+ var1);
        }

        System.out.println("--------------------");

        byte var2 = -125;
        for(int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2: "+ var2);
        }
    }
}
