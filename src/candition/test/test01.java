package Variable.test;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {

        // 종합문제 1.짝수 구하기
        Scanner scan = new Scanner(System.in);

//        System.out.print("세 개의 수를 입력하세요 : ");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        // 각 정수를 판별해야 되기때문에 각 정수만다 if 로 설정
//
//        if(num1 % 2 == 0){
//            System.out.println(num1 + "은(는) 짝수입니다.");
//        }
//        if(num2 % 2 == 0){
//            System.out.println(num2 + "은(는) 짝수입니다.");
//        }
//        if(num3 % 2 == 0){
//            System.out.println(num3 + "은(는) 짝수입니다.");
//        }
//        if((num1 % 2 != 0 && num2 % 2 != 0) && num3 % 2 != 0){
//            System.out.println("모두 짝수가 아닙니다");
//        }

//        2. 비만도 구하기
//        BMI 수치를 입력받아서 비만 판정을 출력하세요.
//        BMI 수치	비만도
//        ~ 10 이하	정상
//        ~ 20 이하	과체중
//        20 초과	비만
//        System.out.print("BMI 수치를 입력하세요 : ");
//        int BMI = scan.nextInt();
//
//        if(BMI <= 10){
//            System.out.println("정상");
//        }else if (BMI >10 && BMI <= 20){
//            System.out.println("과체중");
//        }else {
//            System.out.println("비만");
//        }
//        3. 평균 합격 구하기
//        두 점수를 입력받고, 평균이 70점 이상이면 ‘합격’, 그렇지 않으면 ‘불합격’을 출력하세요.
//        입력 예시
//
//        두 점수를 입력하세요 : 87 95
//        출력 예시
//
//        87점과 95점은(는) 합격입니다.
//        System.out.print("두 수를 입력하세요 : ");
//        int score1 = scan.nextInt();
//        int score2 = scan.nextInt();
//
//        int average = (score1 + score2) / 2;
//
//        if(average >= 70){
//            System.out.println(score1 + "점과" + score2 + "점은(는)합격 입니다.");
//        }else {
//            System.out.println(score1 + "점과" + score2 + "점은(는)불합격 입니다.");
//        }


//        4. 큰값 구하기
//        세 개의 정수를 입력받아 가장 큰 값을 출력하세요.
//        입력 예시
//
//        세 수를 입력하세요 : 3 8 5
//        출력 예시
//
//        8은(는) 가장 큰 값입니다.
//        System.out.print(" 세 수를 입력하세요 : ");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int max = num1;
//
//        if(max < num2){
//            max = num2;
//        }
//        if (max < num3){
//            max = num3;
//        }
//        System.out.println(max + "은(는) 가장 큰 값입니다.");


        //문제 5
        System.out.print("월을 입력하세요 : ");
        int weather = scan.nextInt();

        if(weather == 3 || weather == 4 || weather == 5 ){
            System.out.println(weather + "월은(는) 봄입니다.");
        }else  if(weather == 6 || weather == 7 || weather == 8){
            System.out.println(weather + "월은(는) 여름입니다.");
        }else if (weather == 9 || weather == 10 || weather == 11){
            System.out.println(weather + "월은(는) 가을입니다.");
        }else if (weather == 12 || weather == 1 || weather == 2){
            System.out.println(weather + "월은(는) 겨울입니다.");
        }else {
            System.out.println("이거는 계절이 안닌데?");
        }

    }
}
