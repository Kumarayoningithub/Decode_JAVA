package Loop;
import java.util.Scanner;
public class nTimeshello_world {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("hello world");
        }

    }
}
