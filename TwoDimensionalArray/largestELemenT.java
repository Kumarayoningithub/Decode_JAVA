package TwoDimensionalArray;

public class largestELemenT {
    public static void main(String[] args) {
        int [][] arr = {{2,3,4},{5,6,7}};
        int max= Integer.MIN_VALUE;
        int m= arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                     if(arr[i][j]>max) max=arr[i][j];
            }
            System.out.println();
        }

        System.out.print(max);
    }
}
