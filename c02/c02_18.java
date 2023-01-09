package c02;

public class c02_18 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value); // 정수형과 문자열 동일 단 문자열은 0으로 채우기 안됨
        System.out.printf("상품의 가격: %8d원\n", value);
        System.out.printf("상품의 가격: %-8d원\n", value);
        System.out.printf("상품의 가격: %08d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%12.2f\n", 10, area);
        System.out.printf("반지름이 %d인 원의 넓이:%012.2f\n", 10, area); //실수형은 12-소수점2자리-포인트1자리-314의 3자리 = 6자리 0으로 채워짐

        String name = "홍길동";
        //System.out.printf("%06s", name); 정수형과 문자열 동일 단 문자열은 0으로 채우기 안됨

    }
}
