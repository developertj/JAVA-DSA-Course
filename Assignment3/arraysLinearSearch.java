package Assignment3;

import java.util.Scanner;

public class arraysLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(linearSearch(arr,n,m));
    }
    public static int linearSearch(int []arr ,int n, int m){
        for(int i = 0; i < n;i++){
            if(arr[i] == m){
                return i;
            }
        }
        return -1;
    }
}
