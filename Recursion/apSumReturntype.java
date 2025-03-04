package Recursion;

import java.util.Scanner;

public class apSumReturntype {
    
    public static int sum(int n){
        if(n==0 || n== 1) return n;

        return n+sum(n-1);


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
