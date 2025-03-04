package Conditionals;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no: ");
        int k=sc.nextInt();
        System.out.println((k%2==0)? "even": "odd");
    }
}
