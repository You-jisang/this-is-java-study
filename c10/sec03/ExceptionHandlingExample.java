package c10.sec03;

import java.lang.reflect.Array;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};

        for(int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
