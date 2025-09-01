package variable.ex;


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 츄파츕스 가격을 입력 받고
        // 3개의 가격을 출력하는 기능
        System.out.println("츄파춥스 가격을 일력하세요");
        int candy = scan.nextInt();

        int total = candy * 3;

        System.out.println("츄파춥스 3개의 가격 : " + total + "원");

        //츄파춥스 가격과 개수를 입력 받고
        //가격을 출력하는 기능
//        System.out.println("츄파춥스 가격을 입력하세요");
//        candy = scan.nextInt();
//        System.out.println("개수를 입력하세요");
//        int count = scan.nextInt();

        System.out.println("츄파춥스 가격과 개수를 입력하세요");
        candy = scan.nextInt();
        int count = scan.nextInt();

        System.out.println("츄파춥스" + count + "개의 가격은 " +  (candy * count) + "원 입니다.");


    }
}
