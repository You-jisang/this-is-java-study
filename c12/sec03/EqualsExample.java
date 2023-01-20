package c12.sec03;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("1과 2는 동등합니다");
        } else {
            System.out.println("1과 2는 동등하지 않습니다");
        }

        if (obj1.equals(obj3)) {
            System.out.println("1과 3는 동등합니다");
        } else {
            System.out.println("1과 3는 동등하지 않습니다");
        }
    }
}
