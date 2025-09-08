package design.test.newtest04;

import java.util.Random;

public class LottoChecker {

    // 당첨 번호
    private int[] winningNumbers = new int[6];

    //당첨 번호 뽑기
    public void drawLots(){
        Random random = new Random();

        for(int i = 0; i < winningNumbers.length; i++){
            //1 ~ 45
            int randomNumber = random.nextInt(45)+1;
            winningNumbers[i] = randomNumber;
            for(int j = 0; j < i; j++){
                //
                if(winningNumbers[j] == randomNumber){
                    //중복!
                    i--;
                    break;
                }
            }

        }


    }

//    public void setWinningNumber(int number1, int number2 , int number3 , int number4, int number5, int number6){
//
//        winningNumbers[0] = number1;
//        winningNumbers[1] = number2;
//        winningNumbers[2] = number3;
//        winningNumbers[3] = number4;
//        winningNumbers[4] = number5;
//        winningNumbers[5] = number6;
//
//    }

    // 당첨 개수 확인 기능
    public int checkCount(Lotto lotto){

        int[] numbers = lotto.getNumbers();
        int count = 0;
        for(int i = 0; i < winningNumbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(winningNumbers[i] == numbers[j]){
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    //당첨 정보 출력 기능
    public void printResult(Lotto lotto){
        int count = checkCount(lotto);

        switch (count){
            case 6 :
                System.out.println("1등");
                break;
            case 5 :
                System.out.println("2등");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 3:
                System.out.println("4등");
                break;
            case 2:
                System.out.println("5등");
                break;
            default :
                System.out.println("꽝");
        }
    }


    public void printInfo(){
        System.out.print("당첨번호 : ");
        for(int i = 0; i < winningNumbers.length; i++ ){
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println();
    }

}
