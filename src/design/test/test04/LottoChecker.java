package design.test.test04;

import java.util.Random;

public class LottoChecker {

    private int[] getLotto = new int[6];
    Random random = new Random();

    public void printInfo(){
        for(int i = 0; i < getLotto.length; i++){
            System.out.print(getLotto[i] + " ");
        }
        System.out.println();
    }


    public void luckyLotto(){
        for(int i = 0; i < getLotto.length; i++){
            int number = random.nextInt(6)+1;
            boolean stopPoint = false;

            for(int j = 0; j < i; j ++){
                if(getLotto[j] == number){
                    stopPoint = true;
                    break;
                }
            }
            if(stopPoint){
                i--;
            }else{
                getLotto[i] = number;
            }
        }
    }

    Lotto paper = new Lotto();

    public void comparePaper(){
        int count = 0;
        for(int i = 0; i < getLotto.length; i++ ){
            if(getLotto[i] == paper.checkLotto(i)){
                count++;
            }
        }
        int rank = 0;
        switch(count){
            case 6 :
                rank = 1;
               break;
            case 5 :
                rank = 2;
                break;
            case 4 :
                rank = 3;
                break;
            case 3 :
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            default :
                rank = 0;
        }

        if(rank == 0){
            System.out.println("꽝입니다.");
        }else{
            System.out.println(rank + "등 입니다.");
        }

    }

}
