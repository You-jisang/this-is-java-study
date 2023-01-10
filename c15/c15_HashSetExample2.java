package c15;

import java.util.*;
public class c15_HashSetExample2 {
    public static void main(String[] args) {
        Set<c15_Member>set = new HashSet<c15_Member>();

        set.add(new c15_Member("홍길동", 30));
        set.add(new c15_Member("홍길동", 30));

        System.out.println("총 객체 수: " + set.size());
    }
}
