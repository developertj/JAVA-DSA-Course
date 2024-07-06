package Assignment3;

import java.util.Scanner;

public class runningSumOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int [n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[]newArray = sumOfArray(nums,n);
        for(int i = 0; i < n; i++){
            System.out.print(newArray[i]+" ");
        }

    }
    public static int[] sumOfArray(int []nums, int n){
        int sum = 0;
        int []runningSum = new int [n];
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
