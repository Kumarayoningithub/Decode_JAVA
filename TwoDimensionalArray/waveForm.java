package TwoDimensionalArray;

public class waveForm {
    public static void print(int [][] arr){
        int m=arr.length, n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] [] arr= {{2,1,4},{9,6,5},{7,5,9}};
        int m=arr.length, n= arr[0].length;
        System.out.println();

        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = n-1; j <=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }

        }


    }



}
