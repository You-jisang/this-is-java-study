package c03;

public class c03_05 {
    //정확한 계산은 정수 연산으로
    public static void main(String[] args) {
        int apple = 1;
        //double pieceUnit = 0.1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: "+ result);
        System.out.println("사과 1개에서 남은 양: "+ result/10.0);

        //double result = apple - number*pieceUnit;
        //System.out.println("사과 1개에서 남은 양: " + result);


    }
}
