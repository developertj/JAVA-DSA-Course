package Assignment3;

import java.util.Scanner;

public class arraysMaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxValue(arr, n));
    }
    public static int maxValue(int []arr, int n){
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
