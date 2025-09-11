package interfaces.ex.ex01;

public class Ex01 {
    public static void main(String[] args) {

        //인터페이스는 객체를 생성을 못한다.
        // new Animal();
        Cat cat = new Cat();
        cat.eat();
        cat.cry();
        cat.grooming();

        //인터페이스도 업케스팅으로 구현 할수있다.
        Animal animal = cat;
        animal.eat();
        animal.cry();
//        animal.grooming(); 불가능함.

    }
}
