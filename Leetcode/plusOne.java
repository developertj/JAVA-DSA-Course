package Leetcode;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        plusOneArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] plusOneArray(int[] digits){
        //int[] newArr = new int[digits.length];
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;

//        MY SOLUTION TEJAS BUT NOT WORKING FOR DIGIT 9
//        int integer = 0;
//
//        int multiplier = 1;
//        for (int i = 0; i < digits.length-1; i++) {
//            multiplier *= 10;
//        }
//        for (int i = 0; i < digits.length; i++) {
//            integer += digits[i] * multiplier;
//            multiplier/=10;
//        }
//        int plusOne = integer + 1;
//
//        for (int i = digits.length-1; i >= 0 ; i--) {
//            if (digits[i] < 9) {
//                // If the current digit is less than 9, simply increment it by 1
//                digits[i]++;
//                return digits;
//            }
//            else {
//                digits[i] = plusOne % 10;
//                plusOne = plusOne / 10;
//            }
//        }
//        return digits;
    }
}
