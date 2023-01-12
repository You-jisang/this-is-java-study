package c06;

public class c06_Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    c06_Car(){
        System.out.println("1");
    }
    c06_Car(String model) {
        System.out.println("2");
        this.model = model;
    }
    c06_Car(String model, String color) {
        System.out.println("3");
        this.model = model;
        this.color = color;
    }
    c06_Car(String model, String color, int maxSpeed) {
        System.out.println("4");

        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

