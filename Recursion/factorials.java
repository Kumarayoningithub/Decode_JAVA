package Recursion;
import java.util.*;

public class factorials {
    public static int fact(int n) {
     if(n==0 || n==1) return n;
  return n* fact(n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.println("the factorial is: "+fact(n));
    }
}
