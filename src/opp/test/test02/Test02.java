package opp.test.test02;

public class Test02 {

    public static void main(String[] args) {
//        1. 원
//        원을 Class로 설계하세요.
//                멤버 변수는 아래를 참조하세요.
//                반지름
//
//        메서드는 아래를 참조하세요.
//                넓이 구하기, 둘레 구하기, 개수에 따른 넓이 구하기
//
//        pi는 3.14
//
//        원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력하세요.
//
//        출력 예시
//
//        원의 넓이 : 200.96
//        원의 둘레 : 50.24
//        원 25개 넓이 : 5024.0

        //1번째 객체 생성
//        Circle circle = new Circle();
//
//        circle.radios = 8;
//
//        double dimensions = circle.calculateArea();
//        double circumference = circle.circumference();
//        double totalArea = circle.calculateArea(25);
//
//        System.out.println("원의 넓이 : " + dimensions);
//        System.out.println("원의 둘레 : " + circumference);
//        System.out.println("원 25개 넓이 :" + totalArea);









//        2. 제품 관리
//        제품 관리 Class를 설계하세요.
//        제품 관리 Class를 통해서 아래 내용을 출력하세요.
//                출력 예시
//
//        이름 : 새우깡
//        가격 : 1300
//        유통기한 : 2021-03-02
//
//        제품 5개의 가격 : 6500
//        제품 13개의 가격 : 16900
//        판매 가능 상품

        Product product = new Product();

        product.name = "새우깡";
        product.price = 1300;
        product.year = "2021";
        product.month = "03";
        product.day = "02";
        product.exprtationDate = "2021-03-02";

        product.printInfo();

        System.out.println("제품 5개의 가격 : " + product.totalPrice(5));

        System.out.println("제품 13개의 가격 : " + product.totalPrice(13));

        product.periodComparsion("2025","09","03");

        if(product.available("2025-09-03")){
            System.out.println("판매 가능 상품");
        }else{
            System.out.println("판매 불가능 상품");
        }




    }
}
