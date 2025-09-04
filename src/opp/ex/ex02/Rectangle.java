package opp.ex.ex02;

public class Rectangle {

        // 가로 , 세로
        int width;
        int height;

        //기능 , 메서드, 멤버 함수
        // 넓이는 구하는 기능

        int calculateArea(){
            int area = width * height;

            return area;
        }

        //개수에 따른 넓이 구하기 → 개수는 속성으로는 안맞음. 그러면 밑에 함수가 적용될때만 필요하니 파라미터로 저장
        // 같은 이름의 메서드
        // 조건 : 파라미터의 개수, 타입이 다른경우
        // overloading (오버로딩) 이거 면접 문제에 많이 나옴.
        // 같은 메서드 명을 사용 할수 있다.
        int calculateArea(int count){
            int area = width * height * count;

            return area;
        }

        //객체 정보를 출력하는 기능
        // main 에서 일일이 확인하면서 하면 불편하기 때문에 이기능은 필수적으로 만들어주면 좋음

        void printInfo(){
            System.out.println("가로 : " + width + " 세로 : " + height);
        }
}
