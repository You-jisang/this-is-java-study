package c06;

public class c06_KoreanExample2 {
    public static void main(String[] args) {
        c06_Korean2 k1 = new c06_Korean2("1234", "싱짱구");


        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println(k1.nation);

        k1.name = "김자바";
        System.out.println(k1.name);
    }
}
