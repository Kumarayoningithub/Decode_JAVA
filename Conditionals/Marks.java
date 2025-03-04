package Conditionals;

import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter  the marks");
        int m=sc.nextInt();
        if(m>81) System.out.println("very good");
        else if(m>61) System.out.println("Good");
        else if(m>41) System.out.println("Average");
        else System.out.println("Fail");
    }
}
