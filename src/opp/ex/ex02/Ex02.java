package opp.ex.ex02;

public class Ex02 {

    public static void main(String[] args) {

        // 직사각형
        //큰 사각형, 작은 사각형
        Rectangle big = new Rectangle(); // 객체 생성
        big.width = 58;
        big.height = 84;

        Rectangle small =  new Rectangle(); // 객체 생성
        small.width = 4;
        small.height = 7;

        // 사각형의 넓이
        int area = big.calculateArea();
        System.out.println("큰 사각형의 넓이는 : " + area);
        System.out.println("작은 사각형의 넓이는 : " + small.calculateArea());

        //큰 사각형 7개의 넓이
        System.out.println("큰사각형 7개의 넓이 : " + big.calculateArea(7));


        small.printInfo();

    }
}
