package c02; //논리 타입

public class c02_9 {
    public static void main(String[] args){
        boolean stop = true;
        if(stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }

        int x = 10;
        boolean results1 = (x == 20);
        boolean results2 = (x != 20);
        System.out.println("result1 :" + results1);
        System.out.println("result2 :" + results2);
    }
}
