package c06;

public class c06_ComputerExample {
    public static void main(String[] args) {
        c06_Computer com = new c06_Computer();

        int result1 = com.sum(1,2,3);
        System.out.println(result1);

        int result2 = com.sum(new int[] {1,2,3,4,5,6});
        System.out.println(result2);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = com.sum(values);
        System.out.println(result3);
    }
}
