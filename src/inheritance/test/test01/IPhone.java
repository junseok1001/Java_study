package inheritance.test.test01;

public class IPhone extends IPodTouch{
//    apple - iPhone 부모
//    전화 번호 : 010-1234-5678 자식
//    https://www.google.com 로딩중... 부모
//    로딩 완료 부모
//010-000-0000 로 통화 중 자식
//010-1111-2222 로 ㅋㅋㅋㅋ 전송 자식

    private String phoneNumber;

    public IPhone(String phoneNumber){
        //super(); 생략하고 가져옴.
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String infoString(){
        return super.infoString() + "\n" + this.phoneNumber;
    }



    public void calling(String number){
        System.out.println(number + "로 통화 중");
    }

    public void sendMassage(String number , String content){
        System.out.println(number + " 로 " + content + " 전송");
    }












}
