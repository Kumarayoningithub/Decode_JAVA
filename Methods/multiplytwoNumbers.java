package Methods;

import java.util.Scanner;

public class multiplytwoNumbers {
    public static int multiply(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y = sc.nextInt();
        int ans=multiply(x,y);
        System.out.println(ans);

    }
}
