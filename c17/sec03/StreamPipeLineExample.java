package c17.sec03;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("짱구", 20),
                new Student("유리", 30)
        );
        /*
        Stream<Student> studentStream = list.stream();
        //중간 처리(학생 객체르 점수로 매핑)
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

        //최종 처리
        double avg = scoreStream.average().getAsDouble();
        */
        double avg = list.stream()
                        .mapToInt(Student::getScore)
                        .average()
                                .getAsDouble();



        System.out.println(avg);
    }


}
