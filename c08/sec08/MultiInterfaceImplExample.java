package c08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();

        Searchable sr = new SmartTelevision();
        sr.search("https://www.youtube.com");

        rc.turnOff();
    }
}
