package inheritance.ex.ex01;

public class Person {

    //이름, 생년월일
    // protected : 자기 자신과 자식 클래스, 같은 패키지에서 사용가능
    private String name;
    private String birthday;


//    public Person(){
//        System.out.println("Person 생성");
//    }
    public Person(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public void printInfo(){
        System.out.println("이름 : " + name + " 생년월일 : " + birthday);
    }

}
