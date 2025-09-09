package polymorphism.ex.ex01;

public class Cat extends Animal {


    public Cat(String name){
        super(name);
    }

    //그루밍
    public void grooming(){
        System.out.println("할짝할짝");
    }

    // 우는 기능
    @Override
    public void cry(){
        System.out.println("야옹");
    }

    @Override
    public String toString(){
        return "우리 고양이 : " + getName();
    }


}
