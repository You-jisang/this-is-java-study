package c02;

public class c02_6 {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        /* long var3 = 1000000000000; 컴파일러는 int로 간주하여 에러 발생*/
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        //System.out.println(var3);
        System.out.println(var4);
    }
}
