package arrays;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        //System.out.println(arr);
        for(int i=0; i<6; i++){
            System.out.println(arr.get(i)+ "   ");
        }
        arr.set(5,799);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(699);
        System.out.println(arr);

        System.out.println(arr.size());

    }
}
