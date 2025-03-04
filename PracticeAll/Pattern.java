package PracticeAll;
import java.util.*;
public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter the row: ");
//        int n=sc.nextInt();
////        System.out.print("enter the column: ");
////        int m= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(j+64)+" " );
//            }
//            System.out.println();
//        }
//
//    }
public static void main(String[] args) {
    int n = 4;
    for (int i = n; i > 1; i--) {
        for (int j = n; j >= 1; j--) {
// prints top left of the pattern
            if (j > i)
                System.out.print(j + " ");
            else
                System.out.print(i + " ");
        }
        for (int j = 2; j <= n; j++) {
// prints top right of the pattern
            if (j > i)
                System.out.print(j + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }
    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= 1; j--) {
// prints left bottom of the pattern
            if (j > i)
                System.out.print(j + " ");
            else
                System.out.print(i + " ");
        }
        for (int j = 2; j <= n; j++) {
// prints right bottom of the pattern
            if (j > i)
                System.out.print(j + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }
}








}
