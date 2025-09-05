package design.test.test01;

public class Circle {

    private double radios;
    private double pi;

    void printInfo(){
        System.out.println("반지름 : " + radios);
    }

    double calculateArea(){
        double result = pi * radios * radios;
        return result;
    }

    double circumference(){
        double result = 2 * pi * radios;
        return result;
    }

    double calculateArea(int count){
        double result = calculateArea() * count;
        return result;
    }
    public Circle(int radios){
        this.radios = radios;
    }


}
