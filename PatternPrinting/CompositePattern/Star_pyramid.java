package PatternPrinting.CompositePattern;

import java.util.Scanner;

public class Star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) System.out.print(" " + " ");//spaces
//            for(int j=1; j<=i;j++) System.out.print("*" + " ");
            for(int j=1; j<=2*i-1;j++) System.out.print("*"+" ");  //stars
            System.out.println();
        }
    }
}



