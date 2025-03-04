package Methods;

import java.util.Scanner;

public class FactorialOfAnumber {
    public static void factorial(int a){
        if(a<=0) {System.out.println("invalid");
            return;}
        int fact=1;
        for(int i=1; i<=a; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        factorial(n);
    }
}
