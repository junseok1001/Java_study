package variable.test;

public class Test01 {
    public static void main(String[] args) {

//        이름 : 김인규 나이 : 30
//
//        3 + 5 = 8
//
//        3 - 5 =  -2
//
//        5 X 1 = 5
//        5 X 2 = 10
//        5 X 3 = 15
//        5 X 4 = 20
//        5 X 5 = 25

        //연습문제 1
        int age = 26;
        System.out.println("이름 : 오준석 나이 : "+ age);
        System.out.println();// 공백 표현

        int number1 = 3;
        int number = 5;

        int sum =  number1 + number;
        int minus = number1 - number;
        System.out.println(number1 + "+" + number + "=" + sum);
        System.out.println(); // 공백 표현
        System.out.println(number1 + "-" + number + "=" + minus);
        System.out.println(); // 공백 표현


        System.out.println( number + " X 1 = " + (number * 1));
        System.out.println( number + " X 2 = " + (number * 2));
        System.out.println(number + " X 3 = " + (number * 3));
        System.out.println( number + " X 4 = " + (number * 4));
        System.out.println(number + " X 5 = " + (number * 5));

    }
}
