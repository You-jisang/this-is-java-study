package c07.sec09;

public class Student extends Person{
    public int studentNo;
    public Student(String name, int studntNo) {
        super(name);
        this.studentNo = studntNo;
    }

    public void study(){
        System.out.println("공부를 합니다.");
    }
}
