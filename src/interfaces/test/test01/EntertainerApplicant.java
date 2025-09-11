package interfaces.test.test01;

public class EntertainerApplicant implements Action, Sing {

    //이름 나이
    private String name;
    private int age;

    public EntertainerApplicant(String name , int age){
        this.name = name;
        this.age = age;
    }


    public void introduce(){
        System.out.println("안녕하세요 제 이름은 : " + name + "나이는 : " + age);
    }

    @Override
    public void singing(){
        System.out.println("발라드, 힙합, R&B");
    }

    @Override
    public void act(){
        System.out.println("기쁨, 슬픔, 열광 , 희열");
    }

}
