package c16.sec5;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.ordering(String::compareToIgnoreCase);
    }
}
