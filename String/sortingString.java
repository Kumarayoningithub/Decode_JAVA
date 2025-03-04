package String;

import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {
        String sb = "raghav";

        char [] ch = sb.toCharArray();

        Arrays.sort(ch);

        for( char ele: ch){
            System.out.print(ele+" ");
        }
    }
}
// for string builder sorting techniques at 1st
// convert it into string then char array then Arrays. sort...
// char [] ch = sb.toString().toCharArray();
