package c06;

public class Car2 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static  void simulate() {
        Car2 myCar = new Car2();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();
        Car2 myCar = new Car2();

        myCar.speed = 60;
        myCar.run();
    }
}
