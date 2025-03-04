package Conditionals;
import java.util.Scanner;
public class DivisibleByFiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int k=sc.nextInt();
        if(k%5==0 || k%3==0) System.out.println("it is divisible by 5 or 3");
        else System.out.println("not divisible by 5 or 3");

    }
}
