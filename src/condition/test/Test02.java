package condition.test;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 두 점수 합격
        System.out.print("두 점수를 입력하세요 : ");
        int score1 = scan.nextInt();
        int score2 = scan.nextInt();

        if(score1 >= 70 && score2 >= 70){
            System.out.println("합격입니다.");
        }
        if(score1 <70 || score2 <70){
            System.out.println("불합격입니다.");
        }

        //2. 공배수 구하기
        System.out.print("수를 입력하세요 : ");
        int number1 = scan.nextInt();

        if (number1 % 2 == 0 && number1 % 3 ==0){
            System.out.println(number1 + "는 2와 3의 공배수 입니다.");
        }
        if (number1 % 2 == 1 || number1 % 3 == 1){
            System.out.println(number1 + "는 2와 3의 공배수가 아닙니다.");
        }


//        3. 범위
//        1 ~ 10 사이의 수를 입력받아야 한다. 범위를 넘어갈 경우 잘못 입력하셨습니다를 출력하세요.

        System.out.print("1 ~ 10 사이의 수를 입력하세요 : ");
        int num1 = scan.nextInt();

        // 1<= num1 <=10
        if(num1 >=1 && num1 <= 10){
            System.out.println(num1 + "숫자를 선택하셨습니다.");
        }
        // 1 > num1 || num1 >10
        if(num1 < 1 || num1 > 10){
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}
