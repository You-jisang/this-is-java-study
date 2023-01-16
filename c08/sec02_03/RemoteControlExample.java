package c08.sec02_03;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();

        int max = RemoteControl.MAX_VOLUME;
        System.out.println(RemoteControl.MIN_VOLUME);

    }
}
