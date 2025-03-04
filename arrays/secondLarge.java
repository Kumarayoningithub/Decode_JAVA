package arrays;

public class secondLarge {
    public static void main(String[] args) {
        int [] arr = {6, 3, 5, 4, -9, 632,- 356};
        int max = Integer.MIN_VALUE;
       for(int i = 0; i< arr.length; i++ ){
            if(arr[i]> max ) max= arr[i];}


        int smax = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++ ){
            if(arr[i]> smax && arr[i] != max) smax= arr[i];}
        System.out.println(max);
        System.out.println(smax);





    }
}
