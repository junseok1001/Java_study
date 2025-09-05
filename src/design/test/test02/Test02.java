package design.test.test02;

public class Test02 {

    public static void main(String[] args) {
        //연습문제 1
        Student student = new Student("오준석", "낙성대학교" , "010-0000-1111" , "java 수업");

        student.printInfo();

        student.setSchool("첨성대학교");

//        String name = student.getName();
//        String phoneNumber = student.getPhoneNumber();

//        System.out.println(name+"학생에게" + "(" + phoneNumber + ")" + "수업일정 메세지를 전송합니다.");
//        System.out.println(name+"학생에게" + "(" + phoneNumber + ")" + "잘하자! 메세지를 전송합니다.");
        System.out.println(student.sendMessage("수업일정")); //일정 보내기
        System.out.println(student.sendMessage("잘하자 !")); //메세지 내용 보내기

        System.out.println();
        //고급문제 2
        Model phone = new Model("삼성", "Galaxy" , "1234567890");


        phone.setPhoneNumber("010-1111-2222");

        phone.printInfo();

        phone.callOtherPhone("010-0000-9999");
        phone.sendMessage("010-1234-5678" , "자니?");

    }
}
