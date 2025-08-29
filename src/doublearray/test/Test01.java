package doublearray.test;

public class Test01 {
//중복 배열 연습문제
    public static void main(String[] args) {
        // 자주 쓸거
        //5행 10열
        int[][] scores = {
                {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
                {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
                {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
                {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
                {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
        };
//        1. 학생 별 평균 구하기
//        각 학생의 평균을 각각 구해서 출력하세요.
//        출력
//
//        1번째 학생의 평균 : 89.9
//        2번째 학생의 평균 : 84.8
//        3번째 학생의 평균 : 94.2
//        4번째 학생의 평균 : 78.3
//        5번째 학생의 평균 : 54.8

//        for(int i = 0; i < scores.length; i++){
//            //scores[i]
//            double average = 0;
//            for(int j = 0; j < scores[i].length; j ++){
//                // 0 번째 학생의 수들을 다 더하고 더한 만큼 나누기
//                average = (average + scores[i][j]);
//            }
//            average = average / scores[i].length;
//            System.out.println((i + 1) + "번째 학생의 평균 : " + average);
//        }


//        2. 학생 별 최고점 구하기
//        각 학생의 최고 점수를 구해서 출력하세요.
//        출력
//
//        1번째 학생의 최고점 : 93
//        2번째 학생의 최고점 : 98
//        3번째 학생의 최고점 : 98
//        4번째 학생의 최고점 : 100
//        5번째 학생의 최고점 : 67

//        for(int i = 0; i < scores.length; i++){
//            // 0번째 행
//            int max = scores[i][0];
//            for(int j = 0; j < scores[i].length; j++){
//
//                if(max < scores[i][j]){
//                    max = scores[i][j];
//                }
//            }
//            System.out.println((i + 1) + "번째 학생의 최고점 : " + max);
//        }

//        3. 평균 최고점 구하기
//        평균이 가장 높은 학생의 평균 점수와 몇 번째 학생인지 출력하세요.
//        출력
//
//        평균이 가장 높은 학생 : 3번째 학생
//        평균 : 94.2
        double maxAverage = 0;
        int maxIndex = 0;
        for(int i = 0; i < scores.length; i++){
            int sum = 0;
            for(int j = 0; j < scores[i].length; j ++){
                // 0 번째 학생의 수들을 다 더하고 더한 만큼 나누기
                sum += scores[i][j];
            }
            double average = sum / (double)scores[i].length;

            if(average > maxAverage){
                maxAverage = average;
                maxIndex = i;
            }

        }
        System.out.println("평균이 가장 높은 학생 : " + (maxIndex + 1) +  "번째 학생 ");
        System.out.println("평균 : " + maxAverage);




//        4. 특정 과목 최고점
//        index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.
//        출력
//
//        index 4 과목의 최고 성적자는 3번째 학생
//        점수 : 97
        int maxScore = 0;
        maxIndex = 0;
        for(int i = 0; i < scores.length; i++){
            //scores[i]
            if(scores[i][4] > maxScore){
                maxScore = scores[i][4];
            }
        }
        System.out.println("index 4 과목의 최고 성적자는" + (maxIndex + 1) + "번째 학생");
        System.out.println("점수 : " + maxScore);


//        5. 일부 평균 최고점
//        시험 과목 index 3 ~ 7의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//        출력
//
//        평균이 가장 높은 학생 : 2번 index
//        평균 : 93.8
        maxAverage = 0;
        maxIndex = 0;
        for(int i = 0; i <scores.length; i++){
            //scores[i]
            int sum = 0;
            for(int j = 3; i <= 7; j++){
                sum += scores[i][j];
            }
            double average = sum / 5.0;

            if(average > maxAverage){
                maxAverage = average;
                maxIndex = i;
            }
        }

        System.out.println("평균ㅇ이 가장 높은 학생 : " + maxIndex + "번 indx");
        System.out.println("평균 : " + maxAverage);




    }
}
