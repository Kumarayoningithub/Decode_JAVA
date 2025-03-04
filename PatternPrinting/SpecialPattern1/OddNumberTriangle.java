package PatternPrinting.SpecialPattern1;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int n= sc.nextInt();
        for (int i = 1; i<=n; i++) {


//Method 1           for (int j = 1; j <=i; j++) {
//
//                System.out.print((2*j-1)+ " ");
//            }


//Method 2//            for (int j = 1; j <=2*i-1; j+=2) {
//
//                System.out.print(j+ " ");
//            }

 //Method 3
                   int a=1;
             for (int j = 1; j <=2*i-1; j+=2) {

                System.out.print(a+ " ");
                a=a+2;
            }
            System.out.println();
        }
    }
}
