package c16.sec2;

import c16.sec2.Button;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOK = new Button();

        btnOK.setClickListener( () -> {

            System.out.println("Ok 버튼을 클릭했습니다");

        });

        btnOK.click();
        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> System.out.println("취소 버튼을 클릭했습니다"));

        btnCancel.click();

    }
}
