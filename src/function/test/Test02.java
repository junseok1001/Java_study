package function.test;

import java.util.Scanner;

public class Test02 {
    //함수 만들기 응용
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1. 합 구하기
//        수를 입력받아서 1에서부터 그 수까지의 합을 구하는 함수를 만드세요.
//                단, 합이 100이 넘으면 합을 중단하고 그때까지의 합을 리턴하세요.
//                입력 예시
//        System.out.print("수를 입력하세요 : ");
//        int number = scan.nextInt();
//
//        System.out.println(getTotalSum(number));


//        2. 소수(prime) 판별
//        소수: 1과 자기 자신 이외에 나누어 떨어지지 않는 수이다.
//
//        수를 입력받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//        소수이면 true, 소수가 아니면 false를 리턴하세요.
//                단, 입력하는 수는 2 이상이어야 합니다.
        System.out.print("수를 입력하세요 : ");
        int num = scan.nextInt();

        System.out.println(primeNumber(num));




    }


    public static int getTotalSum(int num){

        int box = 0;
        for(int i = 1; i <= num; i++){
            box +=i;
            if(box > 100){
                break;
            }

        }

        return box;


    }

    public static boolean primeNumber(int num) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }

        }

        return isPrimeNumber;
    }


}
