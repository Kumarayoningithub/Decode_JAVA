package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SumOfTwoNumbersInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st number:");
        int k = sc.nextInt();

        System.out.print("enter the 2nd number: ");
        int l = sc.nextInt();
//        int m=k+l;

        System.out.println("the sum of two number is : "+(k+l));

    }
}
