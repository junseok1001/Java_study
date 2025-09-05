package design.test.test03;

public class OmrCardReader {

    private int[] totalQuestion = new int[5];
    private int count;


    public OmrCardReader(){}

    //해당 인수 출력
    public void printInfo(){
        System.out.println("총문제 : " + totalQuestion);

        for(int i = 0; i < totalQuestion.length; i++){
            System.out.println(i + "번째 문제 정답 : " + totalQuestion[i] + " ");
        }
    }

    public int arrayLength(){
        return this.totalQuestion.length;
    }

//    public void printArray(){
//        for(int i = 0; i < totalQuestion.length; i++){
//            System.out.println(this.totalQuestion[i]);
//        }
//    }


    //배열에다가 정답 넣기
    public int setCorrect(int i , int number){
        if(number < 6 && number > 0){
            return this.totalQuestion[i] =number;
        }
        return 0;
    }

    // 정답 비교해서 점수내기
    // 포인트를 이용하여 omr 에 1~5말고 다른 것을 칠했을때 그냥 0점 처리
    // 포인트를 이용하여 omr 정상적일때 비교 시작
    OmrCard omr = new OmrCard("선생님" , "10101010");
    public int compare(boolean point, int[] compareArray){
        if(point == false){
            for(int i = 0; i < totalQuestion.length; i++){
                if(totalQuestion[i] == compareArray[i]){
                    this.count++;
                }
            }
        }else{
            return count = 0;
        }
        return count * (100 / totalQuestion.length);
    }



}
