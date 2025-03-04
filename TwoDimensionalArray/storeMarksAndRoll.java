package TwoDimensionalArray;

import java.util.Scanner;

public class storeMarksAndRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][2];
        int m= arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
             arr[i][j]= sc.nextInt();
            }
        }
        System.out.println();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
}
