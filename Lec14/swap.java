package Lec14;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = {3,2,5,6,7};
        swapElement(arr, a, b);
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swapElement(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
