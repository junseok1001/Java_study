package map.test;

import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마로비아나");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        List<Map<String, String>> characterList = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characterList.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characterList.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characterList.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characterList.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "남라");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characterList.add(character5);


        int max = 0;
        Map<String, String> searchCharacter = null;
        for(int i =0; i < characterList.size(); i++){

            Map<String, String> characterInfo = characterList.get(i);

            String sever = characterInfo.get("서버");
            String mySever = myCharacter.get("서버");
            String job = characterInfo.get("직업");

            if(sever.equals(mySever) && job.equals("힐러")){
                int number = Integer.parseInt(characterInfo.get("레벨"));
                if(max < number){
                    max = number;
                    searchCharacter = characterInfo;
                }
            }
        }
        if(searchCharacter.containsValue(String.valueOf(max))){
            Set<String> setKey = searchCharacter.keySet();

            System.out.println("힐러 탐색 결과");
            for(String info:setKey){
                String value = searchCharacter.get(info);
                System.out.println(info + " : " + value);
            }
        }








    }


}
