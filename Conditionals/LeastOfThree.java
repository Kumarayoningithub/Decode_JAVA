package Conditionals;
import java.util.Scanner;
public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int a=sc.nextInt();
        System.out.print("enter the 2nd number: ");
        int b=sc.nextInt();
        System.out.print("enter the 3rd number: ");
        int c=sc.nextInt();

        if(a<=b && a<=c) System.out.println("a is the smallest no");
        else if(b<=a && b<=c) System.out.println("b is the smallest no");
        else System.out.println("c is the smallest");

    }
}
