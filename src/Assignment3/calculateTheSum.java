package Assignment3;

import java.util.Scanner;

public class calculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {//array input
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        int q = sc.nextInt(); //no. of operations
        while(q--!=0){
            int x = sc.nextInt(); //operations
            for (int i = 0; i < n; i++) {
                int r = i - x;
                if(r < 0){
                    r = n + r;
                }
                arr[i] += temp[r];
            }
            for (int j = 0; j < n; j++) {
                temp[j] = arr[j];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
