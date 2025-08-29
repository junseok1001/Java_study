package doublearray.ex;

public class Ex01 {

    public static void main(String[] args) {
        // 3명의 학생의 5개의 성적 정보
        int[][] scores = {
                {90, 80, 95, 85, 100},
                {60, 55 ,70, 80, 45},
                {100, 30, 60, 90, 70}
        } ;

        //배열의 접근 방법
        System.out.println("첫번째 학생의 세번째 점수 : " + scores[0][2]);
        System.out.println("세번째 학생의 두번째 점수 : " + scores[2][1]);
        System.out.println("두번째 학생의 다섯번째 점수 : " + scores[1][4]);

        // 이차원 배열의 모든값 접근

        //모든 배열의 접근한다.
        for(int i = 0; i < scores.length; i++){
//            scores[i]
            for(int j = 0; j < scores[i].length; j++){
//                scores[i][j]
                System.out.print(i + 1 + "번째 학생의 점수들 : " + scores[i][j] + " ");
            }
            System.out.println();
        }

        //학생별 점수 합계
        for(int i = 0; i < scores.length; i++){
//            scores[i]
            int sum = 0;
            for(int j = 0; j < scores[i].length; j ++){
                sum += scores[i][j];
            }
            System.out.println("합 : " + sum);
        }

    }
}
