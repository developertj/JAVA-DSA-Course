package Lec22;

import java.util.Arrays;

public class String_demo2 {
    public static void main(String[] args) {
        //trim  = removes starting and ending spaces of a string
        //split = splits on the basis of given input
        // reverse word of string this is a leetcode problem

        String s = "  Hello     World     ";
//        s = s.trim();
//
//        String[] arr = s.split(" +");
//
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i]+" ");
//        }
        s = s.trim();

        String[] arr = s.split("\\s+");
        String newS = "";

        for (int i = arr.length-1; i >= 0; i--) {
            newS += (arr[i]+" ");
        }
//        newS = newS.trim();

        System.out.println(newS);
        System.out.println(Arrays.toString(arr));
    }
}
