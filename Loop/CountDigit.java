package Loop;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int k=sc.nextInt();
        int count=0;
        while(k!=0){
             k =k/ 10;
            count+=1;
        }
        System.out.println(count);
    }
}
