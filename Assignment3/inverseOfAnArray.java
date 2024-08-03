package Assignment3;

import java.util.Scanner;

public class inverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int []newArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        inverseArray(arr,newArr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static void inverseArray(int []arr,int[]newArr, int n){

        for(int i = 0; i < n;i++){
            int temp = arr[i];
//            System.out.println(i);
//            System.out.println(temp);
            newArr[temp] = i;
        }
    }
}
