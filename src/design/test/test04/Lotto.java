package design.test.test04;

import java.util.Random;

public class Lotto {

    private int[] luckyNumber = new int[6];

    public Lotto(){

    }

    //수동 로또 만들때              0              1           2              3            4           5
    public void passiveLotto(int number1 , int number2, int number3, int number4, int number5, int number6){
        //첫번째
        if(number1 > 0 && number1 <46){
            luckyNumber[0] = number1;
        }else{
            System.out.println("첫번째 숫자를 입력할수 없습니다.");
        }
        //두번째
        if(number2 > 0 && number2 <46){
            luckyNumber[1] = number2;
        }else{
            System.out.println("두번째 숫자를 입력할수 없습니다.");
        }
        //세번째
        if(number3 > 0 && number3 <46){
            luckyNumber[2] = number3;
        }else{
            System.out.println("세번째 숫자를 입력할수 없습니다.");
        }
        //네번째
        if(number4 > 0 && number4 <46){
            luckyNumber[3] = number4;
        }else{
            System.out.println("네번재 숫자를 입력할수 없습니다.");
        }
        //다섯번째
        if(number5 > 0 && number5 <46){
            luckyNumber[4] = number5;
        }else{
            System.out.println("다섯번째 숫자를 입력할수 없습니다.");
        }
        //여섯번째
        if(number6 > 0 && number6 <46){
            luckyNumber[5] = number6;
        }else{
            System.out.println("여섯번째 숫자를 입력할수 없습니다.");
        }

    }
    Random random = new Random();
    //자동 로또 만들때

    // 중복하는걸 어떻게 확인하지?
    // 이건 내꺼 아닌듯... 좀 여러 도움들을 많이 받아서....
    //다시 확인해보기
    public void autoLotto(){
        for(int i = 0; i < luckyNumber.length; i++){
            int number = random.nextInt(6)+1;
            boolean stopPoint = false;

            for(int j = 0; j < i; j ++){
                if(luckyNumber[j] == number){
                    stopPoint = true;
                    break;
                }
            }
            if(stopPoint){
                i--;
            }else{
                luckyNumber[i] = number;
            }

        }
    }

    public int checkLotto(int i){
        return luckyNumber[i];
    }

    public void printInfo(){
        for(int i = 0; i < luckyNumber.length; i++){
            System.out.print(luckyNumber[i] + " ");
        }
        System.out.println();
    }
}
