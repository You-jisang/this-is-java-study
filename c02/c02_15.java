package c02;

public class c02_15 {
    public static void main(String[] args) {
        //연산식에서 자동 타입 변환2
        String result1 = 10 + 2 +"8"; //결합연산 +는 앞에서 부터 차례차례 연산
        String result2 = 10 + "2" +8;
        String result3 = "10" + 2 +8;
        String result4 = "10" + (2 + 8);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
