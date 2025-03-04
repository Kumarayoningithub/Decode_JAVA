package PatternPrinting;
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int n= sc.nextInt();
        System.out.print("enter the no of columns: ");
        int m= sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
                                  }
    }
}
