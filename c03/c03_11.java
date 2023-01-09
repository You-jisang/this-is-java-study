package c03;

public class c03_11 {
    //비트 이동 연산자 (>>>)
    public static void main(String[] args) {
        int value = 999;

        byte b1 = (byte) (value >>> 24);
        int int1 = b1 & 255;
        System.out.println("첫 번째 바아트 부호 없는 값 : " + int1);

        byte b2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(b2);
        System.out.println("두 번째 바아트 부호 없는 값 : " + int2);

        byte b3 = (byte) (value >>> 8);
        int int3 = b3 & 255;
        System.out.println("세 번째 바아트 부호 없는 값 : " + int3);

        byte b4 = (byte) (value);
        int int4 = Byte.toUnsignedInt(b4);
        System.out.println("네 번째 바아트 부호 없는 값 : " + int4);

    }
}
