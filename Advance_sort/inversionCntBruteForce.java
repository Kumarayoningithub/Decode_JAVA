package Advance_sort;

public class inversionCntBruteForce {
    public static void main(String[] args) {
        int [] arr ={109,33,89,27,60,10,70};
        int n = arr.length;
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]) count++;
            }
        }

        System.out.println(count);
    }
}
