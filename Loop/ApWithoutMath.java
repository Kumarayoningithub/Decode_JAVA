package Loop;
import java.util.Scanner;
public class ApWithoutMath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int k=4;
        for(int i =1;i<=n;i++) {
            System.out.print(k+" ");
            k=k+3;
        }
    }
}
