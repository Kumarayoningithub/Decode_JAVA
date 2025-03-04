package basicSorting;
import java.util.*;
public class InserstionSort {
    public static void main(String[] args) {
        int [] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        //insertion sort//***********************************************************

        for (int i = 1; i < n; i++) {
            for (int j = i; j>=1 ; j--) {
                    if(arr[j]<arr[j-1]){
                        int temp= arr[j];
                        arr[j]= arr[j-1];
                        arr[j-1]=temp;
                    }
                    else break;
            }
        }
        for( int ele: arr) {
            System.out.print(ele + " ");
        }


    }
}
