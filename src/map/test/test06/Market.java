package map.test.test06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {


    private List<Goods> goodsList = new ArrayList<>();


//    (C: create, insert)
//
//    같은 상품명 중복 불가 → "등록된 상품이 존재합니다."
//    물품명, 가격, 판매상태를 입력받는다. (판매상태 정의된 값 외 입력 불가 → "판매상태가 유효하지 않습니다.")
    public void create(String name, int price, String status){
        Goods item = findGoods(name);

        if(item == null){
            if(isSellStatus(status)){
                goodsList.add(new Goods(name,price, status));
            }else{
                System.out.println("판매상태가 유효하지 않습니다.");
            }
        }

    }


//    (R: read, select)
//
//    비어있는 경우 → "비어있습니다"
//    상품 리스트 출력
//    물품명: oo, 가격: oo, 판매상태: 판매중
//    물품명: oo, 가격: oo, 판매상태: 예약중

    public void read(){
        if(goodsList.isEmpty()){
            System.out.println("비어 있습니다");
        }else{
            System.out.println(goodsList);
        }
    }


//    (U: update)
//
//    존재하는 상품인지 확인 → "수정할 상품이 존재하지 않습니다."
//    메서드1: 상품명으로 물품의 가격 수정 → "수정되었습니다."
//    메서드2: 상품명으로 판매상태 수정 (판매상태 정의된 값 외 입력 불가)

    public void update(){
        Scanner scan = new Scanner(System.in);
        System.out.println("모드를 선택하세요");
        System.out.println("1 : 해당 이름의 가격 수정");
        System.out.println("2 : 해당 이름의 판매상태 수정");
        int mode = scan.nextInt();
        if(mode == 1){

        }



    }

//    (D: delete)
//
//    존재하는 상품인지 확인 → "삭제할 상품이 존재하지 않습니다."
//    상품명으로 물품 삭제 → "삭제되었습니다."



    public void priceCorrection(String name, int price){
        for(Goods goods:goodsList){
            if(name.equals(goods.getName())){
                goods.setPrice(price);
                break;
            }
        }
    }

    public void statusCorrection(String name, String status){
        if(isSellStatus(status)){
            for(Goods goods:goodsList){
                if(name.equals(goods.getName())){
                    goods.setStatus(status);
                    break;
                }
            }
        }else{
            System.out.println("판매상태가 유효하지 않습니다.");
        }
    }


    public Goods findGoods(String name){
        for(Goods item:goodsList){
           if(name.equals(item.getName())){
               System.out.println("등록된 상품이 존재합니다.");
               return item;
           }
        }
        return null;
    }


    public boolean isSellStatus(String status) {
        return status.equals("판매중") || status.equals("판매완료") || status.equals("예약중");
    }
}
