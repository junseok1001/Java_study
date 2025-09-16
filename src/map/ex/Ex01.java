package map.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

        //return 값이 null 인지 검증 할수있음
        if(name != null){
            //name 에 객체가 대입되었다.

        }

        // 특정키가 존재하는지
        if(memberMap.containsKey("hagulu")){
            memberMap.get("hagulu");
        }

        //값 수정
        memberMap.put("ohndar", "박명수");
        System.out.println(memberMap);

        // 맵은 아주 희박하게 반복문을 통해서 전체 값을 접근한다.
        // 맵에 사용성은 보통 key 값을 알고 접근하는게 일반적이다

        //맵 반복문

        // 키 목록을 얻어 온다.
        // 키를 하나씩 반복문으로 얻어 와서 키를 통해 값을 얻어온다.

        // 키 목록 얻어오기
        Set<String> idSet = memberMap.keySet();

        for(String id:idSet){
            name = memberMap.get(id);
            System.out.print(name + " ");
        }
        System.out.println();

        Iterator<String> iter = idSet.iterator();
        while(iter.hasNext()){
            String id = iter.next();

            System.out.print(memberMap.get(id) + " ");
        }
        System.out.println();



    }
}
