package Recursion;
import java.util.*;
public class oneToN {

    public static void print(int k, int n){
        if(k>n) return;
        System.out.println(k);
        print(k+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        print(1,n);
    }


}
