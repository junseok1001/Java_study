package design.test.test02;

public class Student {

    private String name;
    private String school;
    private String phoneNumber;
    private String lesson;

    public Student(String name , String school , String phoneNumber, String lesson){
        this.name = name;
        this.school = school;
        this.phoneNumber = phoneNumber;
        this.lesson = lesson;
    }

    public void printInfo(){
        System.out.println(lesson + " : " + school + " " + name + "학생");
    }

    public void setSchool(String school){
        this.school = school;
        System.out.println(name + "학생의 학교가 " + this.school + "로 변경 되었습니다.");
    }

    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String sendMessage(String message){
        String send = name+ "학생에게 (" + phoneNumber + ")" + message + " 메세지를 전송합니다.";
        return send;
    }








}
