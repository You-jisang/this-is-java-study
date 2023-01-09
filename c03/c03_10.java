package c03;

public class c03_10 {
    //비트 이동 연산자
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; // 정수 num1의 각 비트를 3만큼 왼쪽으로 이동, 오른쪽 빈자리는 0으로 채움
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3; // 정수 num2의 각 비트를 3만큼 오른쪽으로 이동. 왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움
        int result4 = num2 / (int) Math.pow(2,3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);

    }
}
