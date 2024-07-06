package Assignment3;

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int j = 0;j < size; j++){
            arr[j] = sc.nextInt();
        }
        reverse(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //reverse whole array
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
