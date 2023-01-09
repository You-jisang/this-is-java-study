package c02;

public class c02_17 {
    //변수 사용 범위
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 -10;
        }
        int v3 = v1 + /*v2 +*/ 5; // v2는 if블록에서 선언되었기때문에 메소드 블록에서는 사용할 수 없음
    }
}
