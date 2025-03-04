package Recursion;

import java.util.Scanner;

public class aToThePowerB {
      public static int power(int a, int b){
         if(a==0) return 0;
         else if(b ==0) return 1;

         return a*power(a,b-1);
      }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int a = sc.nextInt();
        System.out.println("enter the power: ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
