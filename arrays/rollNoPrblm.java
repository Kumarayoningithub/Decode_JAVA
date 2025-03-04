package arrays;

public class rollNoPrblm {
    public static void main(String[] args) {

        int [] arr = {10,20,100,200,400};
        int k= arr.length;
        for(int i = 0; i<k; i++)
            if(arr[i]<35) System.out.println(i);

    }
}
