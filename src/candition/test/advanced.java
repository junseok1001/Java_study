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
//        System.out.print("연도 : ");
//        int years = scan.nextInt();
//
//
//        //4로는 나누어 떨어지지만, 100으론 나누어 떨이지면 안됌.
//        //
//        if(years % 4 == 0){// 4로나누어 떨어지는거
//            if(years % 100 == 0){
//                if(years % 400 == 0){
//                    System.out.println("윤년");
//                }else{
//                    System.out.println("평년");
//                }
//            }else{
//                System.out.println("윤년");
//            }
//        }
//        3. 가위 바위 보 게임
//        철수와 영희가 가위(1), 바위(2), 보(3) 게임을 진행할 때, 게임에서 이긴 사람을 출력하세요.
//                영희의 가위바위보를 숫자로 먼저 입력받고, 그다음에 철수의 가위바위보를 숫자로 입력받는다.
//        입력 예시
//
//        영희 공격 : 2
//        철수 공격 : 3
//        출력 예시
//
//        철수가 이겼다
//
//        System.out.print("영희 공격 : ");
//        int game1 = scan.nextInt();
//        System.out.print("철수 공격 : ");
//        int game2 = scan.nextInt();
//
//        // 수식으로 가면 안될거 같음... 9가지 경우의 수를 다 해야한다?
//        // 1(가위) 2(바위) 3(보)
//        // 1과 2면 2가 이기고
//        // 2와 3이 하면 3이 이기고
//        // 1과 3이 하면 1이 이긴다
//        if(game1 == game2 ){
//            System.out.println(" 무승부");
//        }else if (game1 == 1){ // 영희가 가위를 낸다면
//            if(game2 == 2){
//                System.out.println(" 철수가 이겼다");
//            }else {
//                System.out.println("영희가 이겼다");
//            }
//        }else if (game1 == 2){
//            if(game2 == 3){
//                System.out.println(" 철수가 이겼다");
//            }else{
//                System.out.println("영희가 이겼다");
//            }
//        }else if(game1 == 3){
//            if(game2 == 1){
//                System.out.println(" 철수가 이겼다");
//            }else {
//                System.out.println("영희가 이겼다");
//            }
//        }

        //문제 4
        //항상 45 분전 표현하기
//        System.out.print("시간 분 입력 : ");
//        int hour = scan.nextInt();
//        int minute = scan.nextInt();
//
//        // 만약 분이 부족하다면 시간을 1나 없애고 60 + 된 분에서 기본 분 더한 후 45분을 빼주면 된다.
//        if(minute < 45){
//            hour = hour -1;
//            minute = minute + 60;
//            minute = minute - 45;
//        }
//        System.out.println(hour + "시" + minute + "분 입니다.");



        //문제 5
        System.out.print("윳 상태를 입력하세요 : ");
        int stick1 = scan.nextInt();
        int stick2 = scan.nextInt();
        int stick3 = scan.nextInt();
        int stick4 = scan.nextInt();


        int total = stick1 + stick2 + stick3 + stick4;
        // stick이 1씩 늘어나면 도 개 걸 윳 모가 늘어난다.
        if(total == 0){
            System.out.println("모");
        }else if (total == 1){
            System.out.println("도");
        }else if (total == 2){
            System.out.println("개");
        }else if (total == 3){
            System.out.println("걸");
        }else if (total == 4){
            System.out.println("윳");
        }












    }
}
