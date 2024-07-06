package Assignment3;

import java.util.Scanner;

public class targetSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetPrint(arr,n,target);
    }
    public static void targetPrint(int[]arr,int n, int target){
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = arr[i] + arr[j];
                if(sum == target){
                    ans1 = arr[i];
                    ans2 = arr[j];
                    if(ans1 < ans2){
                        System.out.println(ans1 +" and "+ans2);
                    }else{
                        System.out.println(ans2 +" and "+ans1);
                    }
                }
            }
        }
    }
}
