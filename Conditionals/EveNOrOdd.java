package Conditionals;
import java.util.Scanner;
public class EveNOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int k= sc.nextInt();
        if(k%2==0){ System.out.println("even");}
        else {System.out.println("odd");}


    }
}
