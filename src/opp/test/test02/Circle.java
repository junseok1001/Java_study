package opp.test.test02;

public class Circle {

    int radios;
    double pi = 3.14;

    //객체정보 출력
    void printInfo(){
        System.out.println("반지름 : " + radios);
    }

    double circumference(){
        double result = 2 * pi * radios;

        return result;
    }

    double calculateArea(){
        double result = pi * radios * radios;

        return result;
    }

    double calculateArea(int count){
//        double result = (pi * radios * radios) * count;
        double result = calculateArea() * count;
        return result;
    }
}
