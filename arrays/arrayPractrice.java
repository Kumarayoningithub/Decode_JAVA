package arrays;
import java.util.Scanner;
public class arrayPractrice {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter all the elements of the array");
        for(int i =0; i<n; i++ ){
            arr[i]= sc.nextInt();
        }
        System.out.println("the arrays elements are: ");
         for(int i =0; i <n; i++)
             System.out.println(arr[i]);
    }
}
