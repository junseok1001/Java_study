package string.test;

public class Test03 {

    public static void main(String[] args) {

//        3. 문자열 검색
//        회원 명부가 아래와 같이 문자열이 저장되어 있다. 같은 이름이 몇 개인지 출력하세요.
//                String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//        출력 예시
//
//        동명 수 : 3
                                // 0   1     2    3      4     5     6     7    8      9
        String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
        String[] member = membersString.split(":");

        int count = 0; // 동명일때 세는 수
        for(int i = 0; i < member.length; i++){
            for(int j = 0; j < i; j++) {
                System.out.print(member[j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < member.length; i++){
            for(int j = 0; j < i; j++) {
                System.out.print(member[i] + " ");
            }
            System.out.println();
        }



        System.out.println("동명 수 : " + count);


    }
}
