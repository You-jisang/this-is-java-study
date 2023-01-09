package c03;

public class c03_01 {
    //부호 증감 연산자
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println(("x: " + x));

        byte b = 100;
        int y = -b;
        System.out.println("y: "+ y);
    }
}
