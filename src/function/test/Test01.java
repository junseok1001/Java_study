package function.test;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Test01 {
    //함수 연습문제
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //연습문제 1
//        System.out.print("제곱값을 구할 숫자를 입력하세요 :");
//        int num = scan.nextInt();
//
//        int result = getSquared(num);
//        System.out.println(num + "의 제곱근은 " + result + "이다.");

        //연습문제 2
//        System.out.print("점수를 입력하세요 : ");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int num4 = scan.nextInt();
//
//        double result = getAverage(num1, num2, num3, num4);
//
//        System.out.println("평균은 " + result);

        //연습문제 3
//        System.out.print("숫자와 나눌 수를 입력하세요:");
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//
//
//        PrintQuotienRemainder(number1, number2);

        //홀짝 함수
        System.out.print("숫자를 입력하세요 :");
        int number1 = scan.nextInt();

        getsniffling(number1);


    }
    //제곱근 구하기 함수
    public static int getSquared(int num){

        int result = num * num;

        return result;
    }
    //평균 구하기 함수
    public static double getAverage(int num1, int num2, int num3, int num4){

        double result = (num1 + num2 + num3 + num4) / 4.0;

        return result;
    }

    //몫과 나머지 출력 함수
    public static void PrintQuotienRemainder(int num1, int num2){

        System.out.println("몫 : " + num1 / num2);
        System.out.println("나머지 :" + num1 % num2);

    }

    public static int getsniffling(int num1){


        if(num1 % 2 == 0){
            System.out.println(0);
            return 0;
        }else {
            System.out.println(1);
            return 1;
        }


    }
}
