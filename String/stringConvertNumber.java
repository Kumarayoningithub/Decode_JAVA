//package String;
//import java.util.*;
//public class stringConvertNumber {
//    public static void main(String[] args) {
//        String[] arr = {"455", "745126", "56354", "0025"};
////        int mx= Integer.MIN_VALUE;
////
////        for (int i = 0; i < arr.length ; i++) {
////                 int n = Integer.parseInt(arr[i]);
////                 mx=Math.max(mx,n);
////        }
////        System.out.print(mx);
//
//
//        String maxS = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            maxS = max(maxs, arr[i]);
//        }
//        System.out.println(maxS);
//
//
//    }
//
//
//    public static String max(String a, String b) {
//        String s = purify(a), t = purify(b);
//
//        if (s.length() > t.length()) return a;
//        if (s.length() < t.length()) return b;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != t.charAt(i)) {
//
//                if (s.charAt(i) > t.charAt(i)) return a;
//                else return b;
//            }
//        }
//    }
//
//
//    public static String purify(String s) {
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != '0') return s.subString(i);
//        }
//        return s;
//
//
//    }
//
//}