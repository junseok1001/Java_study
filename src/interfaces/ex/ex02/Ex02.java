package interfaces.ex.ex02;

public class Ex02 {
    public static void main(String[] args) {

        // 취업 공고 회사
        Naver naver = new Naver("네이버", 2912, 2001);
        naver.introduce();

        // 지원자
         JobApplicant applicant= new JobApplicant("오준석" , 3.5, 26);
         applicant.introduce();

         naver.recruitJavaProgrammer(applicant);
    }
}
