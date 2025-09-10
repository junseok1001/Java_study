package polymorphism.test.test02;

public class Rectangle extends Shape{

    //가로 세로
    private int width;
    private int height;

    public Rectangle(int width, int height){
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "밑변 : " + width + "높이 : " + height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public void printArea(){
        System.out.println("사각형의 넓이는 " + calculateArea() + "cm^2 입니다.");
    }


}
