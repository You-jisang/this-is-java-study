package c03;

public class c03_06 {
    // 나눗셈 연산후 Infinity 와 NaN 처리
    public static void main(String[] args) {
        int x =5;
        double y = 0.0;
        double z =  x / y;

        System.out.println(z + 2);

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z+2);
        }
    }
}
