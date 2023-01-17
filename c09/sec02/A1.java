package c09.sec02;

public class A1 {
    class B {
        int field = 1;
        //정적 필드 자바 17부터 허용
        static int field2 = 2;

        B() {
            System.out.println("B 생성자 실행");
        }

        void method1() {
            System.out.println("B 메소드1 실행");
        }
        //정적 메소드 자바 17부터 허용
        static void method2() {
            System.out.println("B 메소드2 실행");
        }

    }

    void useB() {
        B b = new B();
        System.out.println(b.field);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
