package c15;

import java.util.*;
public class c15_HashSetExample {
    public static void main(String[] args) {
        Set<String>set = new HashSet<String>();



        set.add(("Java"));
        set.add(("JDBC"));
        set.add(("JSP"));
        set.add(("Java")); // 중복 객체 저장 안함
        set.add(("Spring"));

        int size = set.size();
        System.out.println("총 객체 수 : " + size);
    }
}
