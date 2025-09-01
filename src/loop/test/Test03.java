package loop.test;

import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//문제4
//        System.out.println("1 번째 수를 입력하세요 : ");
//        int min = scan.nextInt();
//        for(int i = 2; i <= 5; i++){
//            System.out.println(i + "번째 수를 입력하세요 : ");
//            int num1 = scan.nextInt();
//            if(min >= num1){
//                min = num1;
//            }
//
//        }
//        System.out.println("최소값은" + min +"입니다.");

        //문제5
        System.out.print("수를 입력하세요 : ");
        int num1 = scan.nextInt();
        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
