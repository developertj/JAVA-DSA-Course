package Lec22;

import java.util.Scanner;

public class Unique_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isUnique(s));
    }
    public static boolean isUnique(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index] ++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 1){
                return false;
            }
        }
        return true;
    }
}
