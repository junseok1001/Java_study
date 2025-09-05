package opp.test.test02;

public class Product {
    String name;
    int price;
    String year;
    String month;
    String day;
    String exprtationDate;

    //객체 정보 출력기능
    void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("유통기한 : " + year + "-" + month + "-" + day);
    }

    int totalPrice(int count) {
        int result = price * count;

        return result;
    }

    //now보다 모두가 작으면 판매가능 상품
    //now보다 어느 한개라도 넘어가면 판매불가 상품.
    //각자리를 그냥 인수로 받는경우
    void periodComparsion(String nowYear , String nowMonth , String nowDay){
        if(Integer.parseInt(nowYear) <= Integer.parseInt(year)){
            if(Integer.parseInt(nowMonth) <= Integer.parseInt(month)){
                if(Integer.parseInt(nowDay) <= Integer.parseInt(day)){
                    System.out.println("판매 불가능 상품");
                }// 2025 >= 2021
            }
        } else{
            System.out.print("판매 가능 상품");
        }
    }
    //문자열로 받은 걸 인수들로 쪼개고 비교
    boolean available(String date) {

        // 앞에 것이 더크다 (1)
        // 같다 (0)
        // 뒤에 것이 더크다 (-1)
        if(exprtationDate.compareTo(date) >= 0) {// return 값 = int {
            return true;
        }else{
            return false;
        }


//        int expirationInt = Integer.parseInt(exprtationDate.replace("-" , ""));
//        int dateInt = Integer.parseInt(date.replace("-", ""));
//
//        if(expirationInt >= dateInt){
//            return true;
//        }else{
//            return false;
//        }

//        String[] words = new String[3];
//        words = date.split("-");
//        String[] line = new String[3];
//        line = exprtationDate.split("-");
//
//
//        if(Integer.parseInt(words[0]) <= Integer.parseInt(line[0])){
//            if(Integer.parseInt(words[1]) <= Integer.parseInt(line[1])){
//                if(Integer.parseInt(words[2]) <= Integer.parseInt(line[2])){
//                    return false;
//                }
//            }
//        }
//        return true;
    }


}
