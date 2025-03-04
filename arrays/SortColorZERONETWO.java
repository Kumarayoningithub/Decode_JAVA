package arrays;

public class SortColorZERONETWO {
    public static void main(String[] args) {
//        int [] arr={0,1,2,1,2,1,0,2,1,2};
//        int n = arr.length;
//        int zero=0;
//        int one=0;
//        int two=0;
//
//        for (int i = 0; i < n; i++) {
//
//            if(arr[i]==0) zero++;
//            else if(arr[i]==1) one++;
//
//
//        }

//        for (int i = 0; i < zero; i++) {
//            arr[i]=0;
//
//        }
//        for (int i = zero; i <one ; i++) {
//            arr[i]=1;
//        }
//        for (int i = one; i <n ; i++) {
//            arr[i]= 2;
//
//        }

//        for (int i = 0; i <n; i++) {
//            if(i<zero) arr[i]=0;
//            else if(i<zero+one) arr[i]=1;
//            else arr[i]=2;
//
//
//        }



//       // method 2 : dutch flag algorithm



        int [] arr={0,1,2,1,2,1,0,2,1,2};
        int n = arr.length;
        int mid=0; int lo=0; int high=n-1;
        while(mid<=high){

            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                mid++;
                lo++;
            }

            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }


        }

        for(int ele: arr){

            System.out.print(ele+" ");
        }

    }
}
