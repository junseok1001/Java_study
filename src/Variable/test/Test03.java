package Variable.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
//        4. 구구단
//        단수를 입력받고 아래와 같이 구구단을 출력하세요.
//        입력 예시
//
//        단수를 입력하세요 : 5
        System.out.print("단수를 입력하세요 : ");
        int num1 = scan.nextInt();

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
