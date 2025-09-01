package string.test;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String text1 = scan.next();
//        String text2 = scan.next();
//        String text3 = scan.next();
//
//        String newText = text1 + " " +  text2 + " " + text3;
//
//        System.out.println(newText);


//        System.out.print("ID를 입력하세요 : ");
//        String text = scan.next();
//
//        System.out.println("Welcome " + text);


//        3. 문자열 배열
//        아래와 같이 문장을 입력하고, 이 문장의 단어를 하나씩 문자열 배열에 저장하세요.
//        저장된 단어를 한 줄에 하나씩 출력하세요.
        // 단어별로 변수 로 저장
        String[] words = new String[3];

        for(int i = 0; i < words.length; i++){
            words[i] = scan.next();
        }
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }






    }
}
