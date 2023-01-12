package c06;

public class c06_CalculatorExample {
    public static void main(String[] args) {
        c06_Calculator cal = new c06_Calculator();

        cal.powerOn();
        int result1 = cal.plus(5,6);
        System.out.println(result1);

        int x = 10;
        int y =4;

        double result2 = cal.divide(x, y);
        System.out.println(result2);

        cal.powerOff();
    }
}
