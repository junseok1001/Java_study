package map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {

    public static void main(String[] args) {

        //map

        // 특정 아이디의 이름 저장
        // key : 아이디
        // value : 이름
        // index는 없다. 순서 보장 x
        Map<String, String> memberMap = new HashMap<>();

        memberMap.put("hagulu" , "오준석");
        memberMap.put("yu", "유재석");
        memberMap.put("bada", "바다");
        memberMap.put("ohndar", "김인규");

        System.out.println(memberMap);

        // 값 얻어오기
        String name = memberMap.get("bada");
        System.out.println(name);

        //null : 객체가 없는 상태
        name = memberMap.get("asdf");
        System.out.println(name);

        // NullPointerException
//        name.length();
        String tmp = null;

        




    }
}
