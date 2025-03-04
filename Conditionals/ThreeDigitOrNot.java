package Conditionals;
import java.util.Scanner;
public class ThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number");
        int k = sc.nextInt();
        if(k>99 && k<1000) System.out.println("it is a three digit number");
        else System.out.println("no it is not");
    }
}
