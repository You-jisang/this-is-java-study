package c03;

public class c03_09 {
    //비트 논리 연산자
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25)); //45 = 101101 , 25 = 011001
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25)); //XOR연산
        System.out.println("~45 = " + (~45));
        System.out.println("-------------------------");

        byte receiveData = -128;

        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);


    }
}
