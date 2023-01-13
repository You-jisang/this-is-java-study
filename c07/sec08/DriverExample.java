package c07.sec08;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Texi texi = new Texi();
        driver.drive((texi));
    }
}
