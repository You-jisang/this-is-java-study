package c06;

public class c06_CarExample {
    public static void main(String[] args) {
        c06_Car car1 = new c06_Car();
        System.out.println(car1.company);
        System.out.println();

        c06_Car car2 = new c06_Car("페라리");
        System.out.println(car2.model);
        System.out.println();

        c06_Car car3 = new c06_Car("람보르기니", "빨간색");
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        c06_Car car4 = new c06_Car("f1", "파란색", 410);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();







    }
}
