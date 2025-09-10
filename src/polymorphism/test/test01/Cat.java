package polymorphism.test.test01;

public class Cat extends Animal{


    @Override
    public String toString(){
        return super.getName();
    }

    @Override
    public void cry(){
        System.out.println("냐옹냐옹");
    }

    public void grooming(){
        System.out.println("핥짝핥짝");
    }

}
