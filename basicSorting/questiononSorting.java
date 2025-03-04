package basicSorting;
import java.util.*;
public class questiononSorting {
    public static void main(String[] args) {
        int [] arr = {54,11,28,47,91,63};


        int [] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            brr[i]= arr[i];
        }

        Arrays.sort(arr);


        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                 if (brr[i]==arr[j]) {
                        brr[i]=j;

                }
            }

        }


        for (int ele: brr){
            System.out.print(ele+ " ");
        }
    }
}
