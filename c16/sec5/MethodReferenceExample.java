package c16.sec5;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((Computer::staticMethod));

        Computer computer = new Computer();

        person.action(computer :: instanceMethod);
    }
}
