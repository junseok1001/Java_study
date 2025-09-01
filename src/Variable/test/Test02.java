package variable.test;

public class Test02 {
    public static void main(String[] args) {

        //연습문제1
        int score = 90;
        char grade = 'A';
        double rating = 4.0;

        System.out.println("시험 성적이 " + score + "점 이상이면 " + grade + "학점이고 평점은" + rating + " 입니다.");

        score = 80;
        grade = 'B';
        rating = 3.0;

        System.out.println("시험 성적이 " + score + "점 이상이면 " + grade + "학점이고 평점은" + rating + " 입니다.");

        //연습문제2
        int number1 = 33;
        double number2 = 35.325;

        double result = number1 * number2;
        System.out.println("두 수의 곱 : " + result);

        //연습문제3
        int hour = 943;

        int date = hour/24;

        System.out.println(hour + "시간은" + date + "일 입니다.");


        //연습문제4

        int length = 8;
        int height = 9;

        int quard = length * height;
        double triangle = (length * height) / 2.0;
        System.out.println("사격형의 넓이 : " + quard );
        System.out.println("삼각형의 넓이 : " + triangle );

        //연습문제 5
        int Korea = 93;
        int math = 88;
        int English = 94;

        double average = (Korea + math + English) / 3.0;
        System.out.println("평균 : " + average);


        //연습문제6

        int degress = 30;
        double ferdate = 9 / 5.0 * degress + 32;

        System.out.println("섭씨" + degress + "도는 화씨 " + ferdate + "도입니다.");



    }
}
