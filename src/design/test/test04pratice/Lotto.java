package design.test.test04pratice;

public class Lotto {

    private int[] numbers = new int[6];

    public void manual(int number1, int number2, int number3, int number4, int number5 , int number6){

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;
        numbers[3] = number4;
        numbers[4] = number5;
        numbers[5] = number6;

    }

    public int[] getNumbers(){
        return numbers;
    }

    public void printInfo(){
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }



}
