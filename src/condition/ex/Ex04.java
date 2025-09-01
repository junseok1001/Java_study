package condition.ex;

public class Ex04 {

    public static void main(String[] args) {


        //학점이
        //A 이면 소고기
        //B 이면 삼겹살
        //C 이면 치킨
        //그게 아니면 굶어

        char grade = 'D';

        // 특정 변수의 값이 특정 값과 일치하는 경우에 대한 조건
        // switch
        switch(grade){
            case 'A' :
                System.out.println("소고기");
                break;
            case 'B' :
                System.out.println("삼겹살");
                break;
            case 'C' :
                System.out.println("치킨");
                break;
            default :
                System.out.println("굶어 !!");
        }


        // A이면 소고기, 삼겹살
        // B이면 삼겹살
        // C이면 치킨
        // 그렇지 않으면 굶어
        //break 활용도에 의해 결과값 출력의 많은 도움을 줌
        switch(grade){
            case 'A' :
                System.out.println("소고기");
            case 'B':
                System.out.println("삼겹살");
                break;
            case 'C' :
                System.out.println("치킨");
                break;
            default :
                System.out.println("굶어!");
        }


    }
}
