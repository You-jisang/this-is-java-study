package c06;

public class c06_CalculatorExample2 {
    public static void main(String[] args) {
        double result1 = 10 * 10 * c06_Calculator2.pi;
        int result2 = c06_Calculator2.plus(10,5);
        int result3 = c06_Calculator2.minus(10,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
