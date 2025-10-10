package map.test.test06;

public class Test06 {
    public static void main(String[] args) {

        Market market = new Market();

        market.create("오준석", 10000, "판매중");
        market.create("오준석", 10000, "판매중");
        market.create("이수진", 10000, "판매중");
        market.read();

        market.updatePrice("오준석", 20000);
        market.read();

        market.delete("이수진");
        market.read();



    }


}
