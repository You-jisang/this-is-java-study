package c04;

public class c04_FloatCounterExample {
    public static void main(String[] args) {
        for(float x =0.1f; x<= 1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
//부동소수점ㅊ을 사용하는 float타입을 사용하면 안된다.