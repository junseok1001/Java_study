package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
//        1. id 중복 체크
//        아래와 같이 회원 가입된 id 목록이 주어진다.
//        ["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//        id를 입력받고, id가 중복될 경우 "중복입니다", 중복되지 않을 경우 "사용가능"을 출력하세요.
//        입력 예시
//
//        id : hagulu
//        출력 예시
//
//        중복입니다.

//        List<String> memberId = new ArrayList<>();
//        memberId.add("hagulu");
//        memberId.add("happy");
//        memberId.add("google");
//        memberId.add("bts");
//        memberId.add("iu");
//        memberId.add("cuteboy");
//
//        System.out.println(memberId);
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("id : ");
//        String name = scan.nextLine();
//
//        if(memberId.contains(name)){
//            System.out.println("중복합니다.");
//        }else{
//            System.out.println("중복하지 않습니다.");
//        }


//        2. 체조 경기 평균 점수
//        체조 경기에서 아래와 같은 심사위원 점수가 집계되었습니다.
//                최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//        for문으로 구현할 것
//
//                [8, 7, 6, 10, 9, 4]
//        출력 예시
//
//        최고점과 최저점을 제외한 평균 점수는 7.5
//        Compare compare = new Compare();
//
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(8);
//        numberList.add(7);
//        numberList.add(6);
//        numberList.add(10);
//        numberList.add(9);
//        numberList.add(4);
//
////        int max = numberList.get(0);
////        int maxIndex = 0;
//        int min = numberList.get(0);
//        int minIndex = 0;
//        int sum = 0;
//        double average = 0;
//
//        //최댓 값 없애기 // 클래스 들고 와서 해보기
////        for(int i = 1; i < numberList.size(); i++){
////            int number = numberList.get(i);
////            if(max < number){
////                max = number;
////                maxIndex = i;
////            }
////        }
//
//        numberList.remove(compare.maxi(numberList));
//
//
//        // 최솟값 없애기
////        for(int i = 1; i < numberList.size(); i++){
////            int number = numberList.get(i);
////            if (min > number) {
////                min = number;
////                minIndex = i;
////            }
////        }
//        numberList.remove(compare.mini(numberList));
////        System.out.println(numberList);
//
//
//        for(int i = 0; i < numberList.size(); i++){
//            int number = numberList.get(i);
//            sum += number;
//        }
//
//        average = sum / (double)numberList.size();
//        System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);


//        3. 로또 번호
//        Random 클래스를 이용해서 1~45 범위의 6개의 중복되지 않는 숫자를 리스트에 저장하세요.
//        저장된 숫자를 오름차순으로 정렬해서 출력하세요.
//                출력 예시
//
//        [3, 6, 19, 26, 37, 44]
//        List<Integer> lottoNumber = new ArrayList<>();
//        Random random = new Random();
//        int[] lottoArray = new int[6];
//
//        for(int i = 0 ; i < lottoArray.length; i++){
//
//            int randomNumber = random.nextInt(45) + 1;
//            lottoArray[i] = randomNumber;
//            for(int j = 0; j < i; j++){
//                if(lottoArray[j] == randomNumber){
//                    //중복
//                    i--;
//                }
//            }
//            lottoNumber.add(lottoArray[i]);
//        }
//
//        System.out.println(lottoNumber);

//        4. 회원 추가하기
//        회원 관리 리스트를 만든다.
//
//        [우솝, 루피, 상디, 나미, 로빈]
//        새로 입력할 이름을 기존 리스트에 추가한다.
//        만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//        (새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
        Scanner scan = new Scanner(System.in);


        System.out.print("이름을 작성하시오");


        List<String> newMemberList = new ArrayList<>();
        List<String> memberList = new ArrayList<>();
        memberList.add("우솝");
        memberList.add("루피");
        memberList.add("상디");
        memberList.add("나미");
        memberList.add("로빈");

//        newMemberList.add("프랑키");
//        newMemberList.add("루피");
//        newMemberList.add("쵸파");
//        newMemberList.add("로빈");
//        newMemberList.add("루피");

        for(int i = 0; i < memberList.size(); i++){
            String name = scan.nextLine();
            newMemberList.add(name);
        }



        //조건 같은 이름이면 1을 더한 값에 이름을 넣고 올라간 값을 넣어라

        for(int i = 0; i < memberList.size(); i++){
            int count = 0;
            for(int j = 0; j < newMemberList.size(); j++){
                if(newMemberList.get(j).contains(memberList.get(i))){
                    count++;
                    newMemberList.set(j, newMemberList.get(j) + count);
                }
            }
        }

        for(int i = 0; i < newMemberList.size(); i++){
            memberList.add(newMemberList.get(i));
        }


        System.out.println(memberList);











    }
}
