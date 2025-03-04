package String;
import java.util.*;
public class updateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str= sc.nextLine();
        System.out.println(str);
        String update = "";

        for (int i =0; i < str.length(); i ++){
              if(i%2==0) update = update+'a';
              else update=update+str.charAt(i);


        }

        System.out.println(update);



    }
}
