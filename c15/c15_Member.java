package c15;

public class c15_Member {
    public String name;
    public int age;

    public c15_Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof c15_Member target ) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }

}
