package arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        System.out.print("enter the target element");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array size");
        int k= sc.nextInt();
        int [] arr = new int[k];

        System.out.println("enter the array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n) {
                flag = true;
                break;
            }
        }

        if( flag== true) System.out.println("element found");
        else if (flag == false) System.out.println(" not found");

    }
}

