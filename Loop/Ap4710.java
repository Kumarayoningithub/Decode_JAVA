package Loop;

import java.util.Scanner;

public class Ap4710 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        for (int i=4;i<=3*n+1;i+=3) {
            System.out.print(i+" ");
        }
    }
}
