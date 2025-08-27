package doubleloop.test;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 연습문제 1
        for(int i = 1; i <=6; i++){
            for(int j = 1; j <= 6; j++){
                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }

        //연습문제2
        for(int i = 2; i <=9; i ++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println();
        }

        //연습문제3
//        for(int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //문제 4번
//        for(int i = 5; i >= 0; i--){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //문제 5번;
        for(int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                for(int k = 0; k < j; k++){
                    System.out.println(" ");
                }
                System.out.print("*");
            }
        }
    }
}
