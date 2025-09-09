package polymorphism.test.test01;

public class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void eat(){
        System.out.println("냠냠");
    }

    public void cry(){

    }
}
