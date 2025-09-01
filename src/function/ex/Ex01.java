package function.ex;

public class Ex01 {

    public static void main(String[] args) {

        //반올림

        double number = 3.65;

        // 사용법
        //  인자 : argument
        // 값을 돌려주는 기능 : return
        // return값의 type 을 잘 맞추기
        long result = Math.round(number);

        //System.out.println(); -> return이 없는 함수 들도 있음
        System.out.println(result);
        System.out.println(Math.round(19.7));

        //큰값 구하기
        int number1 = 100;
        int number2 = 200;


        System.out.println(Math.max(number1, number2));

        double sqrt= Math.sqrt(81);
        System.out.println(sqrt);

    }
}
