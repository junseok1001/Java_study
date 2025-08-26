package loop.test;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //문제 1
//        System.out.print(" 수를 입력하세요 : ");
//        int num = scan.nextInt();
//        int count = 0;
//        for(int i = 1; i <= num; i ++){
//            count = count + i;
//        }
//        System.out.println("합 : " + count);


        //문제2
        //숫자를 입력 받고 어디다가 저장해?
//        int total = 0;
//        double average = 0;
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i + "번째 수를 입력하세요 : ");
//            int num1 = scan.nextInt();
//            total = total + num1;
//            average = (double)total / i;
//        }
//
//        System.out.println("총합 : " + total + " 평균 : " + average);

        //문제3
//        System.out.print("수를 입력하세요 : ");
//        int num1 = scan.nextInt();
//        int factor = num1;
//        for(int i = 1; i < num1; i++){
//            factor = factor * i;
//        }
//        System.out.println(num1 + "!" + " = " + factor);


        //문제4
//        int min = 0;
//        int num1 = 0;
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i + "번째 수를 입력하세요 : ");
//            num1 = scan.nextInt();
//            if(min >= num1){
//                min = num1;
//            }
//
//        }
//        System.out.println("최소값은" + min +"입니다.");

        //문제5
        System.out.print("수를 입력하세요 : ");
        int num1 = scan.nextInt();
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();



    }
}
