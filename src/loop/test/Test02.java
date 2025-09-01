package loop.test;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1번 문제
        for(int i = 35; i <= 40; i++)  {
            System.out.print(i + " ");
        }
        System.out.println();

        //2번문제
        for(int i = 5; i > -6; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //문제 3번
        //50번 박복 시킴 -> 최적화 하기 위해서는 굳이 1~ 50 을 나열할 필요 없음.
//        그래서 그냥 3의 반복을 뽑아내면됌
//        for(int i = 1; i <= 50; i++){
//            if(i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
        for(int i = 3; i <= 50; i +=3){
            System.out.print(i + " ");
        }
        System.out.println();

        // 문제 4특정 조건의 갯수 세기
        // 7의 배수를 뽑고 그걸 출력하는 값을 하나 둘 새야되는데....
//        int count = 0;
//        for(int i = 1; i < 101; i++){
//            if(i % 7 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println("7의 배수의 개수 : " + (100 / 7));


        //문제5
        System.out.print("단수를 입력하세요 : ");
        int dan = scan.nextInt();
        for(int i = 1; i < 9; i++){
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }


        //문제 6
        int max = 0;
        for(int i = 0; i < 5; i++){
            int number = 0;
            System.out.print("수를 입력하세요 : ");
            number = scan.nextInt();
            if(max < number){
                max = number;
            }

        }
        System.out.println("가장 큰 수 : " + max);

    }
}
