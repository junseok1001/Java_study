package doubleloop.ex;

public class Ex01 {

    public static void main(String[] args) {

        // 벤치 프레스 3 세트 5회
        for(int i = 0; i < 3; i ++){
            //5회 반복
            for(int j = 0; j < 5; j ++){
                System.out.print("으!쌰! ");
            }
            System.out.println();
        }

        // 1세트 1개째 .....1 세트 5개째
        // 2세트 1개째 ... 2세트 5개째
        // 3세트 1개째 ... 3세트 5개째

        for(int i = 1; i <= 3; i++){
            for(int j = 1 ; j <= 5; j++){
                System.out.println(i+ "세트 " + j + "개째 ");
            }
            System.out.println();
        }

        // ****
        // ****
        // ****
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
