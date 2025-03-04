package Conditionals;
import java.util.Scanner;
public class CalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number");
        int k=sc.nextInt();
        System.out.print("enter the operation");
//        char ch=sc.next().charAt(0);
        char ch=sc.next().charAt(0);
        System.out.print("Enter the 2nd number");
        int l=sc.nextInt();
        if(ch=='+') System.out.println(k+l);
        if(ch=='-') System.out.println(k-l);
        if(ch=='*') System.out.println(k*l);
        if(ch=='/') System.out.println(k/l);


    }
}
