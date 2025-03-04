package String;
import java.util.*;
public class countVowels {
    public static void main(String[] args) {

        String str = "bbb cc dd jkh";
        int n = str.length();
        int count=0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
                 if(isVowel(ch))  {
                     count++;
                 }
        }

        System.out.println("the number of vowels is "+ count);

    }

    public static boolean isVowel(char ch){
        if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' || ch== 'u'||
                ch == 'A' || ch == 'E'|| ch=='I' || ch=='O' || ch=='U')
        {return true;}
        else {return false;}

    }
}
