package array.test;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, 5, 2, 10, 39};
        // 1. 배열 값 변경
        //인덱스에 숫자 들어갈 놈이랑
        // 값을 넣어야 되는거 확인하기
//        System.out.print("변경할 index와 값을 입력하세요 : ");
//        int index = scan.nextInt();
//        int changer = scan.nextInt();
//
//        for(int i = 0; i < numbers.length; i++){
//            if(i == index){
//                numbers[index] = changer;
//            }
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

        // 2. 점수 채점
//        char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//        int count = 0;
//        for(int i = 0; i < scores.length; i++){
//            if(scores[i] == 'O'){
//                count++;
//            }
//        }
//        System.out.println("채점 결과는 " + (count * 10) + "점 입니다.");


        //3. 임금 계산
        //             월 화 수 목 금  토 일
        int[] works = {3, 5, 5, 3, 5, 3, 5};
//        int workTime = 0;
//        int weekWorkTime = 0;
//        int weekend = 0;
//        int weekday = 0;
//        for(int i = 0; i < works.length; i++){
//            //평일을 나누고
//            if(i < 5){
//                workTime += works[i];
//                weekday = workTime * 8500  ;
//            }else{
//                weekWorkTime += works[i];
//                weekend = weekWorkTime * 9500 ;
//            }
//
//
//        }
//        System.out.println("일주일간 총 임금은 " + (weekday + weekend) + "원 입니다.");
        //임금을 바로바로 처리하는 단계
//        int wages = 0;
//        int workTime = 0;
//        int sum = 0;
//        for(int i = 0; i < works.length -2; i++){
//            wages = works[i] * 8500;
//            sum += wages;
//        }
//        for(int i = works.length -2; i < works.length; i++){
//            wages = works[i] * 9500;
//            sum += wages;
//        }
//        System.out.println("일주일간 총 임금은 " + sum + "원 입니다.");

        //4. 배열 값 입력
        //무한 루프를 돌리고 num에다가 짝수만 차곡 차곡 쌓다가 다차면 스탑
        int stack = 0;
        int sum = 0;
        int [] num = new int[5];
        for(int i = 0; ;  ){
            System.out.print("수를 입력하세요 : ");
            stack = scan.nextInt();
            if(stack % 2 == 0){
                num[i] = stack;
                i++;
            }
            if(num[4] == stack){
                break;
            }
        }

        for(int i = 0; i < num.length; i ++){
            System.out.print(num[i] + " ");
        }
        System.out.println();



    }
}
