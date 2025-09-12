package list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(20);
        numberList.add(3);
        numberList.add(5);
        numberList.add(84);
        numberList.add(17);
        System.out.println(numberList);

        //문제 2번
        int min = numberList.get(0);
        for(int number:numberList){
            if(min > number){
                min = number;
            }
        }
        System.out.println(min);


        //문제 3번
        Iterator<Integer> iter = numberList.iterator();
//        int sum = 0;
//        while(iter.hasNext()){
//            int number = iter.next();
//            sum += number;
//        }
//        System.out.println(sum);


        //문제 4번
        int max = numberList.get(0);
        int maxIndex = 0;
        for(int i = 1; i < numberList.size(); i++){
            int number = numberList.get(i);

            if(max < number){
                max = number;
                maxIndex = i;
            }
        }
        System.out.println("값 : " + max);
        System.out.println("index : " + maxIndex);


        //문제 5번
        //만약 위에서 선언이 되어있다면, 이터레이터는 문제 5번쪽에서는 끝을 가리키고 있다
        // 그래서 이터레이터를 다시 호출하는것이다
        iter = numberList.iterator();

        while(iter.hasNext()){
            int number = iter.next();
            if(number % 2 == 0){
                iter.remove();
            }
        }
        System.out.println(numberList);


    }
}
