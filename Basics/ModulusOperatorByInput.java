package Basics;
import java.util.Scanner;
public class ModulusOperatorByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int k=sc.nextInt();
        System.out.print("enter the 2nd number: ");
        int l=sc.nextInt();

        System.out.println("the remainder is: "+k%l);
    }
}
