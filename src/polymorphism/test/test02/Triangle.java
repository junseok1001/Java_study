package polymorphism.test.test02;

public class Triangle extends Shape {

    //밑변 , 높이
    private int width;
    private int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "밑변 : " + width + "높이 : " + height;
    }


    @Override
    public double calculateArea(){
        return (width * height)/2.0;
    }

    @Override
    public void printArea(){
        System.out.println("삼각형의 넓이는 " + calculateArea() + "cm^2 입니다.");
    }

}
