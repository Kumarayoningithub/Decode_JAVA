package TwoDimensionalArray;

public class addTwoMatrix {
    public static void main(String[] args) {
        int [][] arr = {{2,3},{5,4},{9,8},};
        int [][] brr = {{2,3},{5,4},{9,8},};
        int [][] res = new int[3][2];
        int m= arr.length;
        int n= arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
               res[i][j]= arr[i][j]+brr[i][j];
            }
        }

      for (int []ele : arr){

          for (int x: ele){
              System.out.print(x+" ");
          }
          System.out.println();
      }
        
        
    }
}
