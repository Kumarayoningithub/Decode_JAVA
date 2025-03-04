package Conditionals;
import java.util.Scanner;
public class FiveDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int k = sc.nextInt();
        if(k>9999 && k<100000) System.out.println("the number is five digit");
        else System.out.println("the number is not five digit");
    }
}