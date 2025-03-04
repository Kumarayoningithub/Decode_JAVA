package basicSorting;

public class prac {
    public static void print(int [] arr){
        for ( int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {10,-4,20,1,8,6};
            int n = arr.length;
            int min = Integer.MAX_VALUE;
            int mindex=0;

        for (int i = 0; i < n; i++) {
                 if (arr[i]<min){
                     min=arr[i];
                     mindex=i;
                 }

        }

        System.out.println(min);
        System.out.println(mindex);


    }
}
