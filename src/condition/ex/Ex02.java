package condition.ex;

public class Ex02 {

    public static void main(String[] args) {
        int walking = 10100;
        int weight = 68;
        // 만보를 걷고 몸무게가 70kg 안되면 치킨먹자
        // 만약 만보 이상을 걷는다 그리고 몸무게가 70kg 이하다. 그러면 치킨먹자.

        if(walking > 10000 && weight <= 70){
            System.out.println("치킨먹자!!!");
        }

        // 만보를 걷거나 몸무게가 70kg 안되면 치킨먹자
        // 만약 만보 이상을 걷는다. 또는 몸무게가 70 이하다.
        if(walking >= 10000 || weight <= 70){
            System.out.println("치킨먹자 ###");
        }

        int number = 20;
        // 10 < number < 40
        // 10 보다 크고 그리고 40보다 작다.
        if (number > 10 && number < 40){
            System.out.println("10보다 크고 40보다 작습니다.");
        }


    }
}
