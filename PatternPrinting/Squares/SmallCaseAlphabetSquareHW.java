package PatternPrinting.Squares;

import java.util.Scanner;

public class SmallCaseAlphabetSquareHW {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no: ");
        int n= sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 97; j <= n+96; j++) {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }




}
