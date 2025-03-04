package Conditionals;
import java.util.Scanner;
public class ProfitAndLOss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the cp: ");
        int cp=sc.nextInt() ;
        System.out.print("enter the sp: ");
        int sp = sc.nextInt();

        if(sp>cp) System.out.println("profit and the amount of profit is : "+(sp-cp));
        else if(sp==cp) System.out.println("no profit and no loss");
        else System.out.println("loss and the amount of loss is : "+(cp-sp));

    }
}
