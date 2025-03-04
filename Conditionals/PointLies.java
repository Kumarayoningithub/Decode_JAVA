package Conditionals;
import java.util.Scanner;
public class PointLies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter x quadrinate: ");
        int x=sc.nextInt();
        System.out.print("enter y quadrinate: ");
        int y=sc.nextInt();
        if(x==0 && y==0) System.out.println("it is in origin (0,0)");
        else if(x>0 && y>0) System.out.println("it is in 1st quadrinate");
        else if(x<0 && y>0) System.out.println("it is in 2nd quadrinate");
        else if(x<0 && y<0) System.out.println("it is in the 3rd quadrinate");
        else if(x>0 && y<0) System.out.println("it is in the 3rd quadrinate");
        else if (x==0) System.out.println("it is in the y axis");
        else if(y==0) System.out.println("it is in the x axis");

    }
}
