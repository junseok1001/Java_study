package design.test.test03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //선생님
        OmrCardReader reader = new OmrCardReader();
        // 선생님 -> 문제의 정답을 넣기
        boolean breakPoint = false;// 문제를 제대로 작성했는지 확인 하는 도구
        for(int i = 0; i < reader.arrayLength(); i++){
            System.out.print(i + 1 + "번 문제의 정답을 넣으시오 : ");
            int number = scan.nextInt();
            if(reader.setCorrect(i , number) == 0){
                breakPoint = true;
                System.out.println("정답이 될수 없습니다.");
                break;
            }else{
                reader.setCorrect(i , number);
            }
        }

        // 학생
        OmrCard omr = new OmrCard("오준석" , "2019143032");
        //학생이 omr 카드 작성
        for(int i = 0; i < omr.arrayLenght(); i++){
            if(breakPoint){
                System.out.println("문제의 정답이 잘못되어 있습니다. 선생님께 문의 하십쇼");
                break;
            }else{
                System.out.print(i + 1 + ". 문제의 정답이라고 생각하는 것을 고르시오 : ");
                int number = scan.nextInt();
                omr.setOmrCard(i , number);

            }
        }
        System.out.println();


        // 선생님 -> 체점하기

        int score = reader.compare(breakPoint , omr.viewomrCard());

        omr.printInfo();
        System.out.println("점수 : "+ score);


//        omr.printArray();
//        System.out.println();
//        reader.printArray();



    }
}
