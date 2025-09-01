package loop.ex;

public class Ex02 {

    public static void main(String[] args) {
        // 횟수 반복 5번
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World!");
        }

        // 1 2 3 4 5
        for(int i = 1; i <= 5; i++){
            System.out.print(i + " ");
            //지역 변수
            int number = 10;
        }
        System.out.println();
//        System.out.println(number); // 지역변수의 영역 밖
        System.out.println("Hello");

        // 5 4 3 2 1
        for(int i = 5; i < 0; i--){
            System.out.println(i + " \n");
        }
        System.out.println();

        int weight = 75;

        // 몸무게를 다루는 무언가
        //초기화가 위에서 뒤어 있다면 for(; weight >= 70; weight - 2)처리할수있음
        for(; weight > 70; weight -= 2){
            System.out.println("으쌰으쌰");
        }

        //무한반복
//        for(;;){
//            System.out.println("Hello World");
//        }

        int count = 0;
        //break
        while(true){

            if(count == 10){
                break;
            }
            System.out.println("Hello");

            count += 2;

        }


        //contiue
        for(int i = 1; i < 10; i++){

            //i가 3의 배수 일때는 출력하지 않는다.
            if(i % 3 == 0){
                continue;
            }

            System.out.println(i + " ");
        }
        System.out.println();



    }
}
