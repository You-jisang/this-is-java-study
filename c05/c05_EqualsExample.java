package c05;

public class c05_EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        System.out.println(strVar1 == strVar2); // 참조가 같은 지 확인
        System.out.println(strVar1.equals(strVar2)); // 문자열이 같은 지 확인

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar3 == strVar4);
        System.out.println(strVar3.equals(strVar4));


    }

}
