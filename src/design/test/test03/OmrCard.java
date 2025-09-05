package design.test.test03;

public class OmrCard {

    private String student; // 학생
    private String studentId; // 학번
    private int[] answer = new int[5]; // omr

    public OmrCard(String student, String studentId){
        this.student = student;
        this.studentId = studentId;
    }
    // omr에 색칠하기
    public int setOmrCard(int i , int number){
        if(number < 6 && number > 0){
            return this.answer[i] = number;
        }
        return 0;
    }

//    public void printArray(){
//        for(int i = 0; i < answer.length; i++){
//            System.out.println(this.answer[i]);
//        }
//    }

    public int[] viewomrCard(){
           return answer;
    }

    public int arrayLenght(){
        return this.answer.length;
    }

    public void printInfo(){
        System.out.println("이름 : " + student);
        System.out.println("학번 : " + studentId);
    }


}
