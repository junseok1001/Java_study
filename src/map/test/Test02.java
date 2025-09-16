package map.test;

import java.util.*;

public class Test02 {
    public static final Map<String, String> capitalMap = new HashMap<>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("튀르키예", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
    public static void main(String[] args) {
        Map<String, Character> names = new HashMap<>();
        Set<String> keyValue = names.keySet();

        names.put("이지은" , 'X');
        names.put("서장훈" , 'X');
        names.put("유재석" , 'X');
        names.put("이광수" , 'X');
        names.put("박나래" , 'X');

//        for(String name : keyValue){
//            if(name.substring(0,1).equals("이")){
//                names.put(name, 'O');
//            }
//        }

        for(String name : keyValue){
            if(name.startsWith("이")){
                names.put(name,'O');
            }
        }
        System.out.println(names);

        //2문제
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        // 키가들어가는 배열 리스트를 생성 , 이건 제공한 준것
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
        int count = 0;

        //추가 중복 없애기
        for(int i = 0; i < 5; i++){
            //1 ~ 20
            int randomNumber = rand.nextInt(keyList.size());
            int num = randomNumber;
            System.out.print(keyList.get(num) + "의 수도 이름은 ?");
            String capital = scan.nextLine();

            String collect = capitalMap.get(keyList.get(num));
            if(collect.equals(capital)){
                count++;
                System.out.println("정답입니다.");
            }else{
                System.out.println("틀렸습니다");
            }

            keyList.remove(collect);  // 나왔던 문제 삭제

        }
        System.out.println("총 점수는 : " + count * (100/5));











    }
}
