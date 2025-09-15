package list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("새우깡" , 1200, 150));
        productList.add(new Product("육개장" , 850 , 30));
        productList.add(new Product("신라면" , 800 , 15 ));
        productList.add(new Product("천마표팝콘" , 1500 , 0));


        System.out.println(productList.get(0));
        System.out.println(productList.get(1));
        System.out.println(productList.get(2));
        System.out.println(productList.get(3));



        //
        // 리스트에 저장될때 () 추가해서 저장을 시킨다?









        // 제품 제거
        Iterator<Product> iter = productList.iterator();
        while(iter.hasNext()){
            Product product = iter.next();

            if(product.getItem() == 0){
                iter.remove();
            }
        }
        System.out.println(productList);
        System.out.println();


        //제품 판매
        Scanner scan = new Scanner(System.in);
        System.out.print("상품명 : ");
        String name = scan.nextLine();
        System.out.print("개수 : ");
        int item = scan.nextInt();

        int price = 0;
        for(Product product:productList){
            String productName = product.getName();
            int productItem = product.getItem();
            int productPrice = product.getPrice();

            if(productName.equals(name)){
                price = productPrice * item;
                product.reduceStock(item);
                break;
            }
        }
        System.out.println("가격 : " + price + "원");
        System.out.println(productList);



        //재고관리
        iter = productList.iterator();
        while(iter.hasNext()){
            Product product = iter.next();
            int productItem = product.getItem();

            if(productItem <= 30){
                System.out.println(product);
            }

        }
























    }
}
