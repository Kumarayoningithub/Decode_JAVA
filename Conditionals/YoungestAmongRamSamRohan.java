package Conditionals;
import java.util.Scanner;
public class YoungestAmongRamSamRohan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.print("enter the 3rd number: ");
        int c = sc.nextInt();
        if (a < b) {
            if (a < c) System.out.println("A is the smallest number");
            else System.out.println("c is the smallest number");
        }
//        else if(b>=a){
        else{
                if(b<c) System.out.println("B is the smallest");
                else System.out.println("c is the smallest");
            }
//        else System.out.println("c is the largest");
    }
}
