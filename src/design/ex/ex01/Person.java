package design.ex.ex01;

public class Person {

    // 이름, 생년월일
    // 접근 제어자
    // private : 해당 클래스 내에서만 사용 가능.
    private String name;
    private String birthday;

    // 생성자
    // 객체를 생성할때 호출하는 특수한 형태의 메서드
    // 생성자가 직접 만들어지면 기본 생성자는 사라진다.
//    public Person(){
//        System.out.println("생성");
//    }
    Person(String name , String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    //객체 정보 출력 기능
    //public : 모든곳에서 사용 가능
    void printInfo() {
        System.out.println("이름 : " + name + " 생년월일 : " + birthday);

    }
}
