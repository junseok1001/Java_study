package map.test.test05;

public class Person {

    private String name;
    private int birthday;

    public Person(String name , int birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName(){
        return name;
    }

    public int getBirthday(){
        return birthday;
    }


    @Override
    public String toString(){
        return "이름 : " + name + " 생년월일 : " + birthday;
    }
}
