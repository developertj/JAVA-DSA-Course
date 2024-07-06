package Assignment3;

import java.util.Scanner;

public class sortJustZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sortZeroAndOne(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void sortZeroAndOne(int[]array,int n){
        for(int i = 1; i<n;i++){
            for(int j = 0; j < array.length-i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
