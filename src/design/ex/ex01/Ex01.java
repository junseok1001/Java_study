package design.ex.ex01;

public class Ex01 {

    public static void main(String[] args) {

        Person me = new Person("오준석" , "20041203");

//        me.name = "20010512 ";
//        me.birthday = "오준석";

        me.printInfo();

        //개명
//        me.name = "김진우";
        me.setName("김진우");

        me.printInfo();

        //생년월일 출력
//        System.out.println(me.birthday);
        System.out.println(me.getBirthday());

    }
}
