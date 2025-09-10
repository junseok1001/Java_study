package abstracts.test.test01;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this. width = width;
        this. height = height;
    }


    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculateRound(){
        return (width * 2.0) + (height * 2.0);
    }

    @Override
    public void printStatus(){
        System.out.println("사각형넓이 " + calculateArea() + " 둘레 " + calculateRound());
    }


}
