package loop.test;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
//        1. 반복 출력
//        수를 입력받아서 그 수만큼 "응 아니야"를 출력하세요.
//        입력 예시
//
//        횟수를 입력하세요 : 5
//        출력 예시
//
//        응 아니야
//        응 아니야
//        응 아니야
//        응 아니야
//        응 아니야

//        System.out.print("횟수를 입력하세요 : ");
//        int count = scan.nextInt();
//        int i = 0;
//        while(i < count ){
//            System.out.println("응 아니야");
//            i++;
//        }
//


//        2. 카운트 다운 "발사"
//        수를 입력받고 그 수에서부터 0까지 한 줄씩 카운트 다운을 출력하고, 마지막에 "발사"를 출력하세요.
//        입력 예시
//
//        카운트 다운 입력하세요 : 3
//        출력 예시
//
//        3
//        2
//        1
//        0
//        발사
//        System.out.print("카운트 다운 입력하세요 : ");
//        int i = scan.nextInt();
//        while (i > 0){
//            System.out.println(i);
//            i--;
//        }
//        System.out.println("발사");

//        3. 짝수 합 구하기
//        수를 입력받고 1에서부터 입력한 수까지의 짝수의 합을 구하여 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 12
//        출력 예시
//
//        더한 결과 : 42

//        System.out.print("수를 입력하세요 : ");
//        int i = scan.nextInt();
//        int sum = 0;
//        while(i > 0){ // 내가 고른 숫자부터 0까지 나열하기
//            if(i % 2 == 0){ // 짝수 판별하기 고르기
//                sum = sum + i; // 고른후 그 수에 더하기
//            }
//            i--;
//
//        }
//
//        System.out.println(sum);
//        4. 구구단
//        구구단 2단을 출력하세요.
        //변하는건 2 옆에 숫자들
//        int i = 1;
//        while(i <= 9){
//            System.out.println("2 X "+ i + " = " + (2*i));
//            i++;
//        }

//        5. 반복 입력
//        while을 이용하여 5번 동안 수를 입력받고 출력하세요.

        int i = 0;
        while(i < 5){
            System.out.print("입력 : ");
            int input = scan.nextInt();
            System.out.println("출력 : " + input);
            i++;
        }








    }
}
