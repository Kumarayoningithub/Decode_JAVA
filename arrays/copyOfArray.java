package arrays;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {33, 22, 54, 88, 74, 4};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

//        int [] num= arr;
//        for (int ele : num) {
//            System.out.println(ele + " ");
//        }  shallow copy

        int [] brr= Arrays.copyOf(arr, arr.length);

        for (int ele : brr) {
            System.out.println(ele + " ");
        }

    }}