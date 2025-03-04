package basicSorting;
import java.util.*;
public class bubbleSort {
    public static void print(int [] arr){
        for( int ele:  arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

      int [] arr ={5,1,3,4,2};
      int n = arr.length;

//bubble sort 1 **************************************//**********************************
//      for ( int k =1; k<n;k++){
//        for (int i = 0; i < n-1; i++) {
//
//            if (arr[i]>arr[i+1]){
//                int temp= arr [i];
//                arr[i]= arr [i+1];
//                arr[i+1]= temp;
//
//            }
//
//        }}

        for ( int k =0; k<n-1;k++){
        for (int i = 0; i < n-1-k; i++) {

            if (arr[i]>arr[i+1]){
                int temp= arr [i];
                arr[i]= arr [i+1];
                arr[i+1]= temp;

            }

        }}




  print(arr);






    }
}
