package variable.test;


import java.util.Scanner;

public class Total_test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //종합 문제 1

//        System.out.print("입력 1 : ");
//        int num1 = scan.nextInt();
//        System.out.print("입력 2 : ");
//        int num2 = scan.nextInt();
//
//        System.out.println("덧셈 : " + num1 + num2);
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + (num1 / num2));

        //문제 2
//        System.out.print("입력 1 : ");
//        num1 = scan.nextInt();
//        System.out.print("입력 2 : ");
//        num2 = scan.nextInt();
//
//        System.out.println("몫 : " + (num1 / num2) + " 나머지 : " + (num1 % num2));

        //문제 3
//        System.out.print("길이 : ");
//        int length = scan.nextInt();
//
//        System.out.println("정사각형의 넓이 : " + (length * length));

        //문제 4
//        System.out.print(" 밑변 : ");
//        int length = scan.nextInt();
//        System.out.print(" 높이 : ");
//        int height = scan.nextInt();
//
//        System.out.println("삼격형의 넓이는 : " + (length * height)/2.0 );

        //문제 5 교체
        System.out.print(" x = ");
        int x = scan.nextInt();
        System.out.print(" y = ");
        int y = scan.nextInt();

        int tmp = x;

        //swap 알고리즘 **
        x= y;
        //x = 4; y= 6 tmp = 6
        y= tmp;


        System.out.println(" x = " + x + " y = " + y);

        //문제 6
//        System.out.print("초 : ");
//        int time = scan.nextInt();
//
//        int hour = time / 60;
//        int minute = time % 60;
//
//        System.out.println(hour + "분 " + minute + "초");
    }
}
