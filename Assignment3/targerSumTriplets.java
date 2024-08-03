package Assignment3;

import java.util.Scanner;

public class targerSumTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sort(arr);
        targetPrint(arr,n,target);
    }
    public static void targetPrint(int[]arr,int n, int target){
        int []newArr = {3};
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum == target){
                        ans1 = arr[i];
                        ans2 = arr[j];
                        ans3 = arr[k];

                        if(ans1 < ans2 && ans2 < ans3){
                            System.out.println(ans1 +" , "+ans2 +" and "+ans3);
                        }else if(ans3 < ans2 && ans2 < ans1){
                            System.out.println(ans3 +" , "+ans2 + " and "+ans1);
                        }else if(ans2 < ans3 && ans3 < ans1){
                            System.out.println(ans2 +" , "+ans1 + " and "+ans3);
                        }
                    }
                }
            }
        }
    }
    public static void sort(int[]arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
