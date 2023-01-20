package c12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==" + (obj2 == obj1));
        System.out.println("equals:" + (obj2.equals(obj1)));
        System.out.println();

        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==" + (obj3 == obj4));
        System.out.println("equals:" + (obj3.equals(obj4)));
    }
}
