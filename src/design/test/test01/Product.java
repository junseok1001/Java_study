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
        String[] expiration = exprtationDate.split("-"); // 유통기한 배열
        int exYear = Integer.parseInt(expiration[0]);
        int exMonth = Integer.parseInt(expiration[1]);
        int exDay = Integer.parseInt(expiration[2]);
        String[] now = nowdate.split("-"); // 현재 날짜 배열
        int year = Integer.parseInt(now[0]);
        int month = Integer.parseInt(now[1]);
        int day = Integer.parseInt(now[2]);


        //년도 먼저 비교
        if(exYear == year || exYear < year){
            // 월 비교
            if(exMonth == month || exMonth < month){
                // 날 비교
                if(exDay <= day){
                    return false;
                }
            }
        }
        return true;

    }
}
