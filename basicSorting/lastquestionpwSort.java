package basicSorting;
import java.util.*;
public class lastquestionpwSort {
    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 47, 91, 63};
        int n = arr.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = 0; j < n; j++) {
                    if(arr[j]<min && arr[j]>0){
                          min = arr[j];
                          mindx=j;
                    }
            }

            arr[mindx]=x;
            x--;
        }





    }
}