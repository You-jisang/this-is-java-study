package c08.sec02_03;

public class Audio implements RemoteControl{
    @Override
    public void turnOn(){
        System.out.println("audio를 킵니다");
    }
}
