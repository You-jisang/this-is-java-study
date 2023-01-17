package c09.sec06;

import c08.sec10.B;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOK = new Button();

        btnOK.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        });
        /*
        //Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        }
        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOK.setClickListener(new OkListener());
        */

        //Ok 버튼 클릭하기
        btnOK.click();
    }
}
