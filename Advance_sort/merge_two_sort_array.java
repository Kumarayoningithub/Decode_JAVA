package Advance_sort;

public class merge_two_sort_array {
    public static void print(int[] arr) {

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int[] brr, int[] crr) {
        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < brr.length) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            } else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }

        while (i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }


    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 41, 49};
        int[] brr = {51, 25, 31, 45, 50};
        int[] crr = new int[arr.length + brr.length];
        //print(arr);

        merge(arr, brr, crr);
        print(crr);
    }

}

