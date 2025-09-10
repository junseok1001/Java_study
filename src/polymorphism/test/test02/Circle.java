package polymorphism.test.test02;

public class Circle extends Shape{

    // 반지름
    private int radius;
    private double pi = 3.14;

    public Circle(int radius){
        super(0);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "반지름 : " + radius;
    }


    @Override
    public double calculateArea(){
        return pi * (radius * radius);
    }

    @Override
    public void printArea(){
        System.out.println("원의 넓이는 " + calculateArea() + "cm^2 입니다.");
    }

}
