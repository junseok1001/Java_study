package list.test;

import java.util.ArrayList;
import java.util.List;

public class Compare {



    private int max;
    private int maxIndex;

    public int maxi(List<Integer> numberList){
        // max
        this.max = numberList.get(0);
        maxIndex = 0;
        for(int i = 1; i < numberList.size(); i++){
            int number = numberList.get(i);

            if(this.max < number){
                this.max = number;
                this.maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getMaxIndex(){
        return this.maxIndex;
    }

    private int min;
    private int minIndex;

    public int mini(List<Integer> numberList){

        for(int i = 1; i < numberList.size(); i++){
            int number = numberList.get(i);
            min = numberList.get(0);
            minIndex = 0;
            if(this.min > number){
                this.min = number;
                this.minIndex = i;
            }
        }
        return minIndex;
    }

    public int getMinIndex(){
        return this.maxIndex;
    }



}
