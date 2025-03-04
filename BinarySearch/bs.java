package BinarySearch;
import java.util.*;
public class bs {
    public static void main(String[] args) {
        int [] arr = {10,15,21,34,81,105,180,500,614};
        int n = arr.length;
        int target = 21;
        int low= 0;
        int high = n-1;
        boolean flag = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target){
                low = mid+1;
            }
                else if (arr[mid]>target){
                   high = mid-1;
            }
                    else if(arr[mid]==target){
                        flag = true;
                        break;
            }
        }
        if(flag==true){
            System.out.println("element is present");
        }
        else{
            System.out.println("not present");
        }

    }
}
