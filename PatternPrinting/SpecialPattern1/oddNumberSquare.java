package PatternPrinting.SpecialPattern1;

import java.util.Scanner;

public class oddNumberSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no: ");
        int n= sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}
