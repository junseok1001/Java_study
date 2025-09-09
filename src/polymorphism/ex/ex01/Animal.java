package polymorphism.ex.ex01;

public class Animal {

    //이름
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // 먹이를 먹는 기능
    public void eat(){
        System.out.println("냠냠");
    }

    //우는기능
    public void cry(){

    }


}
