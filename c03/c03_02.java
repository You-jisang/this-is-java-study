package c03;

public class c03_02 {
    //부호 증감 연산자2
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("-------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("-------------------");
        z = x++; //x가 z에 대입되고 1이 증가해서 출력되는 두 변수의 값이 다름
        System.out.println("z=" + z);
        System.out.println("x=" + x);

    }
}
