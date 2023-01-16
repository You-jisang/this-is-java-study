package c08.sec12_13;

public class ImplClass implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("메소드 에이 실행");
    }
    @Override
    public void methodB() {
        System.out.println("메소드 비 실행");
    }
    @Override
    public void methodC() {
        System.out.println("메소드 씨 실행");
    }
}
