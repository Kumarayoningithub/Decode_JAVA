package PatternPrinting.CompositePattern;
import java.util.Scanner;
public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = sc.nextInt();
        for(int k=1; k<=2*n-1;k++) System.out.print("*" + " ");
        System.out.println();
                  n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) System.out.print("*" + " ");//stars
           for(int j=1; j<=2*i-1;j++) System.out.print(" "+" ");  //spaces
          for (int j = 1; j <=n+1-i; j++) System.out.print("*" + " ");//stars
           System.out.println();
        }
    }
}


