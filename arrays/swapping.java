package arrays;

public class swapping {
    public static void main(String[] args) {
        int [] arr= new int[7];
        arr[0]=25;
        arr[6]=21;
        int temp= arr[0];
        arr[0]= arr[6];
        arr[6]= temp;
        System.out.println(arr[0]+" "+arr[6]);


    }
}
