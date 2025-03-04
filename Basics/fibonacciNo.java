package Basics;

import java.util.Scanner;

public class fibonacciNo {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
        int a=1;
        int b=1;
        int sum=0;
     for(int i=1; i<=n-2;i++){
         sum=a+b;
         a=b;
         b=sum;
     }
        System.out.println(sum);
    }
}
