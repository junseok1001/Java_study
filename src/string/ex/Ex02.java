package string.ex;

public class Ex02 {
    public static void main(String[] args) {

        // 숫자가 저장된 문자열
        String numberString1 = "30";
        String numberString2 = "20";

        System.out.println(numberString1 + numberString2);

        // 문자열 -> 정수
        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);

        System.out.println(number1 + number2);


        //정수 -> 문자열
        //방법1
        int number3 = 100;
        int number4 = 200;

        String numberString3 = String.valueOf(number3);
        String numberString4 = String.valueOf(number4);

        System.out.println(numberString3 + numberString4);
        //방법2
        String numberString5 = number3 + "";
        String numberString6 = number4 + "";

        System.out.println(numberString5 + numberString6);

        //문자열 비교
        String word1 = "고양이";
        String word2 = "고양이";

        if(word1 == word2){
            System.out.println("두 단어는 같다!");
        }

        if(word1 == "고양이"){
            System.out.println("두 단어는 같아22222");
        }

        String word3 = new String("고양이");

        System.out.println(word3);

        if(word1 == word3){
            System.out.println("두 단어는 같다 33333");
        }

        if(word1.equals(word3)){
            System.out.println("두 단어는 같다444");
        }

    }
}
