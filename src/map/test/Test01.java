package map.test;

import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Map<String, Integer> gradeMap = new HashMap<>();


        //1. 자료입력
        gradeMap.put("국어", 90);
        gradeMap.put("수학", 85);
        gradeMap.put("영어", 90);
        gradeMap.put("사회", 80);
        gradeMap.put("과학", 100);

        System.out.println(gradeMap);


        //2. 자료 수정
        int score = gradeMap.get("사회");
        gradeMap.put("사회", score + 5);
        System.out.println(gradeMap);

        //값 찾기
        Scanner scan = new Scanner(System.in);
        System.out.print("조회할 과목명을 입력하세요 : ");
        String grade = scan.nextLine();
        Integer find = gradeMap.get(grade);
        if(find == null){
            System.out.println("자료 없음");
        }else{
            System.out.println(grade + " : " + find);
        }

        //값 찾기 2
        // 반복문이 필요할까? 과연 일단 90점 이상 높은 걸찾을려면 map 안에 모든 수를 접근을 해서 90점인 애들 판별
        Set<String> lab = gradeMap.keySet();

        for(String name:lab){
             score = gradeMap.get(name);
            if(score >= 90){
                System.out.print(name + " ");
            }
        }
        System.out.println();


        //값 확인

//        Iterator<String> iter = lab.iterator();
//        while(iter.hasNext()){
//            String labClass = iter.next();
//
//             score = gradeMap.get(labClass);
//
//            if(score == 100){
//                System.out.println("수상 가능");
//                break;
//            }
//        }

        if(gradeMap.containsValue(100)){
            System.out.println("수상 가능");
        }




    }
}
