package Loop;
import java.util.Scanner;
public class CompositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
         for(int i=2;i<=n-1;i++) {
             System.out.println("the number is composite");
                 break;
         }

    }
}