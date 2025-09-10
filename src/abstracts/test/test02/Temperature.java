package abstracts.test.test02;

public class Temperature extends ChangeUnit{

    private double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    @Override
    public String toString(){
        return "섭씨 : " + celsius;
    }

    @Override
    public void printResult(){
        System.out.println("섭씨 : " + celsius + " -> 화씨 : " + changer());
    }

    @Override
    public double changer(){
        return 1.8 * celsius + 32;
    }
}
