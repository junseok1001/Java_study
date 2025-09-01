package string.test;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1. 정수 문자열 변환
//        아래와 같이 생년월일이 저장된 정수 변수가 있다.
//                해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요
//        System.out.print("int years = ");
//        int years = scan.nextInt();
//        System.out.print("int month = ");
//        int month = scan.nextInt();
//        System.out.print("int day = ");
//        int day = scan.nextInt();
//
//        //방법 1
//        String input1 = String.valueOf(years);
//        String input2 = String.valueOf(month);
//        String input3 = String.valueOf(day);
//
//        System.out.println(input1 + input2 + input3);
//
//        //방법2
//        System.out.println(years + "" + month + day);


//        2. 문자열 정수 변환
//        아래와 같이 생년이 저장된 String이 있을 때 올해 나이를 출력하세요 (한국 나이)
          String yearString = "1995";
          int year = Integer.parseInt(yearString);
          int age = (2025 - year) + 1;
        System.out.println(yearString + "년생의 나이는 " + age + "살");

//        3. 개수 세기
//        아래 배열에 물품 목록이 저장되어 있다
        String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
        System.out.print("제품명 : ");
        String things = scan.nextLine();
        int count = 0;
        for(int i = 0; i < goods.length; i++){
            if(goods[i].equals(things)){
                count++;
            }
        }
        System.out.println(count + "개");


    }
}
