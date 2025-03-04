package arrays;

public class maxElementArray {
    public static void main(String[] args) {
        int [] arr = {6, 3, 5, 4, -9, 632,- 356};

//        int max= arr[0];
//        for(int i = 1; i< arr.length; i++){
//            if(arr[i]>max)  max = arr[i];}
//        System.out.println(max);
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i< arr.length; i++ ){
//            if(arr[i]> max ) max= arr[i];}
//        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++ ){
            if(arr[i]< min ) min= arr[i];}
        System.out.println(min);


    }
}
