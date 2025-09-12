package list.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(5);
        numberList.add(3);
        numberList.add(8);
        numberList.add(1);
        numberList.add(4);
        numberList.add(6);

        System.out.println(numberList);

        // 유용한 List 메서드
        // 리스트에 특정 값이 존재하는 여부
        if(numberList.contains(8)){
            System.out.println("8이 포함 됨");
        }

        // 정렬(sorting)

        //오름 차순 정렬
        numberList.sort(Comparator.naturalOrder());
        System.out.println(numberList);

        //내림 차순 정렬
        numberList.sort(Comparator.reverseOrder()); // 어렵게 보이지만 사용밥만 알아두기
        System.out.println(numberList);

        numberList.clear();

        // 리스트가 비어 있는지 여부
        if(numberList.isEmpty()){
            System.out.println("리스트가 비어 있다.");
        }




    }
}
