package c15;

import c13.sec5.Person;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<c15_Person> treeSet = new TreeSet<c15_Person>();

        treeSet.add(new c15_Person("홍길동", 45));
        treeSet.add(new c15_Person("감자바", 25));
        treeSet.add(new c15_Person("박지원", 31));

        for(c15_Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
