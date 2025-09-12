package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
//        1. id 중복 체크
//        아래와 같이 회원 가입된 id 목록이 주어진다.
//["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
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

        List<Integer> numberList = new ArrayList<>();
        numberList.add(8);
        numberList.add(7);
        numberList.add(6);
        numberList.add(10);
        numberList.add(9);
        numberList.add(4);

        int max = numberList.get(0);
        int maxIndex = 0;
        int min = numberList.get(0);
        int minIndex = 0;

        //최댓 값 없애기 // 클래스 들고 와서 해보기
        for(int i = 1; i < numberList.size(); i++){
            int number = numberList.get(i);
            if(max < number){
                max = number;
                maxIndex = i;
            }
        }
        numberList.remove(maxIndex);
        System.out.println(numberList);

        // 최솟값 없애기
        for(int i = 1; i < numberList.size(); i++){
            int number = numberList.get(i);
            if (min > number) {
                min = number;
                minIndex = i;
            }
        }
        numberList.remove(minIndex);






    }
}
