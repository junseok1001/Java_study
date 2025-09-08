package design.test.newtest04;

import java.util.Random;

public class Lotto {
    //차근 차근 해보자
    //선택된 6개의 숫자
    private int[] numbers = new int[6];

    // 수동 선택
    public void manual(int number1, int number2, int number3, int number4, int number5 , int number6){

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;
        numbers[3] = number4;
        numbers[4] = number5;
        numbers[5] = number6;

    }

    public void auto(){
        Random random = new Random();

        for(int i = 0; i < numbers.length; i++){
            //1 ~ 45
            int randomNumber = random.nextInt(45)+1;
            numbers[i] = randomNumber;
            for(int j = 0; j < i; j++){
                //
                if(numbers[j] == randomNumber){
                    //중복!
                    i--;
                    break;
                }
            }

        }
    }

    //배열을 가져오는 기능을 만들자
    public int[]getNumbers(){
        return numbers;
    }

    public void printInfo(){
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
