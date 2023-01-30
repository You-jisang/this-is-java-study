package c17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("짱구");
        list.add("맹구");
        list.add("유리");
        list.add("철수");

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach( name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });
    }
}
