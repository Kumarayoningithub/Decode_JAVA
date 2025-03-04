package arrays;

public class rotateArray {
    public static void reversee(int [] nums, int i, int j){

        while(i<=j){
            int temp= nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int [] nums ={10,20,30,40,50,60};
        int n = nums.length;
        int k =3;
        reversee(nums,0,n-k-1);
        reversee(nums,n-k,n-1);
        reversee(nums,0,n-1);

        for(int ele: nums){
            System.out.print(ele+" ");
        }


    }
}
