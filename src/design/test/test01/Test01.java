package design.test.test01;

public class Test01 {
    public static void main(String[] args) {

        //문제 1
        Circle oShape = new Circle(8);

        double area = oShape.calculateArea();
        double permiter = oShape.circumference();

        System.out.println("원의 넓이는 : " + area);
        System.out.println("원의 둘레는 : " + permiter);
        System.out.println("원 25개의 넓이는 : " + oShape.calculateArea(25));

        //문제 2
        Product product = new Product("새우깡", 1300, "2021-03-02");

        product.printInfo();

        System.out.println("5개의 가격 : " + product.totalPrice(5));
        System.out.println("13개의 가격 : " + product.totalPrice(13));

        if(product.available("2019-12-02")){
            System.out.println("판매 가능 상품");
        }else{
            System.out.println("판매 불가능 상품");
        }
    }

}
