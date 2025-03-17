package String;
import java.util.*;
public class removeSpaceFromString {
    public static void main(String[] args) {
        String str = new String("hello java ");
        //System.out.println( str.replaceAll("\\s+",""));
         String strans =new String("");
        for (int i = 0; i < str.length(); i++) {
                  if((str.charAt(i)!=' ') && (str.charAt(i)!='\t')){
                      strans=strans+str.charAt(i);
                  }
        }
        System.out.println(strans);

    }

}
