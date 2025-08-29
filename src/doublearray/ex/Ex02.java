package doublearray.ex;

public class Ex02 {

    public static void main(String[] args) {

        //이차원 배열에 값 넣기
        int[][] numbers = new int[5][6];

        for(int i = 0; i <numbers.length; i++){

            //numbers[i]
            for(int j = 0; j <numbers[i].length; j++){
//                numbers[i][j] =5;
                //열 별로 다른값 넣기
//                numbers[i][j] = j + 1;
                //행별로 다른값 넣기
                numbers[i][j] = i + 1;

            }
        }




        for(int i = 0; i < numbers.length; i++){
            //number[i]
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
