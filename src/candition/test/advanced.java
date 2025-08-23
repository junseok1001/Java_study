package Variable.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class advanced {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1. 과락 포함 합격 여부
//        점수 두 개를 입력받고 합격 여부를 출력하세요.
//                평균이 60점 이상이면 "합격"
//        한 과목이라도 50점 이하면 무조건 "과락"
//        평균이 60점 미만이면 "불합격"
//

//        System.out.print("점수1 : ");
//        int score1 = scan.nextInt();
//        System.out.print("점수2 : ");
//        int score2 = scan.nextInt();
//
//        int average = (score1 + score2) / 2;

        // 평균 60 이상이면 합격
        // 평균이 60 미만이거나 또는 점수가 50 밑이면 과락
        // 평균이 60 미만이면 불합격
//        if(average < 60){
//            System.out.println("불합격");
//        }else if (score1 < 50 || average < 60){
//            System.out.println("과락");
//        }else if (score2 < 50 || average <60){
//            System.out.println("과락");
//        }else {
//            System.out.println("합격");
//        }

        //윤년 구하기
        System.out.print("연도 : ");
        int years = scan.nextInt();


        //4로는 나누어 떨어지지만, 100으론 나누어 떨이지면 안됌.
        //
        if(years % 4 == 0){// 4로나누어 떨어지는거
            if(years % 100 == 0){
                if(years % 400 == 0){
                    System.out.println("윤년");
                }else{
                    System.out.println("평년");
                }
            }else{
                System.out.println("윤년");
            }
        }





    }
}
