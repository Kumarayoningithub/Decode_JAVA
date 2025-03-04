package Conditionals;
import java.util.Scanner;
public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number");
        int k=sc.nextInt();
        System.out.print("enter the operation");
        char ch=sc.next().charAt(0);
        System.out.print("Enter the 2nd number");
        int l=sc.nextInt();
        switch(ch){
            case '+':
                System.out.println(k+l);
                break;
            case '-':
                System.out.println(k-l);
                break;
            case '*':
                System.out.println(k*l);
                break;
            case '/':
                System.out.println(k/l);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
