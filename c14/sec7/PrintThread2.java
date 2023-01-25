package c14.sec7;

public class PrintThread2 extends Thread {

    public void run() {
        /*try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);

            }

        }catch (InterruptedException e) {
        }*/
        while (true) {
            System.out.println("실행 중");
            if (Thread.interrupted()) {
                break;
            }
        }

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
