package list.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        //리스트
        // 같은 형태의 데이터를 여러개 저장
        // index를 기반으로 값을 접근하고 순서가 있다.


        //리스트는 <재네릭>을 통해서 타입을 선정할수 있음 ↓타입은 정수 리스트
        List<Integer> numberList = new ArrayList<>();

        // 리스트에 값 추가
        // 리스트에 인덱스 순으로 순서대로 값 추가 add(정수)
        numberList.add(10);
        numberList.add(20);
//        numberList.add("15");

        System.out.println(numberList);

        //값을 삽입
        //add() 가 오버 로딩이 됨
        //삽입add(인덱스 값, 넣을 값)
        numberList.add(1, 15);
        System.out.println(numberList);

        //값을 수정
        numberList.set(2 , 25);
        System.out.println(numberList);

        //값 삭제
        numberList.remove(1);
        System.out.println(numberList);

        //특정 값 얻어오기
        // return 값은 Integer 객체
        Integer number = numberList.get(1);
        System.out.println(number);

        // 래퍼클래스 객체는 가능하다면 기본자료형(primitve type)으로 해주기
        // 객체로 숫자를 저장하면 다루기에 조금 무겁기 때문이다.
        int number2 = numberList.get(1);
        System.out.println(number2);


        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("bear");
        stringList.add("chair");

        System.out.println(stringList);

        //값 삭제 - 값을 통한 삭제
        stringList.remove("bear");
        System.out.println(stringList);

    }
}
