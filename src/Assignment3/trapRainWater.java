package Assignment3;

import java.util.Scanner;

public class trapRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int [n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();

            }
            System.out.println(trapRainWaters(arr));
        }
    }
    public static int trapRainWaters(int []arr){
        int n = arr.length;
        //for left arr
        int []leftArray = new int[n];
        leftArray[0] = arr[0];
        for(int i = 1;i < n; i++){
            leftArray[i] = Math.max(leftArray[i-1],arr[i]);
        }
        int []rightArray = new int[n];
        rightArray[n-1] = arr[n-1];
        for (int j = n-2; j>=0;j--){
            rightArray[j] = Math.max(rightArray[j+1],arr[j]);
        }
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum = sum + Math.min(leftArray[i],rightArray[i]) - arr[i];
        }
        return sum;
    }
}
