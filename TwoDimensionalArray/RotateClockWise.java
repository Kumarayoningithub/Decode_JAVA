package TwoDimensionalArray;

public class RotateClockWise {
    public static void print(int[][] arr){
        int m= arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }
    public static void swap(int[][] arr,int i, int j){
        int temp= arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i]=temp;
    }


    public static void main(String[] args) {
        int [] [] arr= {{2,1,4},{9,6,5},{7,5,9}};
        print(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }
        print(arr);
        //rverse each row
        for (int i = 0; i < arr.length; i++) {
             int a=0, b= arr.length-1;
             while(a<=b){

                 int temp= arr[i][a];
                 arr[i][a]= arr[i][b];
                 arr[i][b]=temp;
                 a++;
                 b--;
             }
        }
        print(arr);



    }


}
