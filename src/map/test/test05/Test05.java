package map.test.test05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

//        1. List 입력, 출력, 삭제 하기
//        List 입력, 출력, 삭제 하기
//
//        Person 클래스 멤버변수
//        이름(String), 생년월일(int)
//
//        1 : 입력
//        2 : 출력
//        3 : 삭제
//        4 : 종료
//
//        무한 루프를 돌고, 4번을 누르면 입력 종료
//        1 : 입력: 이름과 생년월일을 입력받아서 Person 객체를 생성하고 List에 넣는다.
//        2 : 출력: Person 객체가 있으면 출력하고, 아무것도 없을 경우 "비어있습니다."라고 출력한다.
//        3 : 삭제: "삭제할 사람 이름을 입력하세요:"를 출력하고 이름이 일치하는 Person 객체를 삭제한다. (Iterator 사용)
//        4 : 종료: "종료합니다."를 출력한 후 프로그램을 종료시킨다.
//
//        1~4 이외의 값을 입력받으면 "잘못 입력했습니다."를 출력한다.
        List<Person> personList = new ArrayList<>();
        while(true) {
            System.out.println("1 : 입력 ");
            System.out.println("2 : 출력 ");
            System.out.println("3 : 삭제 ");
            System.out.println("4 : 종료 ");

            Scanner scan = new Scanner(System.in);
            int select = scan.nextInt();



            switch (select) { // case 가 1일때 그냥 1전체가 실행됌 즉 중간에 내가 원하는 값을 못넣음
                case 1:
                    System.out.println("이름을 입력하세요");
                    System.out.println("생년월일을 입력하세요");
                    String name = scan.next();
                    int birthday = scan.nextInt();
                    personList.add(new Person(name, birthday));
                    break;

                case 2:
                    if (personList.size() > 0) {
                        System.out.println(personList);
                    } else {
                        System.out.println("비었습니다.");
                    }
                    break;

                case 3:
                    Iterator<Person> iter = personList.iterator();
                    System.out.print("삭제할 이름을 입력하세요");
                    String removeName = scan.next();
                    while(iter.hasNext()){
                        Person person = iter.next(); //이거 조정하면 될거 같은데....
                        String personName = person.getName();
                        if(personName.equals(removeName)){
                            iter.remove();
                        }

                    }
                    break;

                case 4:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 수를 입력하셨습니다.");
            }

            if(select == 4){
                break;
            }
        }






    }
}
