package condition.ex;

public class Ex03 {

    public static void main(String[] args) {
        // 몸무게가 70 이하면 치킨먹자 그렇지으면 샐러드 먹자
        int weight = 74;
        if(weight <= 70){
            System.out.println("치킨먹자");
        }else {
            System.out.println("샐러드 먹자");
        }

        // 몸무게가 70 이하면 치킨
        // 그렇지않고 만약에 75 이하면 닭가슴살
        // 그렇지 않고만약에 80 이하면 셀러드
        // 그렇지 않으면 굶어

        if(weight <= 70){
            System.out.println("치킨먹자 ");
        }else if(weight <= 75){
            System.out.println(" 닭가슴살");
        }else if(weight <= 80){
            System.out.println(" 샐러드 먹자");
        }else {
            System.out.println("굶자...");
        }
        // if else if 팁 -> 가장 간단한 조건부터 차근히 탑을 쌓아가자.

    }
}
