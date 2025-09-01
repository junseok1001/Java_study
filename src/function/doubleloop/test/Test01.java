package function.doubleloop.test;

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
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6번 문제
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }

            // 1 2 3 4 5
            // 1 3 5 7 9
            // 2n - 1
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
