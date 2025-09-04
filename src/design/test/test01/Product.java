package design.test.test01;

public class Product {

    private String goods;
    private int price;
    private String exprtationDate;

    public Product(String goods, int price, String exprtationDate){
        this.goods = goods;
        this.price = price;
        this.exprtationDate = exprtationDate;
    }

    public void printInfo(){
        System.out.println("상품의 이름 : " + goods);
        System.out.println("가격 : " + price);
        System.out.println("유통기한 : " + exprtationDate);
    }
    public int totalPrice(int count) {
        int result = price * count;

        return result;
    }

    boolean available(String nowdate) {
        String[] now = new String[nowdate.length()];
        now = nowdate.split("-"); // 현재 날짜 배열
        String[] expiration = new String[exprtationDate.length()];
        expiration = exprtationDate.split("-"); // 유통기한 배열


        //년도 먼저 비교
        if (Integer.parseInt(expiration[0]) <= Integer.parseInt(now[0])) {
            //월 비교
            if (Integer.parseInt(expiration[1]) <= Integer.parseInt(now[1])) {
                //일 비교
                if (Integer.parseInt(expiration[2]) <= Integer.parseInt(now[2])) {
                    return false;
                }
            }
        }
        return true;
    }
}
