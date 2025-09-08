package inheritance.test.test01;

public class Test01 {

    public static void main(String[] args) {
        IPhone phone = new IPhone("010-1234-5678");

        phone.setModel("iphone");

        System.out.println(phone.infoString());
        phone.internetBrowsing("https://www.google.com");
        phone.calling("010-1111-2222");
        phone.sendMassage("010-1111-2222", "ㅋㅋㅋㅋㅋ");
    }


}
