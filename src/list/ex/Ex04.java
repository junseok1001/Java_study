package list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

    public static void main(String[] args) {

        List<Member> memberList = new ArrayList<>();
        Member member1 = new Member("오준석", "01011112222");

        memberList.add(member1);

        memberList.add(new Member("유재석", "01012345678"));
        memberList.add(new Member("강호동", "01098765432"));
        memberList.add(new Member("유재석", "01000009999"));

        System.out.println(memberList);


        //두번째 저장된 객체 이름 출력
        Member secondName = memberList.get(1); // 이제 슬슬 붙는게 많아져서 변수를 잘 활용해서 저장하기.
        String name = secondName.getName();
        System.out.println("두번째 이름 : " + name);

        // 모든 멤버 이름 출력
        for(int i = 0; i < memberList.size(); i++){
            Member member = memberList.get(i);
            name = member.getName();
            System.out.print(name + " ");
        }
        System.out.println();


        for(Member member:memberList){
            name = member.getName();
            System.out.print(name + " ");
        }
        System.out.println();

        //유재석(5678)
        Iterator<Member> iter = memberList.iterator();

        while(iter.hasNext()){
            Member member = iter.next();

            //유재석(5678)
            name = member.getName();
            String phoneNumber = member.getPhoneNumber();

            int length = phoneNumber.length();
            String part = phoneNumber.substring(length - 4);
            System.out.println(name + "(" + part + ")");
        }




    }
}
