package abstracts.test.test02;

public class CmToInch extends ChangeUnit {
    private double centimeter;

    public CmToInch(double centimeter){
        this.centimeter = centimeter;
    }

    @Override
    public double changer(){
        return centimeter / 2.54;
    }

    @Override
    public void printResult(){
        System.out.println(centimeter + "cm -> " + changer() + "inch");
    }
}
