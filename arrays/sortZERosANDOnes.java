package arrays;

public class sortZERosANDOnes {
    public static void main(String[] args) {
        int[] arr= {1,0,0,0,1,0,1,0,0,0,1,1,1};
//        int zeros=0;
//        int ones=0;
       int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==0) zeros++;
//            else if(arr[i]==1) ones++;
//        }
//        for (int i = 0; i < zeros; i++) {
//            arr[i]=0;
//        }
//        for (int i= zeros ; i <n ; i++) {
//            arr[i]=1;
//
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]);
//
//        }
//        for (int i = 0; i < n; i++) {
//             if(i< zeros) arr[i]=0;
//             else arr[i]=1;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]);
//
//        }



        int i =0;
        int j = n-1;
        while(i<=j){
            if(arr[i]==0) i++;
            else if (arr[j]==1)  j--;
            else if(i>j) break;
            else if (arr[i]==1 && arr[j]==0) {
                arr[i]=0;
            arr[j]=1;
            i++;
            j--;}
            }

for(int ele: arr){
    System.out.print(ele+" ");
}
        }
    }

