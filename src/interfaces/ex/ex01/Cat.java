package interfaces.ex.ex01;

public class Cat implements Animal{

    @Override
    public void eat(){
        System.out.println("냠냠");
    }

    @Override
    public void cry(){
        System.out.println("야옹");
    }

    // 구루밍 기능
    public void grooming(){
        System.out.println("핥짝핥짝");
    }
}
