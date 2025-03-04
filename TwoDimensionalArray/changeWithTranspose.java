package TwoDimensionalArray;

public class changeWithTranspose {



        public static void main(String[] args) {
            int [][] arr = {{2,3},{5,4},{9,8},};

            int m= arr.length;
            int n= arr[0].length;
            int [][] transpose = new int[n][m];
            //2 3
            //5 4
            //9 8

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <m ; j++) {
                    transpose[i][j] = arr[j][i];
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();

            }




        }}




