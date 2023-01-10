package c15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class c15_HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();

        map.put("유지상", 85);
        map.put("홍길동", 90);
        map.put("고윤정", 85);
        map.put("홍길동", 95);
        System.out.println("총 entry 수: " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String>keySet = map.keySet();
        Iterator<String>keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+":" + v);
        }
        System.out.println();

        Set<Entry<String, Integer>>entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k +":" + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 entry 수 : " + map.size());
        System.out.println();

    }
}
