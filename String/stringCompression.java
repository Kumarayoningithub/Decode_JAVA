package String;
import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        String s = "aaaaggggeeecccuudddehh";

        char [] arr = s.toCharArray();
        String ans="";

        int  i =0; int j =0;

        while(j<arr.length){

            if(arr[i]==arr[j]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if(len>1) ans +=len;
                i=j;


            }

        }
        ans += arr[i];
        int len = j-i;
        if(len>1) ans +=len;

        System.out.print(ans);



    }
}
