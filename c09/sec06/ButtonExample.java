package c09.sec06;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOK = new Button();

        btnOK.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다");
            }
        });


        btnOK.click();
    }
}
