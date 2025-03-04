package Recursion;
import java.util.*;
public class nToOne {
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        print(n);
    }
}
