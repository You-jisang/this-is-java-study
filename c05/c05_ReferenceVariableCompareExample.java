package c05;

public class c05_ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] { 1, 2, 3};
        arr2 = new int[] { 1, 2, 3}; //배열안에 있는 데이터는 같아도 번지가 다르다
        arr3 = arr2;

        System.out.println(arr1 == arr2);

        System.out.println(arr2 == arr3);
    }
}
