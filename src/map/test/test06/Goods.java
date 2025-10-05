package map.test.test06;

public class Goods {

    private String name;
    private int price;
    private String status;

    public Goods(String name, int price, String status){
        this.name = name;
        this.price=price;
        if(status.equals("판매중")){
            this.status = status;
        }else if (status.equals("판매 완료")){
            this.status = status;
        }else if(status.equals("예약중")){
            this.status = status;
        }else{
            System.out.println("판매상태가 유효하지 않습니다.");
            this.status = null;
        }
    }


    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getStatus(){
        return status;
    }


    @Override
    public String toString(){
        return "상품명 : " + name + "상품가격 : " + price + "판매상태 : " + status;
    }




}
