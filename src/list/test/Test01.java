package list.test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        //최초 값 넣기
        numberList.add(3);
        numberList.add(8);
        numberList.add(9);
        numberList.add(4);
        numberList.add(2);
        numberList.add(1);
        numberList.add(7);
        numberList.add(5);
        System.out.println(numberList);

        //값 수정하기
        numberList.set(3 , 6);
        System.out.println(numberList);

        //값 삽입하기
        numberList.add(2 , 10);
        System.out.println(numberList);

        //값 삭제하기
        numberList.remove(1);
        numberList.remove(6);
        System.out.println(numberList);





    }
}
