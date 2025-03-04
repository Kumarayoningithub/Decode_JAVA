package String;
import java.util.*;
public class modiFyCharInString {
    public static void main(String[] args) {
        String s = "hello";
        // i need to change the hello -> heylo
        // beeekaar talika holo ->
        s=s.substring(0,2) + "y"+s.substring(3,5);
        System.out.println(s);

    }
}
