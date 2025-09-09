package polymorphism.test.test01;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public String toString(){
        return super.getName();
    }

    @Override
    public void cry(){
        System.out.println("멍멍");
    }

    public void wagTail(){
        System.out.println("꼬리 흔들흔들");
    }
}
