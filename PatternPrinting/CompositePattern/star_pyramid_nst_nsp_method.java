package PatternPrinting.CompositePattern;

import java.util.Scanner;

public class star_pyramid_nst_nsp_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) System.out.print(" " + " ");//spaces
//            for(int j=1; j<=i;j++) System.out.print("*" + " ");
            for(int j=1; j<=nst;j++) System.out.print("*"+" ");  //stars
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
