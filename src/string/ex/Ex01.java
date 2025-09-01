package string.ex;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // 문자열 변수
        String test1 = "Hello World!";

        System.out.println(test1);

        //문자열 연사
        int number = 10;
        System.out.println(test1 + " " + number);

        String test2 = "!!!";

        String newTest = test1 + test2;
        System.out.println(newTest);

        Scanner scan = new Scanner(System.in);
        System.out.print("문자을 입력하세요 : ");
        String input1 = scan.next();

        System.out.println(input1);

        scan.nextLine(); // stream에 남아 있는 \n 값을 빼준다. , 즉 초기화를 해준다.
        System.out.print("문자열을 입력하세요 : ");
        String input2 = scan.nextLine();

        System.out.println(input2);



    }
}
