package loop.test;

import java.util.Scanner;

public class Test02 {
//고급문제 풀기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1
//        for(char i = 'A'; i <= 'Z'; i++){
//            System.out.println(i + " ");
//        }
//        System.out.println();



        //2
        //1과 자기 자신
        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();
        boolean isPrimeNumber = true;

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                isPrimeNumber = false;
                System.out.println("소수가 아니다.");
                break;
            }
            if(isPrimeNumber){
                System.out.println("소수입니다.");
            }

        }


    }
}
