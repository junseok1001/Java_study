package map.test.test06;

public class Goods {

    private String name;
    private int price;
    private String status;

    public Goods(String name, int price, String status){
        this.name = name;
        this.price=price;
        this.status=status;
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

    public void setStatus(String status){
        this.status=status;
    }

    public void setPrice(int price){
        this.price=price;
    }


    @Override
    public String toString(){
        return "상품명 : " + name + "상품가격 : " + price + "판매상태 : " + status;
    }




}
