package opp.ex.ex01;

public class Ex01 {
    public static void main(String[] args) {


        //과목이름, 성적, 석차
        // 객체 생성
        SocreDate korean =  new SocreDate(); // 타입 변수 = new 클래스 이름; -> 객체 생성
        korean.subject = "국어";
        korean.score = 80;
        korean.ranking = 12;

        SocreDate english = new SocreDate();
        english.subject = "영어";
        english.score = 90;
        english.ranking = 8;

        // 국어 점수 : 80 석차 : 12
        System.out.println(korean.subject + "점수 : " + korean.score + " 석차 : " + korean.ranking);
        System.out.println(english.subject + "점수 : " + english.score + " 석차 : " + english.ranking);







    }
}
