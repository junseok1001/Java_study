package loop.test;

import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();


        //  소수 판별 문제
        // 면접 문제
        Scanner scan = new Scanner(System.in);
        System.out.print("수 를 입력하세요 : ");
        int number = scan.nextInt();
        boolean isPrimeNumber = true ;

        for( int i = 2; i < Math.sqrt(number); i ++){
            if(number % i == 0){
                isPrimeNumber = false;
                System.out.println(" 소수가 아닙니다");
                break;
            }
        }
        //한번도 if에 들어간적 없는지
        if(isPrimeNumber){
            System.out.println(" 소수 입니다.");
        }
    }
}
