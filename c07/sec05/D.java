package c07.sec05;

import c07.sec06.A;

public class D extends A {
    public D() {
        super();
    }
    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
        //A a = new A();
        //a.field = "value";
        //a.method();
    }
}
