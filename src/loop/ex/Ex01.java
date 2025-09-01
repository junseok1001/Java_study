package loop.ex;

public class Ex01 {
    public static void main(String[] args) {


        // 몸무게가 70 이상일 때만 운동을 한다.
//        int weight = 75;
//
//        while(weight >= 70){
//            System.out.println("으쌰으쌰");
//             weight -= 2;//복합 대입 연산자//weight = weight -2;
//        }

        // 원하는 횟수만큼.
        int i = 0;
//
//        while(i<5){
//            System.out.println(" Hello World");
//            i++;//증감 연산자 //i += 1;//i = i + 1;
//        }

        // 1 2 3 4 5
//        i = 1;
//        while(i <= 5){
//            System.out.println(i);
//            i++;
//        }

        // 5 4 3 2 1
//        i = 5;
//        while(i > 0){
//            System.out.println(i);
//            i--;
//        }

        // 1 ~ 10까지 의 합
        // 1 2 3 4 5 6 7 8 9 10

        int sum = 0;
        i = 1;
        while(i <= 10){

            sum += i;//sum = sum + i;

            i++;
        }
        System.out.println(sum);

        // 무한 반복 -> 가장 경계하고 조심해야하는거
//        while(true){
//            System.out.println("Hello");
//        }



    }
}
