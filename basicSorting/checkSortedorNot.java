package basicSorting;
import java.util.*;
public class checkSortedorNot {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,6};
         int i =0;
         int j = 1;
         boolean flag = true;
       while(i < arr.length-1){
              if(arr[i]<=arr[j]){
                  i++;
                  j++;

              }


              else{
                   System.out.println("the arrays  is not sorted");
                   flag = false;
                  break;

              }





   }
   if(flag == true){
       System.out.println("the arrays is sorted");
   }

















    }
}
