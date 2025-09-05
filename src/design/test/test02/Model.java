package design.test.test02;

public class Model {

    private String maker;
    private String model;
    private String searealNumber;
    private String phoneNumber;

    public Model(String maker, String model, String searealNumber){
        this.maker = maker;
        this.model = model;
        this.searealNumber = searealNumber;
    }

    void printInfo(){
        System.out.println(maker + "에서 제조된" + model + "입니다.");
        System.out.println("전화 번호 : " + phoneNumber);
        System.out.println("일련 번호 : " + searealNumber);
    }

    public String setPhoneNumber(String phoneNumber){
        return this.phoneNumber = phoneNumber;
    }

    public void callOtherPhone(String otherPhone){
        System.out.println(otherPhone + " 로 전화를 겁니다 뚜르르르르.....");
    }
    public void sendMessage(String otherPhoneNumber, String messageContent){
        System.out.println(otherPhoneNumber + "로 " + "\"" + messageContent + "\" " +" 메시지를 전송합니다.");
    }

}
