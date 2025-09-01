package doublearray.test;

public class Test02 {
    {
//        int[][] num = new int[2][3];
        //문제 1;
//        for(int i = 0; i < num.length; i++){
//            for(int j = 0; j < num[i].length; j++){
//                num[i][j] = 10;
//            }
//        }
//        PrintArray(num);

        //문제 2
//        int [][] num = new int[3][4];
//         for(int i = 0; i < num.length; i++){
//             for(int j = 0; j < num[i].length; j++){
//                 num[i][j] =j + 1;
//             }
//         }
//
//         PrintArray(num);

        //문제 3
//        int [][] num1 = new int [3][3];
//        for(int i = 0; i < num1.length; i++){
//            for(int j = 0; j < num1[i].length; j++){
//                num1[i][j] = i + 1;
//            }
//        }
//
//        PrintArray(num1);


        //문제 4
//        int [][] array = new int [5][5];
//        for(int i = 0; i < array.length; i++ ){
//           for(int j = 0; j <array[i].length; j++){
//               if(i == 2 || j ==2){
//                  array[i][j] = 1;
//               }
//           }
//        }
//
//        isPrintArray(array);

        //문제 5
        int[][] array = new int[3][3];
        int scores = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                scores++;
                array[i][j] = scores;

            }

        }

        PrintArray(array);


        // 문제 6번
//        int [][] array = new int [3][3];
//        int score = 0;
//        for(int i = 0; i < array.length; i++){
//
//
//            for(int j = 0; j < array[i].length; j++){
//                score++;
//                array[j][i] = score;
//
//            }
//
//        }
//
//        PrintArray(array);


    }

    public static void PrintArray(int[][] Array) {

        for (int i = 0; i < Array.length; i++) {
            //Array[i]
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

}










