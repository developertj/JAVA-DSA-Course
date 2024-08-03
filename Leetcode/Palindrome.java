package Leetcode;

import java.util.Scanner;

//TRY WITHOUT USING STRING

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        String num = String.valueOf(n);
        int i = 0;
        int j = num.length()-1;
        while(i<j){
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
