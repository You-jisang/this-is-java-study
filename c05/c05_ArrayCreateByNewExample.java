package c05;

public class c05_ArrayCreateByNewExample {
    public static void main(String[] args) {

        int[] arr1 = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        arr1[0] = 10;
        arr1[1] = 30;
        arr1[2] = 20;
        for(int i = 0; i < 3; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();


    }
}
