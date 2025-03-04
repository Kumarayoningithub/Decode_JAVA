package Conditionals;
import java.util.Scanner;
public class RectangleBreadthAndPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length: ");
        int length=sc.nextInt();
        System.out.print("enter the breadth: ");
        int breadth=sc.nextInt();

        int perimeter= 2*(length+breadth);
        int area= length*breadth;


        System.out.println(perimeter);
        System.out.println(area);

        if(area>perimeter) System.out.println("yes area is greater than the perimeter"+(area-perimeter));
        else if(area==perimeter) System.out.println("area and perimeter equal");
        else System.out.println("perimeter is greater than area"+ (perimeter-area) );

    }
}
