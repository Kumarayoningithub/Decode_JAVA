package Methods;
import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        System.out.print("enter the character: ");
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') System.out.println("yes the character is vowel"+ch);
        else System.out.println(" the character is consonent");
    }
}
