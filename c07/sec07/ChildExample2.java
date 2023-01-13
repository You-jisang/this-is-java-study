package c07.sec07;

public class ChildExample2 {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data";
        parent.method1();
        parent.method2();

        //parent.field2 = "1";
        //parent.method3();

        Child child = (Child) parent;
        child.field2 = "1";
        child.method3();
    }
}
