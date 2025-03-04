package Methods;
import java.util.Scanner;

public class AddTwoNumbers {
    public static int sum(int a , int b){
        int add=a+b;
        return add;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int calculate=sum(n,m);
        System.out.println(calculate);

    }
}
