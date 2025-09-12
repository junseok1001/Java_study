package list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // 리스트 반복문

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("grape");
        fruitList.add("banana");
        fruitList.add("banana");
        fruitList.add("banana");
        fruitList.add("banana");
        fruitList.add("banana");


        // index 기반 반복문
        for(int i = 0; i < fruitList.size(); i++){
            String fruit = fruitList.get(i);

//            if(fruit.equals("banana")){
//                fruitList.remove(i);
//            }
//            System.out.print(fruitList.get(i) + " ");
        }
        System.out.println(fruitList);

        // 향상된 for 문 - 다른 문법은 foreach , each 라고 부른다.
        for(String fruit:fruitList){
            System.out.print(fruit + " ");
//            if(fruit.equals("banana")){
//                fruitList.remove(fruit);
//            }
        }
        System.out.println();

        // Iterator //제 3의 관찰자라는 뜻 관찰자에게 내가 시키는것  // 반복과정에서 리스트를 값을 삭제할때 필수적으로 써야된다.
        //최초에 원하는 배열의 앞에 가상을 가르키고 있음.
        Iterator<String> iter = fruitList.iterator();

        while(iter.hasNext()){
            String fruit = iter.next(); // 첫번째 실행시 최초에 가상공간을 가르키고 있다가 다음값이 있으면 0을 가리키고 그곳에 값을 달라는 뜻
            if(fruit.equals("banana")){
                iter.remove();
            }
//            System.out.print(fruit + " ");
        }
        System.out.println(fruitList);



    }
}
