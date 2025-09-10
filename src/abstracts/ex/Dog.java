package abstracts.ex;

public class Dog extends Animal{

    // 부모클래스의 추상메서드는 필수로 구현
    @Override
    public void cry(){
        System.out.println("멍멍!");
    }

    public void wagTail(){
        System.out.println("흔들흔들");
    }
}
