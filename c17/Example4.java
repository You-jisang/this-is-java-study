package c17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Example4 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                        .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[개발자]");
        List<Member> proList = groupingMap.get("개발자");
        proList.forEach(System.out::println);



        System.out.println();

        System.out.println("[디자이너]");
        List<Member> diList = groupingMap.get("디자이너");
        diList.forEach(System.out::println);

    }
}