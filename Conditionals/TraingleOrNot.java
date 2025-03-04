package Conditionals;
import java.util.Scanner;
public class TraingleOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int a= sc.nextInt();
        System.out.print("enter the 2nd number: ");
        int b= sc.nextInt();
        System.out.print("enter the 3rd number: ");
        int c= sc.nextInt();

        if(a+b>c && b+c>a && c+a>b ) System.out.println("yes it is possible");
//        else if(b+c>a) System.out.println("yes it is possible");
//        else if(c+a>b) System.out.println("yes it is possible");
        else System.out.println("not possible");

    }
}
