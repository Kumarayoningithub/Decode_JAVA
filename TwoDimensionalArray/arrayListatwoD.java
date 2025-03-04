package TwoDimensionalArray;

import java.util.ArrayList;

public class arrayListatwoD {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4); a.add(10); a.add(22);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(56); b.add(89); b.add(99);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(98); c.add(87); c.add(54);
        ArrayList<ArrayList<Integer> > l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c);

//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i).get(i));

//        System.out.println(l.get(1).get(2));
        for (int i = 0; i < l.size(); i++) {
              ArrayList<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }

        }


    }

