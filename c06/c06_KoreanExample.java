package c06;

public class c06_KoreanExample {
    public static void main(String[] args) {
        c06_Korean k1 = new c06_Korean("박자바", "011-123");
        c06_Korean k2 = new c06_Korean("김자바", "321-114");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);

    }
}
