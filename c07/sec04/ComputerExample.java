package c07.sec04;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Computer computer = new Computer();
        Calculator calculator = new Calculator();

        System.out.println("원 면적" + computer.areaCircle(r));
        System.out.println("원 면적" + calculator.areaCircle(r));
    }
}
