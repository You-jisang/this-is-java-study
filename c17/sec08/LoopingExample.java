package c17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        //잘못작성한경우
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println);

        int total = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println)
                .sum();
        System.out.println(total);

        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .forEach(System.out::println);

    }
}
