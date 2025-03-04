package arrays;

import java.util.Arrays;

public class builtInFun {
    public static void main(String[] args) {
        int [] arr= {30, 66, 32, 61,98};
        for (int ele : arr){
            System.out.print(ele);
        }
        Arrays.sort(arr);

        for (int ele : arr){
            System.out.println(ele);
        }



    }
}
