package PatternPrinting.CompositePattern;

import java.util.Scanner;

public class number_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = sc.nextInt();
        for(int k=1; k<=2*n-1;k++) System.out.print(k + " ");
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) { //rows
            int a =1;
            for (int j = 1; j <=n+1-i; j++) {// numbers
                System.out.print(a + " ");
                a++;}//stars
            for(int j=1; j<=2*i-1;j++) {
                System.out.print(" "+" ");  //spaces
                a++;
            }
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print(a+ " ");
                a++;//stars
            }
            System.out.println();
        }
    }
}
