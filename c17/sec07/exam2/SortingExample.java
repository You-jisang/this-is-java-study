package c17.sec07.exam2;

import java.util.ArrayList;
import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("짱구", 20));
        studentList.add(new Student("유리", 10));

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " +s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " +s.getScore()));


    }
}
