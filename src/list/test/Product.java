package list.test;



public class Product  {

    private String name;
    private int price;
    private int item;


    public Product(String name, int price , int item){
        this.name = name;
        this.price = price;
        this.item = item;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }


    public int getItem(){
        return item;
    }

    public void setItem(int item){
        this.item = item;
    }


    //재고 개수 감소 기능
    public void reduceStock(int count){
        item -= count;
    }



    @Override
    public String toString(){
        return "(제품명 : " + this.name + " 가격 : " + this.price + " 재고 : " + item  + ")";
    }



}
