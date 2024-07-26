package Leetcode;

public class rotateArray189 {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70};
        int k = 3;
        rotateArray(arr, k);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void rotateArray(int []arr,int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}

//reversing k = 3