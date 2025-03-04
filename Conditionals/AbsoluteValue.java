package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int k=sc.nextInt();
        if(k<0){
            System.out.println("the absolute value is: "+k*(-1));}
        else {
            System.out.println("the number is "+k);
        }

    }
}
