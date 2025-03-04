package Recursion;
import java.util.*;
public class apSum {
    public static void sum(int n, int s ){
        if(n==0){
            System.out.println(s);
            return;
        }
        else{
            sum(n-1,n+s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = sc.nextInt();
        sum(n,0);
    }
}
