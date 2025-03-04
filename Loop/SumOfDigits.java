package Loop;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int k = sc.nextInt();
        int sum=0;
        while (k != 0) {
            int ld=k%10;
            sum=sum+ld;
            k=k/10;


        }
        System.out.println(sum);
    }
}