package abstracts.ex;

// 추상메서드를 하나 이상 가진 클래스는 추상 클래스가 되어야한다.
public abstract class Animal {

    //먹이를 먹는 기능
    public void eat(){
        System.out.println("냠냠");
    }

    // 해당 클래스를 상속 받는 클래스에서 구현하기를 희망해서 메서드를 정의하는경우
    //울을음 우는 기능
    public abstract void cry();
}
