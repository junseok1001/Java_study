package polymorphism.test.test01;

public class Test01 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("호두");
        animals[1] = new Cat("바다");

        for(int i = 0; i < animals.length; i++){
            for(int j = 0; j < 3; j++){
                animals[i].cry();
            }
        }

       // 다운케스팅을 안한상태
//       animals[0].wagTail();
        for(int i = 0; i <animals.length; i++){
            if(animals[i] instanceof Dog){
                Dog dog = (Dog)animals[i];
                dog.wagTail();
            }else if(animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                cat.grooming();
            }
        }











        }
    }

