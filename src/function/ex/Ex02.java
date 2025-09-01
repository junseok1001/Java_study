package function.ex;

public class Ex02 {

    public static void main(String[] args) {

        int price = getCandyPrice(5);

        System.out.println("가격 : " + price);

        int number1 = 20;
        int number2 = 40;

        System.out.println("두수의 합은 : " + addNumbers(number1, number2));

        //1 ~ 10 까지 합을 구하기
        //printAddNumbers(20);

        System.out.println(AddNumbersAll(10));

        int result = AddNumbersAll(10);
        System.out.println(" 종합 : " + result);
        System.out.println(result / 2);

    }

    //1부터 전달받은 값까지의 합을 리턴하는 기능
    public static int AddNumbersAll(int number){

        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum +=  i;
        }

        return sum;
    }
//    //1부터 10까지의 합을 출력하는 기능
//    public static void printAddNumbers(){
//        //1 ~ 10 까지 합을 구하기
//        int sum = 0;
//        for(int i = 1; i <= 10; i++){
//            sum +=  i;
//        }
//
//        System.out.println("합 : " + sum);
//    }

    // 두개의 수를 더하는 기능
    public static int addNumbers(int number1, int number2){
        int result = number1 + number2;

        return result;

    }

    // 개수에 따른 츄파춥스 가격을 계산하는 기능
    public static int getCandyPrice(int count){
        int result = 250 * count;

        return result;
    }
}
