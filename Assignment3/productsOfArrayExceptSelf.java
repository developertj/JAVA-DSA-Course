package Assignment3;

import java.util.Scanner;

public class productsOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long [n];
        long []productArray = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        productExceptSelf(arr,productArray,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(productArray[i] + " ");
        }
    }
    public static void productExceptSelf(long []arr, long[] productArray, long n){


        for (int i = 0; i < n; i++) {
            long product = 1;
            for (int j = 0; j < n; j++) {
                if(j != i){
                    product = product * arr[j];
                    productArray[i] = product;
                }
            }
        }
    }
}
