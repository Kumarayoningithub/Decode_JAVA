package PatternPrinting.Squares;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no: ");
        int n= sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 65; j <= n+64; j++) {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
    }

