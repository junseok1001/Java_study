package string.test;

import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
//        1. 문자열 변환
//        아래 문자열에서 A를 B로 바꿔서 출력하세요.
//        String gradeString = "My grade is A";
//        출력 예시
//
//        My grade is B
        //답 :
//        String gradeString = "My grade is A";  // 원본
//        String newgradeString = gradeString.replace("A", "B"); // 임시저장
//        System.out.println(newgradeString); // 임시 저장값 확인

//        2. 문자열 자르기
//        아래와 같이 전화번호가 저장되어 있을 때 출력 예시와 같은 형태로 -를 포함하여 출력하세요.
//        String phoneNumber = "01012345678";
//        출력 예시
//
//        010-1234-5678
        //답 :
//        String phoneNumber = "01012345679";
//        String startNumber = phoneNumber.substring(0 , 3);
//        String midleNumber = phoneNumber.substring(3, 7);
//        String endNumber = phoneNumber.substring(7);
//
//        System.out.println(startNumber + "-" + midleNumber + "-" + endNumber);



//        3. 문자열 정수 변환
//        아래와 같이 생년월일이 저장된 String이 있을 때 올해 나이를 출력하세요 (한국 나이)
//        String birthString = "19950721";
//        출력 예시
//
//        1995년생의 나이는 29살

        //답 :
//        String birthString = "19950721";
//        String year = birthString.substring(0 , 4);
//        int number = Integer.parseInt(year);
//        int age = (2025 - number) + 1;
//
//        System.out.println(year);
//        System.out.println(year + "년생의 나이는 " + age );


//        4. 문자열 검색
//        영어 단어를 입력받고 'e'가 몇 개 들어 있는지 출력하세요.
//        입력 예시
//
//        단어를 입력하세요 : elephant
//        출력 예시
//
//        e의 개수는 2개 입니다.
//        // 배열로 풀었을때
        Scanner scan = new Scanner(System.in);
//        System.out.println("단어를 입력하세요 : ");
//        String word = scan.nextLine();
//        String[] alphabet = new String[word.length()];
//        int count = 0;
//
//        //배열로 저장
//        for(int i = 0; i < alphabet.length; i++){
//            String save = "";
//            alphabet[i] = word.substring(0 , 1);
//             save = save + word.substring(1 );
//             word = word.replace(word, save);
//        }
//        // 알파벳 갯수 새기
//        for(int i = 0; i < alphabet.length; i++){
//            if(alphabet[i].equals("e")){
//                count++;
//            }
//        }
//
//        System.out.println("e의 개수는" + count + "입니다.");

        //charAt 사용
        System.out.print("단어를 입력하세요 : ");
        String word = scan.nextLine();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)== 'e'){
                count++;
            }
        }
        System.out.println("e 의 개수는 " + count + "개 입니다.");

//        5. 단어 수 세기
//        아래 문자열의 단어 개수를 출력하세요. (중복 포함)
//        String sentence = "To be, or Not to Be. That Is The Question";
//        출력 예시
//
//        단어 개수 : 10

        String sentence = "To be, or Not to be. That Is The Question";
        String [] words = sentence.split(" ");


        System.out.println("단어의 개수 : " + words.length);



    }
}
