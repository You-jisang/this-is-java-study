package c13;

public class Container<K>{
    private K kind;

    public K get() {
        return kind;
    }

    public void set(K kind) {
        this.kind = kind;
    }
}
