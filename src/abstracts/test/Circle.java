package abstracts.test;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return radius * radius * 3.14;
    }

    @Override
    public double calculateRound(){
        return 2 * radius * 3.14;
    }

    @Override
    public void printStatus(){
        System.out.println("원넓이 " + calculateArea() + " 둘레 " + calculateRound());
    }

}
