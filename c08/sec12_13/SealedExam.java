package c08.sec12_13;

public class SealedExam {
    public static void main(String[] args) {
        ImplClass implClass = new ImplClass();

        InterfaceA ina = implClass;
        ina.methodA();

        InterfaceB inb = implClass;
        inb.methodA();
        inb.methodB();

        InterfaceC inc  = implClass;
        inc.methodA();
        inc.methodB();
        inc.methodC();
    }
}
