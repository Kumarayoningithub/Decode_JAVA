package PracticeAll;

import java.util.Scanner;

public class star_pattern {public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the row: ");
    int n=sc.nextInt();
//        System.out.print("enter the column: ");
//        int m= sc.nextInt();
    int a=1;
    for(int i=1; i<=n; i++){

        for(int j=1;j<=i;j++){
            System.out.print( a+ " ");
            a++;
        }
        System.out.println();
    }

}
}
