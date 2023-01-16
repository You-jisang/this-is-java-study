package c08.sec09;

public class InterfaceCImpl implements InterfaceC{

    @Override
    public void methodA() {
        System.out.println("인터페이스 메소드에이 실행");
    }
    @Override
    public void methodB() {
        System.out.println("인터페이스 메소드비 실행");
    }
    @Override
    public void methodC() {
        System.out.println("인터페이스 메소드씨 실행");
    }
}
