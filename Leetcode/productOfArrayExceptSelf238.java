package Leetcode;

public class productOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int []arr = {2,3,4,6,5};
        for(int i = 0; i < arr.length; i++){
            System.out.println(product(arr)[i]);
        }

    }
    public static int []product(int []arr){
        int n = arr.length;
        int []leftArray = new int[n];
        leftArray[0] = 1;
        for(int i = 1; i < n; i++){
            leftArray[i] = leftArray[i-1] * arr[i-1];
        }
        int []rightArray = new int[n];
        rightArray[n-1] = 1;
        for(int i = n-2; i>=0;i--){
            rightArray[i] = rightArray[i+1] * arr[i+1];
        }
        int []newArray = new int[n];
        for(int i = 0; i < n; i++){
            newArray[i] = leftArray[i] * rightArray[i];
        }
        return newArray;
    }
}
