package Recursion;

import java.util.Scanner;

public class powerFunctionLog {
    public static int power2(int a, int b){
        if(b==0) return 1;
        else if(b%2==0){
            int ans = power2(a,b/2);
            return ans*ans;
        }
        else{
            int ans = power2(a,b/2);
            return ans*ans*a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int a = sc.nextInt();
        System.out.println("enter the power: ");
        int b = sc.nextInt();
        System.out.println(power2(a,b));
    }

}
