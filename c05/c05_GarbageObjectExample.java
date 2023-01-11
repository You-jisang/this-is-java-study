package c05;

public class c05_GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행"; // 객체 쓰레기
        hobby = null;

        String kind1 = "자동차"; //객체 쓰레기 아님
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 : " + kind2);
    }
}
