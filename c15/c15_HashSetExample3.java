package c15;

import java.util.*;
public class c15_HashSetExample3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("jsp")) {
                iterator.remove();
            }

        }

        System.out.println();

        set.remove("jdbc");

        for (String element : set) {
            System.out.println(element);

        }
    }
}
