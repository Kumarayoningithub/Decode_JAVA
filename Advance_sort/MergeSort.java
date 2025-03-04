package Advance_sort;

public class MergeSort {
    public static void print(int[]arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void merge(int []a, int []b , int []arr){

        int i =0, j=0, k=0;
       while(i< a.length && j< b.length){
           if(a[i]<=b[j]) {
               arr[k]=a[i];
               i++;
               k++;
           }
           else{
               arr[k]=b[j];
               j++;
               k++;
           }


       }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }



    }
    public static void mergesort(int []arr){
        int n = arr.length;
        if(n==1) return;
        int [] a = new int[n/2];
        int [] b = new int [n-n/2];
        for (int i = 0; i < n/2; i++) {
              a[i]=arr[i];
        }

        for (int i = 0; i < n-n/2; i++) {
            b[i]=arr[i+n/2];
        }

        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
        //delete a and b
        // for improving space complexity
        a=null;
        b= null;

    }
    public static void main(String[] args) {
        int [] arr={80,10,70,30,60,40,50,20};
        print(arr);
        mergesort(arr);
        print(arr);



    }
}
