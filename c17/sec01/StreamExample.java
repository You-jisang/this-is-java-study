package c17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("김자바");
        set.add("짱구");

        //Stream을 이용한 요소 반복처리
        Stream<String> stream = set.stream(); //스트림 얻기
        stream.forEach( name -> System.out.println(name)); //람다식 : 요소 처리 방법
    }
}
