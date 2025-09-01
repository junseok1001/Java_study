package variable.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //연습문제1
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        System.out.println("이름 : 오준석 나이 : " + age );

        //연습문제 2
        System.out.println("두수를 입력하시오");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        //연습문제 3

        System.out.println("두 수를 입력하세요");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

//        4. 구구단
//        단수를 입력받고 아래와 같이 구구단을 출력하세요.
//        입력 예시
//
//        단수를 입력하세요 : 5
        System.out.print("단수를 입력하세요 : ");
         num1 = scan.nextInt();

        System.out.println(num1 + " X 1 = " + (num1 * 1 ) );
        System.out.println(num1 + " X 2 = " + (num1 * 2) );
        System.out.println(num1 + " X 3 = " + (num1 * 3) );
        System.out.println(num1 + " X 4 = " + (num1 * 4) );
        System.out.println(num1 + " X 5 = " + (num1 * 5) );

//        5. 원 넓이 구하기
//        지름을 입력받아서 원의 넓이를 구하여 출력하세요.
//        pi는 3.14


        System.out.print("지름을 입력하세요 : ");
        int radius = scan.nextInt() /2;

        System.out.println("원의 넓이는 " + (radius * radius * 3.14) + "입니다." );



    }
}
