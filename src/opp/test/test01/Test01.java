package opp.test.test01;

public class Test01 {

    public static void main(String[] args) {

        Phone samsung = new Phone();
        samsung.manufactory = "갤럭시Zflip3";
        samsung.modelName = "samsung";
        samsung.phoneNumber = "010-1234-5678";

        Phone iPhone = new Phone();
        iPhone.manufactory = "iPhone16";
        iPhone.modelName = "apple";
        iPhone.phoneNumber = "010-9876-5432";

        System.out.println(samsung.manufactory + "(" + samsung.modelName + ")" + " : " + samsung.phoneNumber);
        System.out.println(iPhone.manufactory + " (" + iPhone.modelName + ")" + " : " + iPhone.phoneNumber);



        Student member1 = new Student();
        member1.name = "유재석";
        member1.age = 21;
        member1.className = "Java";
        member1.number = "010-0000-1111";

        Student member2 = new Student();
        member2.name = "이효리";
        member2.age = 23;
        member2.className = "웹 개발";
        member2.number = "010-9999-2222";

        //배열의 구조
        // 타입 이름 = new 타입[배열의 갯수];
        Student[] member = {member1, member2};

        for(int i = 0; i < member.length; i++){
            System.out.println(member[i].name + "(" + member[i].age + ") " + "수업 : "
                    + member[i].className + " " +  member[i].number);
        }



    }
}
