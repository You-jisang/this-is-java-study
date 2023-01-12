package c06;

public class c06_CalExample {
    public static void main(String[] args) {
        c06_Cal cal = new c06_Cal();

        double result1 = cal.areaRectangle(4);
        double result2 = cal.areaRectangle(5, 4);

        System.out.println(result1);
        System.out.println(result2);
    }
}
