package TwoDimensionalArray;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int[2][3];
        int m= arr.length;//row
        int n = arr[0].length;// colmn
        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
