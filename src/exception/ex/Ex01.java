package exception.ex;

public class Ex01 {
    public static void main(String[] args) {

        String text = "Hello";

        // 뭔가 뭔가 수행
        if(text !=null){
            text.length();
        }

        int[] number = new int[5];

        try{

            //예외 상황이 발생될 수 있는 코드가 작성
            text.length();  // try 안에 코드에서 하나라도 걸리면 거기서 멈추고 코드가 종료가 된다.

            System.out.println(number[5]);

        }catch(NullPointerException e){

            System.out.println("null 인 변수로 매서드 호출 했구만.");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index 범위가 넘었구만");
            System.out.println(e);

        }

        //일정시간 동안 프로그램을 멈춘다.
        // millisecond (기본단위) 1 / 1000
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("sleep 실패!");
        }

        try {
            printNumber(13);
        } catch (Exception e) {
            System.out.println("잘못된 밤위의 값");
        }

        System.out.println("끝");

    }


    // 1과 10 사이의 수를 하나 전달 받고 출력하는 기능
    public static void printNumber(int number) throws Exception{

        //1과 10사이의 수가 아니면 exception 발생
        if(number < 1 || number > 10){
            throw new Exception();
        }

        System.out.println(number);
    }


}
