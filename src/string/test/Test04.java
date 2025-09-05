package string.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

//        1. 문자열 검색
//        파일 이름이 저장된 문자열 배열에서 jpg 파일이 몇 개인지 출력하세요.
        String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//        출력 예시
//
//        jpg 파일 개수 : 3
        int count = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].contains(".jpg")) {
                count++;
            }
        }

        System.out.println("jpg 파일의 개수 : " + count);

//        2. 영 단어 퀴즈
//        영어 단어 퀴즈를 낸다.
//        아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//        100점 만점 기준으로 몇 점인지 출력한다.
//        1. 승리를 영어로 입력하세요 :
//        2. 사랑을 영어로 입력하세요 :
//        3. 컴퓨터를 영어로 입력하세요 :
//        4. 노트북을 영어로 입력하세요 :
//        입력 예시
//
//        1. 승리를 영어로 입력하세요 : victory
//        2. 사랑을 영어로 입력하세요 : lobe
//        3. 컴퓨터를 영어로 입력하세요 : computer
//        4. 노트북을 영어로 입력하세요 : notebook

        Scanner scan = new Scanner(System.in);
        String[] answers = new String[4];


        System.out.println("1. 승리를 영어로 입력하세요 : ");
        answers[1] = scan.nextLine();
        System.out.println("2. 사랑를 영어로 입력하세요 : ");
        answers[2] = scan.nextLine();
        System.out.println("3. 컴퓨터를 영어로 입력하세요 : ");
        answers[3] = scan.nextLine();
        System.out.println("4. 노트북를 영어로 입력하세요 : ");
        answers[4] = scan.nextLine();
        //하다가 말았음.
//        for(int i = 0; i < answer.length;)


//        3. 문자열 검색
//        회원 명부가 아래와 같이 문자열이 저장되어 있다. 같은 이름이 몇 개인지 출력하세요.
//                String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//        출력 예시
//
//        동명 수 : 3
        // 0   1     2     3     4     5     6     7    8     9
//        String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//        String[] member = membersString.split(":"); // 문자열을 배열로 정리
//
//        //조건 1.
//
//        int count = 0; // 동명일때 세는 수
//        for(int i = 0; i < member.length; i++){
//            for(int j = 0; j <= i; j++) {
//                if(i == j ){
//                    break;
//                }
//
//                if(member[i].equals(member[j])){
//                    count++;
//                }
//            }
//        }
//
////        for(int i = 0; i < member.length; i++){
////            for(int j = 0; j < i; j++) {
////                System.out.print(member[i] + " ");
////            }
////            System.out.println();
////        }
//
//
//
//        System.out.println("동명 수 : " + count);


    }
}
